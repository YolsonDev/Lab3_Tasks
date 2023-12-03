package Zadanie4;

public class EtykietaBreakContinue {
    public static void main(String[] args) {
        //Przykład break z etykietą
        int szukanaLiczba = 15;

        System.out.println("Zakończ program gdy znajdzie liczbe: " + szukanaLiczba);

        szukana:
        for(int i = 1; i <= 20; i++){
            for(int j = 1; j <= 20; j++){
                System.out.println("Aktualna sprawdzana liczba: " + j);
                if(j == szukanaLiczba) {
                    System.out.println("Znaleziona program się zakończy.");
                    break szukana;
                }
            }
            System.out.println("TesT");
        }

        //Przykład continue z etykietą

        pomin:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue pomin;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
