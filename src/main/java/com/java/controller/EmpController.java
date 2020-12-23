package com.java.controller;
import com.java.pojo.Department;
import com.java.pojo.Emp;
import com.java.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    //查询全部
    @RequestMapping("/empList")
    public String list(Model model){
        List<Emp> emps = empService.listEmpAll();
        model.addAttribute("empS",emps);
        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddpage(Model model){
        List<Department> emps = empService.listTypeEmpAll();
        model.addAttribute("departments",emps);
        return "emp/add";
    }
    //添加
    @PostMapping(value = "/emp")
    public String addEmp(Emp emp){
        if (empService.addEmp(emp)!=null){
            return "redirect:/empList";
        }else {
            return "<script>alert('添加失败');history.go=(-1)</script>";
        }
    }
    @GetMapping(value = "/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id,Model model){
        Emp emp = empService.getEmpByid(id);
        model.addAttribute("emps",emp);
        List<Emp> emps = empService.listEmpAll();
        model.addAttribute("departments",emps);
        return "emp/updata";
    }
    @RequestMapping("/updateEmp")
    public String upDateEmp(Emp emp){
        empService.upDate(emp);
        return "redirect:/empList";
    }


    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        empService.delete(id);
        return "redirect:/empList";
    }
   //注销
    @GetMapping(value = "/user/loginout")
    public String userLoginOut(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

}
