package task405;

import java.util.LinkedList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Clock clock = new Clock(11, 34);
        Clock clock1 = new Clock(10, 59);

        List<Clock> listClock = new LinkedList<>();
        listClock.add(clock);
        listClock.add(clock1);

        for (int i = 0; i <listClock.size() ; i++) {
            listClock.get(i).setTimeOnClock(listClock.get(i).getTimeOnClock().plusMinutes(1));
        }
        System.out.println("One minute ahead:");
        System.out.println(listClock);
    }
}
