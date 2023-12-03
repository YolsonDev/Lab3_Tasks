package Zadanie10;

import java.util.Scanner;

public class DzialaniaArytmetyczne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza licze: ");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj druga licze: ");
        int liczba2 = scanner.nextInt();

        System.out.println("Dodawanie: " + (liczba1 + liczba2));
        System.out.println("Odejmowanie: " + (liczba1 - liczba2));
        System.out.println("Mnożenie: " + (liczba1 * liczba2));
        System.out.println("Dzielenie: " + (liczba1 / liczba2));
        System.out.println("Reszta z dzielenia: " + (liczba1 % liczba2));
        System.out.println("Czy liczba 1 jest większa równa od drugiej?  " + (liczba1 >= liczba2));
        System.out.println("Czy liczby są równe? " + (liczba1 == liczba2));

    }
}
