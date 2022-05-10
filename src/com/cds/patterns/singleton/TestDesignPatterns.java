package com.cds.patterns.singleton;

import java.util.Date;

public class TestDesignPatterns
{
    public static void main(String[] args) {
        DateUtil instance = DateUtil.getInstance();
        DateUtil instanceOne = DateUtil.getInstance();
        System.out.println(instance);
        System.out.println(instanceOne);

//        DateUtil util1 = new DateUtil();
//        DateUtil util2 = new DateUtil();
//
//        System.out.println(util1);
//        System.out.println(util2);


    }
}
