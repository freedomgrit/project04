package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2021/2/28 -8:38
 * 1.IDEA中代码模板所处的位置：settings -Editor -Live Templates/Postfix Completions
 * 2.常用的模板
 */
public class TemplatesTest
{
    //模板六：prsf可生成private static final
    private static final Customer cust=new Customer();
    //变形：psf
    public static final int NUM=1;
    //变形：psfi
    public static final int NUM2=2;
    //变形：psfs
    public static final String NATION="china";
    //模板一:psvm
    public static void main(String[] args)
    {
        //模板二:sout
        System.out.println("hello!");
        //sout的变形：soutp/soutm/soutv/xxx.sout/soutv打印最近的变量，如果想要打印前一个变量，则使用num1.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1=10;
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //模板3：fori
        String[] arr=new String[]{"Tom","Jerry","HanMeiMei","Lilei"};
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板四：集合的遍历list.for
       ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        //变形:list.fori
        for (int i = 0; i <list.size(); i++) {

            
        }
        //变形：list.forr倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    public void method()
    {
        System.out.println("TemplatesTest.method");
        //模板五：ifn
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        //变形：
        if (list != null) {
            
        }
        //变形:xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
        }

    }

