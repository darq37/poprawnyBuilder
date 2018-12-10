package com.umcs;

public class Main {

    public static void main(String[] args) {
        Plik pliczek;
        Plik pliczek2;
        pliczek = new PlikBuilder()
                .setBody("lalal")
                .setHeader("heder")
                .setTag("hejo")
                .build();
        pliczek2 = new PlikBuilder()
                .setBody("lalal") // builder
                .setHeader("Wcale nie musi mieć tagów")
                .build();
        System.out.println(pliczek.toString());
        System.out.println(pliczek2.toString());
        // Generalnie builder jest po to, by można sobie stworzyć obiekt bez uzupełniania wszystkich parametrów z konstruktora.
    }
}
