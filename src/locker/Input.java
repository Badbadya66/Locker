package locker;

import java.util.Scanner;

public class Input {

    private Locker[] lockers = new Locker[10];
    private static int count;

    public void addUser2Locker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username => ");
        String username = scanner.next();
        System.out.print("Enter password => ");
        String password = scanner.next();
        lockers[count++] = new Locker(username, password);
    }

    public void inputPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username => ");
        String username = scanner.next();
        System.out.print("Enter password => ");
        String password = scanner.next();
        for(int i = 0; i < 10; i++) {
            if(lockers[i].isUserCorrect("")) {

            }
        }
    }
}
