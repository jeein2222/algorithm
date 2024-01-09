package codingTestPractice.java.stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        for(int i=1;i<=5;i++){
            Product product = new Product(i, "상품" + i, "멋진 회사", (int)(10000 * Math.random()));
            productList.add(product);
        }

        //객체 스트림 얻기
        Stream<Product> stream=productList.stream();
        stream.forEach(p -> System.out.println(p));

        //배열 스트림 얻기
        String[] strArray = {"a", "b", "c"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.println(item + ","));
        System.out.println();

        //숫자 범위로부터 스트림 얻기
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach( a-> System.out.print(a+", "));
        //1, 2, 3, 4, 5, 6, 7, 8, 9,

        //파일로부터 스트림 얻기
        try{
            Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
            Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
            fileStream.forEach(line -> System.out.println(line));
            fileStream.close();
        }catch (URISyntaxException ex){
            System.out.println(ex);
        }catch (IOException ex){
            System.out.println(ex);
        }

    }
}
