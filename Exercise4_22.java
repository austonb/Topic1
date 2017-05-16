package chapter4;
import java.util.Scanner;
public class Exercise4_22 {
private static Scanner in;

public static void main(String[] args) {
        
        in = new Scanner(System.in);
        
        System.out.print("Enter string s1: ");
        String s1 = in.nextLine();
        
        System.out.print("Enter string s2: ");
        String s2 = in.nextLine();
        
        if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s%n", s2, s1);
        }
        else{
            System.out.printf("%s is not a substring of %s%n", s2, s1);
        }
}
}
