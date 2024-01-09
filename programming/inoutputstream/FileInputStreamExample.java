package programming.inoutputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream(
                    "C:\\javaPractice\\thisIsJava\\src\\main\\java\\programming\\inoutputstream\\codestates.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i=0;
            while((i=bufferedInputStream.read())!=-1){
                System.out.println((char)i);
            }
            fileInputStream.close();

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
