package Bejegyzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {
        bejegyzesek.add(new Bejegyzes("Kovács István","Ez egy alma fa."));
        bejegyzesek.add(new Bejegyzes("Nagy Péter","Ez egy körte fa."));


    }
}
