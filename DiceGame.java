import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dice1 =(int)(6*Math.random()+1);
        int dice2 =(int)(6*Math.random()+1);
        System.out.println("\nWelcome to Guessing Dice number game ");
        System.out.printf("Sum of both dice numbers is %d \n",dice1+dice2);
        int guess1,guess2,count=0;
        do { 
            System.out.print("Guess number of Dice 1: ");
            guess1 = sc.nextInt();
            System.out.print("Guess number of Dice 2: ");
            guess2 = sc.nextInt();
            count++;
            if (guess1==dice1 && guess2==dice2) {
                System.out.println("Congratulation.... You win :)");
                System.out.printf("You have successfully guessed in %d attampts\n",count);
            } else {
                System.out.println(":( Try again...");
            }
        } while (guess1!=dice1 && guess2!=dice2);

        System.out.println("Thanks for playing");
        System.out.println("Developed by : Sachin kumar\n\n");
    }
}
