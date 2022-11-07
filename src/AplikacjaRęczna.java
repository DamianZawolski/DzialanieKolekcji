import Kolekcje.Kolekcje;

import java.util.InputMismatchException;
import java.util.Scanner;

class AplikacjaReczna {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);  // Create a Scanner object
        boolean run= true;
        while (run)
        {
        try {
            System.out.println("Wybierz jedną z poniższych opcj1");
            System.out.println("1- Dodaj osobę");
            System.out.println("2- Wypisz osoby");
            System.out.println("3- Usuń osobę");
            System.out.println("4- Iterowanie");

            int opcja = skaner.nextInt();
            skaner.nextLine();

            if (1 == opcja) {
                System.out.println("Podaj imię");
                String imie = skaner.nextLine();
                Kolekcje.dodajOsobe(imie);
            } else if (2 == opcja) {
                Kolekcje.wypiszOsoby();

            } else if (3 == opcja) {
                System.out.println("Podaj imię");
                String imie = skaner.nextLine();
                Kolekcje.usunOsobe(imie);
            } else if (4 == opcja) {
                Kolekcje.iterowanie();
            }else {
                System.out.println("Błędna cyfra");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wystąpił błąd");
            run = false;
        }
}}}
