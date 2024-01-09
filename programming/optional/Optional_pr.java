package programming.optional;

import java.util.Optional;

public class Optional_pr {
    public static void main(String[] args) {
        Optional<String> presentValue = Optional.of("Hello, Optional!");
        if(presentValue.isPresent()){
            System.out.println(presentValue.get()); //Hello, Optional!
        }else{
            System.out.println("No value present.");
        }

        //값이 없는 경우
        Optional<String> emptyValue = Optional.empty();
        if(emptyValue.isPresent()){
            System.out.println(emptyValue.get());
        }else{
            System.out.println("No value present.");//No value present.
        }

        //값이 있거나 없는 경우
        String data = "Nullable Data";
        Optional<String> optionalValue = Optional.ofNullable(data);
        if(optionalValue.isPresent()){
            System.out.println(optionalValue.get());//Nullable Data
        }else{
            System.out.println("No value present.");
        }

        //값이 없는 경우 기본값 사용
        String defatulData=null;
        String result = Optional.ofNullable(defatulData).orElse("No value");
        System.out.println(result);//No value

        //값이 없는 경우 예외 발생
        try{
            String nullableData=null;
            String exceptionResult = Optional.ofNullable(nullableData)
                .orElseThrow(() -> new RuntimeException("No value found."));
        }catch (RuntimeException e){
            System.out.println("Exception: "+e.getMessage());//Exception: No value found.
        }
    }
}
