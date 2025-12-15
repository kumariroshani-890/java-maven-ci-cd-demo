package com.mycompany.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        printBanner();
        greetUser("Roshani");
        showDateTime();
        showMotivation();
    }

    private static void printBanner() {
        System.out.println("=================================");
        System.out.println("     JAVA MAVEN CI/CD PROJECT     ");
        System.out.println("=================================");
    }

    private static void greetUser(String name) {
        System.out.println("Hello, " + name + " 👋");
        System.out.println("Welcome to Jenkins + Maven Demo");
    }

    private static void showDateTime() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Time: " +
                LocalDateTime.now().format(formatter));
    }

    private static void showMotivation() {
        System.out.println("---------------------------------");
        System.out.println("🚀 Keep Learning DevOps!");
        System.out.println("💻 One step closer to placement!");
        System.out.println("---------------------------------");
    }
}