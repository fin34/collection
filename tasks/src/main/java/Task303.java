import java.util.Random;

public class Task303 {

    public static void main(String[] args) {

        int sumaA = 1000;
        int sumaB = 0;
        int counter = 0;

        while (sumaA>sumaB){
            Random randomNumber = new Random();
            sumaA+=randomNumber.nextInt(10);
            sumaB+=randomNumber.nextInt(50);
            counter++;
            System.out.println("Jest to pętla numer: " + counter + " sumaA wynosi: " + sumaA + " sumaB wynosi: " + sumaB);
        }
        System.out.println("sumaB jest większa od sumaA");
    }
}
