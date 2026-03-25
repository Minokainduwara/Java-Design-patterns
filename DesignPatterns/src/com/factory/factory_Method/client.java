package com.factory.factory_method;

public class client {
    private phone ph1;
    public client(phoneFactory factory) {
        ph1 = factory.createPhone();
    }

    public phone getPhone() {
        return ph1;
    }
}
