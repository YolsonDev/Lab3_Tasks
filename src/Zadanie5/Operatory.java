package Zadanie5;

public class Operatory {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = 9;

        // Testowanie operatorów
        int dzialane1 = a + b * c; // Kolejność: mnożenie, dodawanie
        int dzialane2 = (a + b) * c; // Kolejność: dodawanie w nawiasach, mnożenie
        int dzialane3 = a % b; // Reszta z dzielenia
        boolean sprawdzanie1 = a > b && b < c; // Sprawdzanie czy to prawda czy fałsz
        boolean sprawdzanie2 = a == b; // Sprawdzanie czy jest równe
        boolean sprawdzanie3 = a != b; // Sprawdzanie czy jest różne
        int inkrementacja = a++; // Postinkremetacja
        int dekrementacja = a++; // Predekrementacja


        //Wyniki w konsoli
        System.out.println("Wynik dzialanie1: " + dzialane1);
        System.out.println("Wynik dzialanie2: " + dzialane2);
        System.out.println("Wynik dzialanie3: " + dzialane3);
        System.out.println("Jest prawdziwe? " + sprawdzanie1);
        System.out.println("Jest równe? " + sprawdzanie2);
        System.out.println("Jest różne? " + sprawdzanie3);
        System.out.println("Wynik inkrementacji: " + inkrementacja);
        System.out.println("Wynik dekrementacji: " + dekrementacja);




    }
}
