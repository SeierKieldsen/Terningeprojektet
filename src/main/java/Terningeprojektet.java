
import java.util.Random;

public class Terningeprojektet {
    public static void main (String[] args) {

        int die1, die2, sumtotal1=0, sum1, sumtotal2=0, sum2;

        do {
            do {
                Random rand = new Random();
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;

                System.out.println("P1 Terning 1: " + die1 + " P1 Terning 2: " + die2);

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

                System.out.println("P2 2 terning 1: " + die1 + " P2 Terning 2: " + die2);

                sum2 = (int) Math.floor(die1 + die2);

                if ((die1 == 1) && (die2 == 1)) {
                    sumtotal2 = -2;
                }

                sumtotal2 = sumtotal2 + sum2;
                System.out.println("P2 total points: " + sumtotal2);
                System.out.println();

            } while (die1 == die2 && sumtotal2 < 40);
        } while (sumtotal1 <= 40 && sumtotal2 <= 40);
// do og while loop der skal stoppe når en rammer 40 virker ikke endnu. Den stopper først når
// har ramt 40 pt.

    }
}