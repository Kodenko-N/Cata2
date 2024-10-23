package Practice;
import java.util.Scanner;
public class NOfW {

    static int words(String strIn){
        int number = 0;
        int n = 0;
        String out = strIn.trim();
            while ( n!=-1){
            out = out.trim();
            n = out.indexOf(' ');
            out = out.substring(n+1, out.length());
            number++;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a sentence");
        String str = sc.nextLine();
        System.out.println("Number of words here is " + words(str));
    }


}
