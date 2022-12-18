package basics;
import java.util.Random;
import java.util.Scanner;


public class guess_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name);

        int begin_answer = 0;
        while (begin_answer != 1){
            System.out.println("Are you ready to start?");
            System.out.println("\t[1] - Yes");
            System.out.println("\t[2] - No");
            System.out.print("\t-> ");

            begin_answer = scanner.nextInt();
        }
        

        int attempts = 0;
        Random rand = new Random();
        int secret_number = rand.nextInt(100 + 1);

        System.out.println(secret_number);

        int user_attempt = -1;

        while(user_attempt != secret_number){
            System.out.print("Enter number: ");
            user_attempt = scanner.nextInt();

            if(user_attempt != secret_number){
                attempts = attempts + 1;

                if(user_attempt > secret_number)
                    System.out.println("Wrong! Lower!");
                else
                    System.out.println("Wrong! Higher");
            }
        }

        System.out.println("Number found " + secret_number);
        System.out.println("Attempts: " + attempts);

        scanner.close();
    }
}