package task205;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AverageMarks {

    public static void main(String[] args) {

        List<Integer> marksOfInformatics = new ArrayList<>();
        marksOfInformatics.add(5);
        marksOfInformatics.add(3);
        marksOfInformatics.add(6);
        marksOfInformatics.add(3);
        marksOfInformatics.add(4);
        marksOfInformatics.add(5);

        Collections.sort(marksOfInformatics);
        marksOfInformatics.remove(0);
        marksOfInformatics.remove(marksOfInformatics.size()-1);

        double sum = 0.0;
        for (Integer mark:marksOfInformatics) {
            sum+=mark;
        }
        System.out.println(sum/marksOfInformatics.size());
    }
}
