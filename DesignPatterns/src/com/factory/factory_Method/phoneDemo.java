package com.factory.factory_method;

public class phoneDemo {
    public static void main(String[] args) {
        phoneFactory factory1 = new iphone_factory();
        client c1 = new client(factory1);
        phone iphone1 = c1.getPhone();
        iphone1.calling();

        phoneFactory factory2 = new samsung_factory();
        client c2 = new client(factory2);
        phone samsung1 = c2.getPhone();
        samsung1.calling();
    }
}
