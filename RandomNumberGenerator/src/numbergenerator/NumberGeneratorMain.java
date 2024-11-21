package numbergenerator;

import java.util.Random;
import java.util.Scanner;

public class NumberGeneratorMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Give me a new instance of the Scanner function, using the input(keyboard) */
        System.out.print(
                "Hello, I will generate 20 numbers and produce an average \nEnter a number between 200 and 2000: ");
        int min = input.nextInt();
        /*int - Integer, a 32bit number. This request will be the minimum value for our min and max random number generator*/
        System.out.print("Great! \nNow enter a number value between 200 and 2000, that is greater than " + min + ": ");
        int max = input.nextInt();
        /* The min and max variables are set, set up the randos */
        Random rand = new Random();
        int total = 0;
        /* This will be used to calculate the average */
        int ran_num = 0;
        for (int i = 20; i > 0; i--) {
            /* i stands for interval, so this is the interval variable using a boolean
             * expression telling the loop to run as long as i > 0, the for loop counts down i
             * as it runs each loop (i--) i-- is the same as i-1
             */
            ran_num = Math.abs(rand.nextInt());
            /*Math.abs makes the value absolute, so there are no negative values. */
            ran_num = (ran_num % (max - min + 1)) + min;
            total += ran_num;
            /*
             * this is the same as:
             * total = total + ran_num;
             */
            System.out.println(ran_num);
        }
        System.out.println("I generated an average of " + total / 20);
        input.close();
    }

}
