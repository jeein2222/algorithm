package codingTestPractice.java.compare;
/*
    자기자신과 매개변수를 비교한다.
    compareTo 메서드를 반드시 구현해야 한다.
 */
public class Student implements Comparable<Student>{
    int age;
    int className;

    public Student(int age, int className) {
        this.age = age;
        this.className = className;
    }

    @Override
    public int compareTo(Student o){ //현재 객체와 매개변수 객체를 비교하여 순서 결정 -> 현재 < 매개 : -, = : 0, > : +
        if(this.age>o.age) return 1;
        else if (this.age==o.age) return 0;
        else return -1;
    }
}
