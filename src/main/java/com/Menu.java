import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scan = new Scanner(System.in);
        Play p = new Play();
        Exit e = new Exit();
        while (true) {
            System.out.println("\n **GUESSING NUMBER GAME**");
            System.out.println("      **Main Menu**");
            System.out.println("\n1.Play");
            System.out.println("2.Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    p.play();
                    break;
                case 2:
                    e.exit();
                    break;
                default:
                    System.out.println("Invalid choice/n");
            }
        }
    }

}
