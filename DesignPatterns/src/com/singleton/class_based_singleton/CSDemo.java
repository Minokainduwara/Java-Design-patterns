package com.singleton.class_based_singleton;
public class CSDemo {
	public static void main(String[] args) {
        ClassSingleton cs1 = ClassSingleton.getInstance();
        ClassSingleton cs2 = ClassSingleton.getInstance();

        System.out.println("Are both instances the same? " + (cs1 == cs2));

        cs1.setInfo("Hello, Singleton!");
        System.out.println(cs2.getInfo());
    }
}
