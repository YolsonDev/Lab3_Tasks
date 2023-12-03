package Zadanie2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Konwersja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź łańcuch znaków: ");
        String wartosc = scanner.nextLine();

        // Konwersja na int
        int intWartosc = Integer.parseInt(wartosc);
        System.out.println("Wartość int: " + intWartosc);
        // Konwersja na long
        long longWartosc = Long.parseLong(wartosc);
        System.out.println("Wartość long: " + longWartosc);
        // Konwersja na float
        float floatWartosc = Float.parseFloat(wartosc);
        System.out.println("Wartość float: " + floatWartosc);
        // Konwersja na double
        double doubleWartosc = Double.parseDouble(wartosc);
        System.out.println("Wartość float: " + doubleWartosc);

        scanner.close();
    }
}
