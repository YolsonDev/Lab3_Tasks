package Zadanie9;
class Warunek{
    public boolean sprawdzCzyParzysta(int liczba){
        return liczba % 2 == 0;
    }
    public boolean sprawdzCzyDodatnia(int liczba){
        return liczba > 0;
    }
}
public class MetodyZwracajaceBoolean {
    public static void main(String[] args) {
    Warunek warunek = new Warunek();
    int liczba = 5;
    boolean warunek1 = warunek.sprawdzCzyDodatnia(liczba);
    boolean warunek2 = warunek.sprawdzCzyParzysta(liczba);

        if(warunek1 && warunek2){
            System.out.println("Liczba jest parzysta i dodatnia");
        } else if(warunek1 || warunek2) {
            System.out.println("Liczba spełnia conajmniej jeden warunek");
        }else {
            System.out.println("Liczba nie jest ani parzysta, ani dodatnia");
        }
    }
}
