package com.a7medkenawy.designpatternslessons.creational.singleton;

public class Singleton {

    /**
     * eager initialization
     * private static Singleton unique = new Singleton();
     */


    /**
     * lazy initialization
     */

    //volatile keyword is used to update the value in memory
    private static volatile Singleton unique;

    private Singleton() {

    }

    public static Singleton getInstance() {
//        return unique;
        if (unique == null)
            //synchronized keyword allowed to only one instance to enter to execute code in it
            synchronized (Singleton.class) {
                if (unique == null)
                    unique = new Singleton();
                else
                    return unique;
            }

        return unique;
    }
}
