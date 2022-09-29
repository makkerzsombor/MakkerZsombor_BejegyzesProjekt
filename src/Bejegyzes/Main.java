package Bejegyzes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) throws IOException {
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
        try{
            FileReader fr = new FileReader("bejegyzesek.csv");
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while(sor != null && !sor.equals("")){
                String[] tomb = sor.split(";");
                bejegyzesek.add(new Bejegyzes(tomb[0],tomb[1]));
                sor = br.readLine();
            }
            br.close();
            fr.close();
        }catch (FileNotFoundException e){
            e.printStackTrace(System.err);
        }catch (IOException e){
            e.printStackTrace(System.err);
        }
        // 2/d
        for (int i = 0; i < (bejegyzesek.size()*20); i++) {
            int feldob = (int) (Math.random() * bejegyzesek.size());
            bejegyzesek.get(feldob).like();
        }
        // 2/e
        System.out.print("Kérem adja meg az új tartalmát a második bejegyzésnek");
        String bekertTartalom = sc.nextLine();
        bejegyzesek.get(1).setTartalom(bekertTartalom);
        // 2/f
        for (int i = 0; i < bejegyzesek.size(); i++) {
            System.out.println(bejegyzesek.get(i).toString());
        }
        // 3/a
    }
}
