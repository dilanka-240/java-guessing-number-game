import java.util.Scanner;

public class Play {

    public void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int guess = scan.nextInt();
        int number = (int) (Math.random() * 100);
        if (guess < number) {
            System.out.println("Too Low");
        }
        if (guess > number) {
            System.out.println("Too High");
        }
        if (guess == number) {
            System.out.println("Correct");
        }
    }
}
