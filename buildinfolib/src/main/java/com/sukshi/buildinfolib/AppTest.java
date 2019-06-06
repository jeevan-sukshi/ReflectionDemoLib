package com.sukshi.buildinfolib;


public class AppTest {

    private int counter;

    public void printIt(){
        System.out.println("printIt() no param from lib");
    }

    public void printItString(String temp){
        System.out.println("printIt() with param String : " + temp);

    }

    public void printItInt(int temp){
        System.out.println("printIt() with param int : " + temp);

    }

    public void setCounter(int counter){
        this.counter = counter;
        System.out.println("setCounter() set counter to : " + counter);

    }

    public void printCounter(){
        System.out.println("printCounter() : " + this.counter);

    }
    public void setSomeTestInterfaceToApptest(SomeTestInterface someTestInterface){
        System.out.println("InterfaceToApptest : invoking someTestMethod ");
        someTestInterface.someTestMethod();

    }

}