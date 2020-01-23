import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String name;
        String age;
        String home;

        System.out.print("Hello. What is your name? ");
        name = scnr.next();
        System.out.print("It's nice to meet you, ");
        System.out.print(name);
        System.out.print(". How old are you? ");
        age = scnr.next();
        System.out.print("I see that you are still quite young at only ");
        System.out.print(age + ".\n");
        System.out.print("Where do you live? ");
        home = scnr.next();
        System.out.print("Wow! I've always wanted to go to " + home + ". Thanks for chatting with me. Bye!");
    }
}