package com.roma.automation;

import com.roma.automation.user1.Morning;
import com.roma.automation.user2.Noon;
import com.roma.automation.user3.Evening;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Enjoying already?=)");

        Morning m = new Morning();
        m.morningCoding(11);

        Noon n = new Noon();
        n.noonCoding(12);

        Evening e = new Evening();
        e.eveningCoding(18);

    }
}