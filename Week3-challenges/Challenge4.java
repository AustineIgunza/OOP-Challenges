import java.util.Scanner;

public class Challenge4 {
    static class InputExample{
            Scanner scan = new Scanner(System.in);
//using scanner
            public void reanNameandAge(){
                String name;
                int age;
                System.out.print("Name? ");
                name = scan.next();

                System.out.print("Age: ");
                age= scan.nextInt();
                System.out.println("Hello "+name+" you are "+age+" springs young.");
            }
}


public static void main(String[] args) {
    (new InputExample()).reanNameandAge();
}
}
