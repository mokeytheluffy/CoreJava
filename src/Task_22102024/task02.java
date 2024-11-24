package Task_22102024;

import java.util.Locale;

public class task02 {
    public static void main(String[] args) {
        //Count Vowels and Consonants in a String
        //Hint for--> ch ='a'-->count++
        String a = "sjhidueoikvhewrwerwr";
        int count = 0;
        int b=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                count++;
                b= a.length()-count;
            }
        }
        System.out.println(count);
        System.out.println(b);
    }
}

