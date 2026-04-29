package com.roma.automation.user3;

public class Evening {

    public  void eveningCoding(int time){
        boolean isCoffeeHot = true;
        while (isCoffeeHot) {
            System.out.println("Coding-coding-coding!");
            System.out.println("Focus-focus-focus");
            System.out.println("Time is " + time + " KEEP COOOOOOOOODING!!!");
            time++;
            if (time > 23) isCoffeeHot = false;
        }
    }
}
