package task206;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {

        List<Integer> marksList1 = new ArrayList<>();
        marksList1.add(3);
        marksList1.add(4);
        marksList1.add(5);
        List<Integer> marksList2 = new ArrayList<>();
        marksList2.add(2);
        marksList2.add(3);
        marksList2.add(1);
        List<Integer> marksList3 = new ArrayList<>();
        marksList3.add(4);
        marksList3.add(4);
        marksList3.add(2);
        marksList3.add(3);

        Student student1 = new Student("Andrzej", 123456);
        Student student2 = new Student("Janusz", 654321);
        Student student3 = new Student("Wacław", 123321);

        Map<Student, List> studentsMap = new HashMap<>();
        studentsMap.put(student1, marksList1);
        studentsMap.put(student2, marksList2);
        studentsMap.put(student3, marksList3);

        for (Map.Entry<Student, List> entry : studentsMap.entrySet()) {
            int sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += (int) entry.getValue().get(i);
            }
            double reuslt = sum;
            System.out.println(entry.getKey() + " " + reuslt / entry.getValue().size());
        }
    }
}
