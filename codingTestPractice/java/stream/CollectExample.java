package codingTestPractice.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();

        totalList.add(new Student("james", "남", 70));
        totalList.add(new Student("john", "남" ,60));
        totalList.add(new Student("lisa", "여", 50));
        totalList.add(new Student("amy", "여",80));

        Map<String, Double> map = totalList.stream()
            .collect(Collectors.groupingBy(
                s -> s.getSex(),
                Collectors.averagingDouble(s -> s.getScore())));

        System.out.println(map);
    }
}
