package org.example;

import static org.example.managers.ThreadManager.markPresence;


public class Main {

    public static void main(String[] args)  {
        try {
            markPresence();
        }
        catch (InterruptedException ex){
            System.out.println("InterruptedException");
        }

    }
}