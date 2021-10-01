package main.java;

import java.util.Random;
import java.util.Scanner;

public class Terningeprojektet {
    public static void main (String[] args) {

        int die1, die2, sumtotal1=0, sum1, sumtotal2=0, sum2;


        //spil vejledning
        System.out.println("Player 1 press a+enter and Player 2 press l+enter to roll dices");
        System.out.println("If one player presses enter on a wrong letter then press the right letter 2 times to continue.");

        //do loop rundt om begge spillere
        do {

            //input for at Player 1 kan slå
            Scanner in = new Scanner(System.in);
            String type = in.next();
            if (type.equalsIgnoreCase("a")) {

                //do loop om Player 1 tur
                do {
                    Random rand = new Random();
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;

                    System.out.println("Player 1      " + "  Terning 1: " + "Terning 2: ");
                    System.out.println("                    " + die1 + "          " + die2);

                    sum1 = (int) Math.floor(die1 + die2);

                    if ((die1 == 1) && (die2 == 1)) {
                        sumtotal1 = -2;
                    }

                    sumtotal1 = sumtotal1 + sum1;
                    System.out.println("Player 1 "  + "total points:  " + sumtotal1);

                }
                while (die1 == die2 && sumtotal1 < 40);
            }
            // input for at Player 2 kan slå
            System.out.println();
            Scanner in1 = new Scanner(System.in);
            String type1 = in1.next();
            if (type1.equalsIgnoreCase("l")) {

                // do loop om Player 2's tur
                do {

                    Random rand = new Random();
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;

                    System.out.println("Player 2       " + " Terning 1: " + "Terning 2: ");
                    System.out.println("                    " + die1 + "          " + die2);

                    sum2 = (int) Math.floor(die1 + die2);

                    if ((die1 == 1) && (die2 == 1)) {
                        sumtotal2 = -2;
                    }

                    sumtotal2 = sumtotal2 + sum2;
                    System.out.println("Player 2 "  + " total points: " + sumtotal2);

                    System.out.println();

                } while (die1 == die2 && sumtotal2 < 40);

            }
        }while (sumtotal1 < 40 && sumtotal2 < 40) ;

        //Output hvis Player 1 vinder, Player 2 vinder eller det bliver uafgjort
        if (sumtotal1 < sumtotal2) {
            System.out.println("Player 2 won with: " + sumtotal2 + " Points");
        }
        if (sumtotal1 > sumtotal2) {
            System.out.println("Player 1 won with: " + sumtotal1 + " Points");
        }
        if (sumtotal1 == sumtotal2) {
            System.out.println("Its a tie");
        }
    }
}