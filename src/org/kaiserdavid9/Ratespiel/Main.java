package org.kaiserdavid9.Ratespiel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int loesung = 45;
        int eingabe;
        int tohigh = 51;
        Scanner in = new Scanner(System.in);

        System.out.println("Ratespiel");
        do {
            System.out.println("Erraten sie die Zahl von 0-" + tohigh + ":");
            eingabe = in.nextInt();
            System.out.println("Sie haben eingegeben: " + eingabe);


            if (eingabe == loesung) {
                System.out.println("Richtig!");
            } else if (eingabe < 0) {
                System.out.println("Ihre Eingabe ist kleiner als 0!");
            } else if (eingabe < loesung) {
                System.out.println("Ihre Eingabe ist zu klein!");
            } else if (eingabe > loesung) {
                System.out.println("Ihre Eingabe ist zu groß!");
            } else if (eingabe >= tohigh) {
                System.out.println("Ihre Eingabe ist über " + tohigh + "!");
            }
        } while (eingabe != loesung);

        System.out.println("Gut gemacht!");
    }

}