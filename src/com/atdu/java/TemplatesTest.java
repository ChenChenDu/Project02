package com.atdu.java;/*
@author  要寻一缕光
@date  2021/3/14 - 21:09
*/

import com.atdu.bean.Customer;
import com.atdu.bean.Person;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class TemplatesTest {
    private static final Customer cust =new Customer();
    public static final Person per=new Person();
    public static void main(String[] args) {  //psvm
        System.out.println("hello");                 //sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
      method();
    }
    public static void method(){
        int a=10;
        int b=20;
        System.out.println("b = " + b);
        System.out.println("TemplatesTest.method");
        System.out.println("a = " + a);
        System.out.println(a);

        String[] arr=new String[]{"Tom","Jerry","Me"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }

    }
}
