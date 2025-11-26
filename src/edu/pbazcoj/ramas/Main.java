package edu.pbazcoj.ramas;

import java.util.Random;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Lotería Primitiva: 5 números principales (1..49) + 1 complementario
        HashSet<Integer> bolas = new HashSet<>();
        Random r = new Random();
        System.out.println("¡Que tengas uerte en el sorteo, DAM!");

        while (bolas.size() < 5) {
            bolas.add(r.nextInt(49) + 1);
            int suma = bolas.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Suma de principales: " + suma);
        }
        System.out.println("Números principales: " + bolas);
        int complementario = r.nextInt(49) + 1;
        System.out.println("Complementario: " + complementario);
        System.out.println("Cambio realizado desde GitHub");
    }
}
