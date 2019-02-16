import java.util.ArrayList;
import java.util.List;

public class Task401 {

    public static void main(String[] args) {

        List<String> companies = new ArrayList();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String example = companies.get(0);
        for (int i = 1; i <companies.size(); i++) {
            example = new StringBuilder(example).append(", ").append(companies.get(i)).toString();
        }
        System.out.println(example);
    }

}
