package com.du.ben;

import java.util.ArrayList;

public class MyJava {
    // main 快捷键 psvm
    public static void main(String[] args) {
        System.out.println("输出的快捷键"); //sout 输出的快捷键
        String name = "aa";
        System.out.println("name = " + name); //soutv  可显示出变量
        System.out.println("MyJava.main"); //soutm 是输出  方法的名称
        System.out.println("args = [" + args + "]");  //soutp 是输出方法的参数
        int age = 20;
        if (age <18) {
            System.out.println("未成年");
        }
        ArrayList<String> strings = new ArrayList<>(); //万能快捷键 alt+enter
                    strings.add("唐一");  // ctrl+d  复制一行
                    strings.add("唐一"); //alt+鼠标  多行编辑
                    strings.add("唐一");
                    strings.add("唐一"); //ctrl+y  撤销一行
                    //ctrl+z 撤销一步   ctrl+shift+z  是多步的撤销
        for (String string : strings) {  //itel 遍历循环的快捷键
            System.out.println("string = " + string);
        }

        //
        //创建  电脑
        Computer c1; //说明他的构造方法是 public
        c1 = new Computer();
        c1.setPrice(5555.0D);
        c1.setColor("黑色");
        c1.setTypeName("机械革命code555");
        System.out.println("c1 = "+c1);//c1 = com.du.ben.Computer@677327b6  内存地址
        //内存地址是否一样，是判断对象是否相等的依据

        Computer c2 = new Computer();
        c2.setPrice(5555.0D);
        c2.setColor("黑色");
        c2.setTypeName("机械革命code555");
        System.out.println("c2 = "+c2);

        //判断c1  c2是否相等
        System.out.println(c1 == c2);//false
        //以上为原型模式！！ 没次new 都会创建一个新对象
        //想要  对象每次 new 都为一怎么办、、

        //测试单例模式
        //Phone p1 = new Phone();  //因为：无参构造·私有化了
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 ==p2); //true

        //单例模式  分为 ：饿汉
        //                和    懒汉




    }


}
