package Bejegyzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {
        // 2/a
        bejegyzesek.add(new Bejegyzes("Kovács István","Ez egy alma fa."));
        bejegyzesek.add(new Bejegyzes("Nagy Péter","Ez egy körte fa."));

        // 2/b
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg, hohy mennyi új bejegyzést szeretne hozzáadni az eddigi listához: ");
        int bekertszam = sc.nextInt();
        sc.nextLine();
        if (bekertszam < 0){
            System.out.println("Rossz számot adott meg a szám csak egy természetes szám lehet.");
        }else{
            for (int i = 0; i < bekertszam; i++) {
                System.out.print("Kérem adja meg a szerzőt: ");
                String szerzo = sc.nextLine();
                System.out.print("Kérem adja meg a tartalmat: ");
                String tartalom = sc.nextLine();
                bejegyzesek.add(new Bejegyzes(szerzo,tartalom));
            }
        }
        // 2/c

    }
}
