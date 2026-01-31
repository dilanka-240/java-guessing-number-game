import java.util.Scanner;

public class Play {

    public void play() {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int number = (int) (Math.random() * 100);
        while (guess != number) {
            System.out.print("\nGuess the number between 1 to 100: ");
            guess = scan.nextInt();
            if (guess < number) {
                System.out.println("Too Low\n");
            }
            if (guess > number) {
                System.out.println("Too High\n");
            }
            if (guess == number) {
                System.out.println("\n**Congratulations! your answe is correct**");
            }

        }
    }
}
