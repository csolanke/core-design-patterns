package com.cds.patterns.singleton;

public class DateUtil {

private static DateUtil dateUtil;
    private DateUtil()
    {
     // private default constructor
    }
// this is lazy initialization for singleton
    public static DateUtil getInstance(){
       if(dateUtil==null){
           dateUtil = new DateUtil();
       }
        return  dateUtil;
    }
}
