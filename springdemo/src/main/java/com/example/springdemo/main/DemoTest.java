package com.example.springdemo.main;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoTest {
    public static void main(String[] args) {

        testListRm3();

    }

    /**
     * iterator 迭代器删除元素
     */
    public static void testListRm3(){
        List<String> list =new ArrayList<>();
        list.add("xjd");
        list.add("xjd");
        list.add("xjc");
        list.add("xj2");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if(it.next().equals("xjd")){ it.remove();}

        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * fori 遍历删除--- 会导致元素缩影变化导致删除不完全
     * 可以使用倒序删除
     */
    public static void testListRm2(){
        List<String> list =new ArrayList<>();
        list.add("xjd");
        list.add("xjd");
        list.add("xjc");
        list.add("xj2");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("xjd")) {
                list.remove(i);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * for循环删除元素报错 由于遍历中的元素序号发生变化会抛出异常
     */
    public static void testListRm(){
        List<String> list =new ArrayList<>();
        list.add("xjd");
        list.add("xjd");
        list.add("xjc");
        list.add("xj2");
        for (String s : list) {
            if (s.equals("xjd")) {
                list.remove(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * final始终执行，如果在final中renturn值的话则会把catch中的赋值改变
     * @return
     */
    public static double teeee(){
        double b = 1;
        try {
            int i =1;
            b=i/0;
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("before return ");
            b=2.6;
            return b;
        }
        finally {
            b=3.6;
            System.out.println("final sout" +
                    "");
            return b;
        }

    }
}


