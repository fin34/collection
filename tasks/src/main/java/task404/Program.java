package task404;

import java.util.LinkedList;

class Program {

    public static void main(String[] args) {

        LinkedList<Cannon> listOfCannon = new LinkedList<>();

        Cannon cannon1 = new Cannon(false);
        Cannon cannon2 = new Cannon(true);
        Cannon cannon3 = new Cannon(false);

        listOfCannon.add(cannon1);
        listOfCannon.add(cannon2);
        listOfCannon.add(cannon3);

        for (int i = 0; i < listOfCannon.size(); i++) {
            System.out.println("Użycie " + (i + 1) + " armaty!!!");
            listOfCannon.get(i).fire();
            System.out.println();
        }
    }
}