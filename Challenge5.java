import java.util.*;
public class Challenge5 {
//Using while loop
    static class HelloTillStop {
        Scanner sc = new Scanner(System.in);

        void showHello() {
            String word;

            System.out.println("For Hello type 'h', anything else to stop: ");
            word = sc.next(); //

            while ("h".equals(word)) {
                System.out.println("Hello");
                word = sc.next();
            }
        }


    }
    public static void main(String[] args) {
        HelloTillStop hello = new HelloTillStop();
        hello.showHello();
    }
}
