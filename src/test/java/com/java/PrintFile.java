package com.java;

import java.io.File;

/**
 * @author 吴泽胜
 * @FileName PrintFile
 * @date 2020-12-23 3:31 下午
 * @Software: IntelliJ IDEA
 */

public class PrintFile {

    public static void main(String[] args) {

        //和本地目录系统相关联
        File file = new File("/Volumes/MacD/IntelliJ IDEA/workspace/基于SpringBoot-JavaWeb实训课大作业/src");
        int level = 0;
        System.out.println(printLevel(level)+file.getName());
        printListFiles(file,level+1);
    }

    private static  String printLevel(int level){
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for (int i = 0; i<level;i++){
            sb.append("—");
        }
        return sb.toString();
    }

    private static void printListFiles(File file, int level){
        //file 有可能是目录，文件
        if(file.isDirectory()){
            //列出当前目录下所有文件（目录，文件）
            File[] files = file.listFiles();
            if(files !=null){
                //System.out.println("1111");
                for(File f:files){
                    System.out.println(printLevel(level)+f.getName());
                    printListFiles(f,level+1);
                }
            }
        }
    }
}