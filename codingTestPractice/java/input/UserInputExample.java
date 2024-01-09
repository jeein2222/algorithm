package codingTestPractice.java.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputExample {
    public static void main(String[] args) throws IOException {
        /*
            InputStreamReader는 바이트 스트림을 문자 스트림으로 변환하는 역할을 한다. System.in의 입력을 문자 스트림으로 변환
            BufferedReader는 입력된 문자를 버퍼에 저장하고 효율적으로 읽어오기 위한 역할.
            버퍼는 주로 RAM에 위치하며, 데이터를 효율적으로 처리하기 위한 임시 저장 공간으로 사용된다.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int userInput=0;
        boolean validInput=false;

        while(!validInput){
            try{
                System.out.print("Enter something:");
                //문자열을 입력받고 정수로 변환
                userInput = Integer.parseInt(reader.readLine());
                validInput=true;
            }catch (NumberFormatException ex){
                System.out.println("Invalid input. Please enter a valid number");

            }
        }

        System.out.println("You entered: " + userInput);
        reader.close();



    }
}
