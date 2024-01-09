package codingTestPractice.java.generic;

public class GenericExample {

    public static <T extends Number> boolean compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return v1==v2;
    }
    public static void main(String[] args) {
        boolean result1 = compare(10, 10);
        System.out.println(result1); //true

        boolean result2 = compare(10.0, 20.2);
        System.out.println(result2); //false

        // boolean result3 = compare("str1", "str2");
    }
}
