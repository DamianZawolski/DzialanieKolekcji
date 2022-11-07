import Kolekcje.Kolekcje;

public class AplikacjaTestowa {
    public static void main(String[] args){

        System.out.println("To jest aplikacja testowa, która zademonstruje działanie kolekcji");
        Kolekcje.dodajOsobe("Tomasz");
        Kolekcje.dodajOsobe("Anna");
        Kolekcje.dodajOsobe("Damian");
        Kolekcje.dodajOsobe("Krzysztof");
        Kolekcje.dodajOsobe("Anna");
        Kolekcje.dodajOsobe("Anna");
        Kolekcje.dodajOsobe("Mariusz");


        Kolekcje.wypiszOsoby();
        Kolekcje.usunOsobe("Anna");
        Kolekcje.wypiszOsoby();
        Kolekcje.iterowanie();
    }
}
