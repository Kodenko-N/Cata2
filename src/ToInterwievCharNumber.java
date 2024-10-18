import java.util.Scanner;

public class ToInterwievCharNumber {
   static int charNumber(String str, char ch)
    {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = sc.nextLine();
        System.out.println("Введите символ для поиска. Будет использован только первый символ");
        String str2 = sc.nextLine();
        char ch = str2.charAt(0);
        System.out.println("Количество символов \"" + ch + "\" в во введенной строке равно " + charNumber(str1, ch));
    }
}
