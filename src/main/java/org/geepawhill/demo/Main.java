package org.geepawhill.demo;

import javafx.application.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        if(args.length==0) {
            Application.launch(HelloApplication.class,args);
        }
        else {
            System.out.println("Running headless application.");
        }
    }
}
