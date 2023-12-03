package Zadanie11;

import java.util.Random;

class Generator {
    public int[] uzupelnijJednoWymiarowa(){
        int [] tablica = new int[20];
        Random random = new Random();
        for(int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(21);
        }
        return tablica;
    }
    public void wyswietlTablice(int[]tablica){
        System.out.println("Tablica jedno wymiarowa: ");
        for(int liczba : tablica){
            System.out.print(liczba + " ");
        }
    }
    public int[][] uzupelnijDwuWymiarowa(){
        int [][] tablica = new int[2][10];
        Random random = new Random();
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 10; j++) {
                tablica[i][j] = random.nextInt(21);
            }
        }
        return tablica;
    }
    public void wyswietlTablice(int[][]tablica){
        System.out.println("Tablica dwu wymiarowa: ");
        for(int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class UzupelnianieRandomTablicy {
    public static void main(String[] args) {
        Generator uzupelnienie = new Generator();
        int[] jednoTablica = uzupelnienie.uzupelnijJednoWymiarowa();
        uzupelnienie.wyswietlTablice(jednoTablica);

        System.out.println();

        int[][] dwuTablica = uzupelnienie.uzupelnijDwuWymiarowa();
        uzupelnienie.wyswietlTablice(dwuTablica);
    }
}
