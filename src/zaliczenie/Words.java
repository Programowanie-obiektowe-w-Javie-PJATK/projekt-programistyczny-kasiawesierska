package zaliczenie;

import java.util.Random;
import java.util.Scanner;

public class Words {
    String[] EasyWords = {"TEST", "KOD", "STYL", "KLASA", "OBIEKT", "BLOK", "IMPORT", "LISTA", "TYP", "STOS"};  //tablica ze słowami
    String[] MidiWords = {"WARUNEK", "INTERFEJS", "PAKIET", "KOLEKCJA", "APLIKACJA", "PARAMETR", "TABLICA", "LAMBDA", "HIERARCHIA", "ZASADY"};
    String[] HardWords = {"DEINKREMENTACJA", "INKREMENTACJA", "POLIANDROM", "DZIEDZICZENIE", "REPOZYTORIUM", "POLIMORFIZM", "KONSTRUKTOR", "DOKUMENTACJA", "HERMETYZACJA", "REFERENCJA"};

    public String getRandomEasyWord(String word) {
        Random random = new Random();
        return word = EasyWords[random.nextInt(EasyWords.length)];
    }

    public String getRandomMidiWord(String word) {
        Random random2 = new Random();
        return word = MidiWords[random2.nextInt(MidiWords.length)];
    }

    public String getRandomHardWord(String word) {
        Random random3 = new Random();
        return word = HardWords[random3.nextInt(HardWords.length)];
    }
}