package com.java.controller;
import com.java.dao.UserMapper;
import com.java.pojo.User;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String password ,
                        Model model, HttpSession session) {

        User user=new User(userName,password);
        User login = userMapper.login(user);
        if (login!=null){
            session.setAttribute("loginUser",login.getUserName());
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return  "index";
        }
    }
}
