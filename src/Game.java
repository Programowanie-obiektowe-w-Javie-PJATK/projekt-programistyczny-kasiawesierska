import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    static public void zgadywanie(String word1, int chance) {
        char[] scaner = new char[word1.length()]; // przypisuje do zmiennej długość słowa
        int i = 0;
        while (i < word1.length()) {
            scaner[i] = '-';
            if (word1.charAt(i) == ' ') { //zwraca znak znajdujacy sie pod wskazanym indeksem
                scaner[i] = ' ';
            }
            i++;
        }
        System.out.println(scaner);
        System.out.println("Pozostało żyć = " + chance);

        Scanner s = new Scanner (System.in); // wczytywanie liter
        ArrayList<Character> l = new ArrayList <Character> (); //tu wpisywac bedziemy litery

        while (chance >0) {
            char x=s.next().charAt(0); // znak wczytywany przez uzytkownika
            if(l.contains(x)) {
                System.out.println("Powtórzony znak");
                continue;  // powtorzenie znaku + petla kontynuowana dalej
            }
            l.add(x);


            if (word1.contains(x+" ")) {
                for (int y=0; y<word1.length(); y++) {  //petal sprawdza indeksy
                    if (word1.charAt(y)==x) { //zamiana znaku '-'
                        scaner[y]=x;  //na litere
                    }
                }
            }
            else {
                chance--;  //inktementacja zmiennej gdy błędne litery
            }

            if (word1.equals(String.valueOf(scaner))) { //  sprawdza czy wygrana
                System.out.println(scaner);
                System.out.println("Zgadłeś! Wygrałeś!");
                break; //przerywa petle
            }
            System.out.println(scaner);
            System.out.println("Pozostało żyć = " + chance);
        }

        if (chance ==0) {
            System.out.println("Koniec szans, przegrałeś"); //zero szans = przegrana
        }


    }


    public void man_death()
    {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   o");
        System.out.println("|  /|\\"); //why the double \\, because the \ has special meaning
        System.out.println("|  / \\"); //and so using 2 tell Java to just print the 2nd
    }

    public void man_0() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   ");
        System.out.println("|   "); //why the double \\, because the \ has special meaning
        System.out.println("|   "); //and so using 2 tell Java to just print the 2nd
    }

    public void man_1() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   o");
        System.out.println("|    "); //why the double \\, because the \ has special meaning
        System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }

    public void man_2() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   o");
        System.out.println("|   | "); //why the double \\, because the \ has special meaning
        System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }

    public void man_3() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   o");
        System.out.println("|  /| "); //why the double \\, because the \ has special meaning
        System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }

    public void man_4() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   o");
        System.out.println("|  /|\\ "); //why the double \\, because the \ has special meaning
        System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }

    public void man_5() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("|   o");
        System.out.println("|  /|\\ "); //why the double \\, because the \ has special meaning
        System.out.println("|    \\"); //and so using 2 tell Java to just print the 2nd
    }

    public static void main(String[] args) {
        System.out.println("GRA WISIELEC");
        System.out.println("Wybierz poziom");
        System.out.println("1.Łatwy");
        System.out.println("2.Średni");
        System.out.println("3.Trudny ");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        String word1 = " TEST";  //słowo
        String word2 = " WARUNEK";  //słowo
        String word3 = " DEINKREMENTACJA";  //słowo
        int chance = 5;  // ilość żyć
        switch (level) {
            case 1:
                System.out.println("Poziom łatwy");
                zgadywanie(word1, chance);

                break;
            case 2:
                System.out.println("Poziom średni");
                zgadywanie(word2, chance);

                break;
            default:
                System.out.println("Poziom trudny");
                zgadywanie(word3, chance);

        }

    }
}