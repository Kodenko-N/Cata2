import java.util.Scanner;

public class To_Interwiev_test1_String_length_compare

{
    public static void StrCompare(String str1, String str2) {
        if (str1.length() > str2.length())
        {
            System.out.println("Строка 1 длинее строки 2");
        }
        if (str1.length() < str2.length())
        {
            System.out.println("Строка 1 короче строки 2");
        }
        if (str1.length() == str2.length())
        {
            System.out.println("Строка 1 равна по длине строки 2");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Line 1 input is required");
        String str1 = sc.nextLine();
        System.out.println("Line 2 input is required");
        String str2 = sc.nextLine();
        StrCompare(str1, str2);
    }



}
