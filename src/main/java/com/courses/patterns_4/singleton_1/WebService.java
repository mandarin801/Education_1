package com.courses.patterns_4.singleton_1;

/**
 * Created by VSulevskiy on 17.07.2015.
 */
public class WebService {
//eager
    private static WebService service;


    private WebService(){

    }

    public static WebService getInstance(){
        if(service==null){
            service=new WebService();
        }
        return service;
    }

    public void print() {
        System.out.println("Service");
    }
}
