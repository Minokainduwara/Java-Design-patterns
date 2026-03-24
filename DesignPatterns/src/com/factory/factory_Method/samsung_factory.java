package com.factory.factory_method;

public class samsung_factory implements phoneFactory {
    @Override
    public phone createPhone() {
        return new samsung();
    }
    
}
