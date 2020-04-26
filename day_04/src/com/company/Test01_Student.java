package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Joker_Dong
 * @date 2020-4-26 19:01
 */

public class Test01_Student {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.color);
        System.out.println(p.logo);
        System.out.println(p.price);

        p.color = "black";
        p.price = 5000;
        p.logo = "iphone";

        System.out.println(p.price);
        System.out.println(p.logo);
        System.out.println(p.color);
        p.sendMessage("Teacher li");
        p.callSomebody();
    }


}
