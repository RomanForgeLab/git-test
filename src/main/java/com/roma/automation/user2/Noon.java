package com.roma.automation.user2;

public class Noon {

    public void noonCoding(int time) {
        boolean hungry = false;
        while (!hungry) {
            System.out.println("Coding-coding-coding!");
            System.out.println("Focus-focus-focus");
            System.out.println("Time is " + time + " mt");
            time++;
            if (time > 17) {
                hungry = true;
            }
            ;
        }
    }

}
