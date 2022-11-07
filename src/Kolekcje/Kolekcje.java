package Kolekcje;
import java.util.*;

public class Kolekcje {
    public static Set<String> osobyHashSet = new HashSet<>();
    public static Set<String> osobyTreeSet = new TreeSet<>();
    public static List<String> osobyArrayList = new ArrayList<>();
    public static List<String> osobyLinkedList = new LinkedList<>();
    public static void dodajOsobe(String imie) {
        osobyHashSet.add(imie);
        osobyTreeSet.add(imie);
        osobyArrayList.add(imie);
        osobyLinkedList.add(imie);
    }
    public static void usunOsobe(String imie) {
        System.out.println("Usuwam osobę: " + imie);
        System.out.println();

        osobyHashSet.remove(imie);
        osobyTreeSet.remove(imie);
        osobyArrayList.remove(imie);
        osobyLinkedList.remove(imie);
    }
    public static void iterowanie() {
        System.out.println("Prezentacja iterowania");
        System.out.println("Iterowanie po HashSet");
        for (String s : osobyHashSet) {
            System.out.println(s);
        }
        System.out.println("Iterowanie po TreeSet");
        for (String s : osobyHashSet) {
            System.out.println(s);
        }
        System.out.println("Iterowanie po ArrayList");
        for (String s : osobyArrayList) {
            System.out.println(s);
        }
        System.out.println("Iterowanie po LinkedList");
        for (String s : osobyArrayList) {
            System.out.println(s);
        }
    }
    public static void wypiszOsoby() {
        System.out.println("Wypisanie osób");
        System.out.println();
        System.out.println(osobyHashSet.size()+" Osób w HashSet");
        for(String osoba: osobyHashSet) {
            System.out.println(osoba);
        }
        System.out.println();
        System.out.println(osobyTreeSet.size()+ " Osób w TreeSet (alfabetycznie)");
        for(String name: osobyTreeSet) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(osobyArrayList.size()+ " Osób w ArrayList");
        for(String name: osobyArrayList) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(osobyLinkedList.size()+ " Osób w LinkedList");
        for(String name: osobyLinkedList) {
            System.out.println(name);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int rozmiar = osobyHashSet.size();
        System.out.println("Number of names: " + rozmiar);
        boolean isThereAnia = osobyHashSet.contains("Ania");
        System.out.println("Is Ania in this set? " + isThereAnia);

}}