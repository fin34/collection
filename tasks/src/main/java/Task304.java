import java.util.*;

public class Task304 {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Deque<String> lettersA = new ArrayDeque<>();

        for (int i = 0; i < 50 ; i++) {
            String manyA = "a";
            int number = randomNumber.nextInt(51);
            for (int j = 0; j <number ; j++) {
                manyA = new StringBuilder(manyA).append("a").toString();
            }
            lettersA.offer(manyA);
        }

        List<String> evenA = new ArrayList<>();
        List<String> oddA = new ArrayList<>();

        while (lettersA.size()>0){
            if(lettersA.peekFirst().length()%2==0){
                evenA.add(lettersA.pollFirst());
            } else {
                oddA.add(lettersA.pollFirst());
            }
        }
        System.out.println("Even:");
        for (String word:evenA) {
            System.out.println(word);
        }
        System.out.println("Odd:");
        for (String word:oddA) {
            System.out.println(word);
        }
    }
}
