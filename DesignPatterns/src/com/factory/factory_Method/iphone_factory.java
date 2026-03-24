package com.factory.factory_method;

public class iphone_factory implements phoneFactory {
    @Override
    public phone createPhone() {
        return new iphone();
    }
    
}
