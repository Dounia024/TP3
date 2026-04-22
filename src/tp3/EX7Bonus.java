package tp3;
import java.util.Random;
import java.util.Scanner;

public class EX7Bonus {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; 
        
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int count=1;
        
        System.out.println("Devinez le nombre entre 1 et 100 !");
        
        while (guess != secret) {
            System.out.print("Votre proposition : ");
            guess = sc.nextInt();
            if (guess < secret) {
            	System.out.println("Trop petit !");
            	count++;
            }
            else if (guess > secret) {
            	System.out.println("Trop grand !");
            	count++;
            }
        }
        System.out.println("Bravo ! Le nombre était " + secret);
    }
}
