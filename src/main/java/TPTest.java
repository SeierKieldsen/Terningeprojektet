
import java.util.Random;

public class TPTest {

    public static void main(String[] args) {



        int die1, die2, sumtotal1 = 0, sum1, sumtotal2 = 0, sum2;
        int count = 0;
        int et = 0,to = 0 ,tre = 0 ,fire = 0 ,fem = 0 ,seks = 0;



        do {

            Random rand = new Random();
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            System.out.println("P1 Terning 1: " + die1 + " P1 Terning 2: " + die2);

            switch (die1) {
                case 1:
                    et++;
                    break;
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;


            }
            count = count + 1;
        }while (count < 1000);

        System.out.println("antal 1'ere: " + et + " antal 2'ere " + to + " antal 3'ere " + tre + " antal 4'ere " + fire + " antal 5'ere " + fem + " antal 6'ere " + seks);
    }
}

