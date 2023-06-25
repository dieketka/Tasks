package Lesson9;

public class Exception extends Throwable {
    public Exception(String s) {
    }

    public class MyException extends Exception{
        public MyException(String message){
            super(message);
        }
    }
}
