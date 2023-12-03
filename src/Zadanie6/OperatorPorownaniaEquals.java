package Zadanie6;

public class OperatorPorownaniaEquals {
    public static void main(String[] args) {
        String str1 = new String("Witaj");
        String str2 = new String ("Witaj");
        String str3 = str1;
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String str4 = new String("Witaj");
        String str5 = new String ("Witaj");
        System.out.println(str1.equals((str2)));

    }
}
