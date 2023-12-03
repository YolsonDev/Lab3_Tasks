package Zadanie7;

public class OdwracanieTablicy {
    public static void main(String[] args) {
        int[] tablica = { 1, 2, 3, 4, 5 };
        int[] tablicaOdwrocona = new int[tablica.length];
        // Wyświetlanie tablicy
        for( int x : tablica){
            System.out.print(x + " ");
        }
        System.out.println();
        //Odwracanie Tablicy
        for(int i = 0; i < tablica.length; i++){
            tablicaOdwrocona[i] = tablica[tablica.length - 1 - i];
        }
        // Wyświetlanie tablicy odwróconej
        for( int x : tablicaOdwrocona){
            System.out.print(x + " ");
        }

    }
}
