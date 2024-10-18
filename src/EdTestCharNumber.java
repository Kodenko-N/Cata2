import java.util.*;

public class EdTestCharNumber {
    public static String symbolNumber (String str){
        int l = str.length();
        int n = 0;
        System.out.println("String length is " + l);
        char[] ch = new char[l];
       ch[0] = str.charAt(0);
       int[] counter = new int[l];


        for (int i = 0; i < l; i++) {
            for (int j = 0; j <n; j++) {
                if (str.charAt(i) == ch[j])
                {
                    counter[n]++;
                    System.out.println("n = "+n);

                }
                else if (str.charAt(i) != ch[j]) {
                    ch[n] = str.charAt(i);
                    n++;
                    //System.out.println(n + " " + ch[n]);

                }


            }
        }

        
        for (int i = 0; i < l; i++) {
            System.out.println("array index " + i + " sybol is " + ch[i] + " q-ty is " + counter[i]);
        }
        String out = ("Количество уникальных элементов в строке равно " + n);
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String strIn = sc.nextLine();
        symbolNumber(strIn);
    }
}
