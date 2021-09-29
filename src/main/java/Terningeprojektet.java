package main.java;

import java.util.Random;

public class Terningeprojektet {
    public static void main (String[] args) {

        int die1, die2, sumtotal1=0, sum1, sumtotal2=0, sum2;

/* 1. vi skal have lavet så man trykker S for at slå ikke "s og enter"
2.så skal der vises, hvilken spiller der vinder. /FIXET
3.  evt reset på "en knap"
4. vise hvis tur det er i konsollen
5. evt flere af de "ekstra krav"
6. fixes med outprint ved point, ser forvirrende ud med 1: 1 fx. /FIXET
7. printe ud ved uafgjort, "its a tie" det kan ske jeg har set det ske :D /FIXET
8. Farve på player (Rød & Blå f.eks.)
 */
        do {
            do {
                Random rand = new Random();
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;

                System.out.println("Player 1               Terning 1: " + "Terning 2: ");
                System.out.println("                          " + die1 + "          " + die2);

                sum1 = (int) Math.floor(die1 + die2);

                if ((die1 == 1) && (die2 == 1)){
                    sumtotal1 = -2;
                }

                sumtotal1 = sumtotal1 + sum1;
                System.out.println("P1 total points: " + sumtotal1);
            } while (die1 == die2 && sumtotal1 < 40);
            System.out.println();
            do {
                Random rand = new Random();
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;

                System.out.println("Player 2              Terning 1: " + "Terning 2: ");
                System.out.println( "                          " + die1 + "          " + die2);

                sum2 = (int) Math.floor(die1 + die2);

                if ((die1 == 1) && (die2 == 1)) {
                    sumtotal2 = -2;
                }

                sumtotal2 = sumtotal2 + sum2;
                System.out.println("P2 total points: " + sumtotal2);
                System.out.println();

            } while (die1 == die2 && sumtotal2 < 40);
        } while (sumtotal1 < 40 && sumtotal2 < 40);
// Det er fixet, med sidste runde ved 40 point, og ikke ekstra runde ved dobbeltslag når man har 40.
        if (sumtotal1 < sumtotal2) {
            System.out.println("player 2 won");
        }
        if (sumtotal1 > sumtotal2) {
            System.out.println("player 1 won");
        }
        if (sumtotal1 == sumtotal2) {
            System.out.println("Its a tie");
        }
    }
}