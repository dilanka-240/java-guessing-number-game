import java.util.Scanner;

public class Menu {

    public void menu() {
        Play p = new Play();
        Exit e = new Exit();
        System.out.println("1.play");
        System.out.println("2.exit");
        System.out.println("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    p.play();
                    break;
                case 2:
                    e.exit();
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }

}
