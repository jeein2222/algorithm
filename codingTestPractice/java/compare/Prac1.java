package codingTestPractice.java.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Prac1 {
    public static void main(String[] args) {
        MyInteger[] arr = new MyInteger[10];

        for(int i=0;i<10;i++){
            arr[i] = new MyInteger((int)(Math.random() * 100));
        }

        System.out.print("정렬 전: ");
        for(MyInteger myInteger:arr){
            System.out.print(myInteger.value+" ");
        }

        System.out.println();

        Arrays.sort(arr);

        System.out.print("정렬 후: ");
        for(MyInteger myInteger:arr){
            System.out.print(myInteger.value+" ");
        }

        System.out.println();

        Teacher[] teachers = new Teacher[10];
        for(int i=0;i<10;i++){
            teachers[i] = new Teacher((int)(Math.random() * 100), (int)(Math.random() * 100));
        }

        Comparator<Teacher> comp = new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.className - o2.className;
            }
        };

        System.out.print("정렬 전: ");
        for(Teacher teacher:teachers){
            System.out.print(teacher.className+" ");
        }

        System.out.println();

        Arrays.sort(teachers, comp);

        System.out.print("정렬 후: ");
        for(Teacher teacher:teachers){
            System.out.print(teacher.className+" ");
        }

        System.out.println();

    }

}

class MyInteger implements Comparable<MyInteger>{
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyInteger o){
        return this.value - o.value;
    }
}

