package programming.equals;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(getClass()!=o.getClass()){
            return false;
        }

        Student s = (Student)o;
        return this.getId() == s.getId();
     }

    @Override
    public int hashCode(){
        final int PRIME=31; //소수이면서 홀수이므로
        int result=1;
        result = PRIME * result + getId();
        return result;
     }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setId(100);
        s2.setId(100);

        System.out.println(s1.equals(s2));//true

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);

        System.out.println(students);
    }
}
