package com.roma.automation.user1;

public class Morning {
    public static void main(String[] args) {

    }
    public  void morningCoding(int time){
        boolean isCoffeeHot = true;
        while (isCoffeeHot) {
            System.out.println("Coding-coding-coding!");
            System.out.println("Focus-focus-focus");
            System.out.println("Time is " + time + " am");
            time++;
            if (time > 11) isCoffeeHot = false;
        }
    }
}
