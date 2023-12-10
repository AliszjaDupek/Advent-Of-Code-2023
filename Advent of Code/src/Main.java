import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File("input.txt"));
        ArrayList<Integer> tablicaInt = new ArrayList<>();
            while (odczyt.nextLine() != null) {
                String text = odczyt.nextLine();
                System.out.println(text);
                ArrayList<String> tablica = new ArrayList<>();
                char[] tab = text.toCharArray();
                for (char ch : tab) {
                    if (Integer.valueOf(ch) >= 48 && Integer.valueOf(ch) <= 57) {
                        tablica.add(String.valueOf(ch));
                    }
                }
                String liczba = tablica.get(0) + tablica.get(tablica.size() - 1);
                tablica.clear();
                tablica.add(liczba);
                System.out.println(tablica);
                tablicaInt.add(Integer.valueOf(tablica.get(0)));
                System.out.println(tablicaInt);
            }
            int suma = 0;
            for(int i: tablicaInt){
                suma+=i;
            }
        
    }
}