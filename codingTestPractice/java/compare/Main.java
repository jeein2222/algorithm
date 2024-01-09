package codingTestPractice.java.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static Comparator<Teacher> comp=new Comparator<Teacher>() { //익명객체
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.className-o2.className;
        }
    };
    public static void main(String[] args) {
        Teacher t1 = new Teacher(30, 1);
        Teacher t2 = new Teacher(24, 2);

        int isBig = comp.compare(t1, t2);

        if(isBig>0){
            System.out.println("t1>t2");
        }else if (isBig==0){
            System.out.println("t1==t2");
        }else{
            System.out.println("t1<t2");
        }

    }
}
