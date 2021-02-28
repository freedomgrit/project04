package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是单行注释
/*
*31 查看文档说明(quick documentation) F2
32 收起所有的方法(collapse all) alt + shift + c
33 打开所有方法(expand all) alt+shift+x
34 打开代码所在硬盘文件夹(show in explorer) ctrl+shift+x
35 生成 try-catch 等(surround with) alt+shift+z
36 局部变量抽取为成员变量(introduce field) alt+shift+f
37 查找/替换(当前)
ctrl+f
38 查找(全局)
ctrl+h
39 查找文件 double Shift
40 查看类的继承结构图(Show UML Diagram) ctrl + shift + u
41 查看方法的多层重写结构(method hierarchy) ctrl+alt+h
42 添加到收藏(add to favorites) ctrl+alt+f
43 抽取方法(Extract Method) alt+shift+m
44 打开最近修改的文件(Recently Files) ctrl+E
45 关闭当前打开的代码栏(close) ctrl + w
*
* */
public class HelloWorld
{

    private int num;

    public HelloWorld() {
    }

    private static final int INITIALSIZE=10;
    public static void main(String[] args){
        ArrayList list1 = getList();
        System.out.println(list1);
    }

    public static ArrayList getList() {
        System.out.println("helloworld!!");
        ArrayList list1=new ArrayList();
        /*ArrayList list1=null;
        synchronized ()*/
        Date date = new Date();
        list1.add(0,123);
        return list1;
    }

    public void method()
    {
        num = 10;
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
