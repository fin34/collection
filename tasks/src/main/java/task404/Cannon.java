package task404;

import java.util.Scanner;

public class Cannon {

    Scanner scanner = new Scanner(System.in);
    boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {

        while (true) {
            if (loaded) {
                System.out.println("Armata wystrzeliła!");
                return;
            } else {
                System.out.println("Brak kuli w armacie!");
                System.out.println("Czy chcesz załadować kulę i wystrzelić? tak/nie");
                String answer = scanner.next();

                if (answer.equalsIgnoreCase("tak")) {
                    loaded = true;

                } else {
                    System.out.println("Armata nie wystrzeli!");
                    return;
                }
            }
        }
    }
}