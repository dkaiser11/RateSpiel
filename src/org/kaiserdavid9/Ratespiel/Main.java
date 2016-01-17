package org.kaiserdavid9.Ratespiel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int loesung = 45;
        int enter;
        int tohigh = 51;
        Scanner in = new Scanner(System.in);

        System.out.println("Ratespiel");
        do {
            System.out.println("Erraten sie die Zahl von 0-" + tohigh + ":");
            enter = in.nextInt();
            System.out.println("Sie haben eingegeben: " + enter);


            if (enter == loesung) {
                System.out.println("Richtig!");
            } else if (enter < 0) {
                System.out.println("Ihre Eingabe ist kleiner als 0!");
            } else if (enter < loesung) {
                System.out.println("Ihre Eingabe ist zu klein!");
            } else if (enter > loesung) {
                System.out.println("Ihre Eingabe ist zu groß!");
            } else if (enter >= tohigh) {
                System.out.println("Ihre Eingabe ist über " + tohigh + "!");
            }
        } while (enter != loesung);

        System.out.println("Gut gemacht!");
    }

}