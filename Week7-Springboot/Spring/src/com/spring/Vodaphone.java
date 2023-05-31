package com.spring;

public class Vodaphone implements Sim{
    @Override
    public void calling() {
        System.out.println("Vodaphone calling");
    }

    @Override
    public void data() {
        System.out.println("Vodaphone data using");
    }
}
