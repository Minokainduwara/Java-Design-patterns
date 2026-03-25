package com.factory.abstract_Factory;

public class Sedan implements car{
    @Override
    public void assemble() {
        System.out.println("Assembling a Sedan car.");
    }
}
