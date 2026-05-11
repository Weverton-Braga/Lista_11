package Atividades.lista_11;

import java.util.Random;

public class atv_9 {
    public static void main(String[] args) {

        char[] letras = new char[20];
        Random rnd = new Random();
        String vogais = "AEIOU";
        int cont = 0;

        System.out.println("Letras do vetor: ");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('A' + rnd.nextInt(26));
            System.out.print(letras[i] + " ");
        }

        for (char vogaisCheck : letras) {
            if (vogais.indexOf(vogaisCheck) != -1) cont++;
        }
        System.out.println("\n\nExiste " + cont + " vogais no vetor.");
    }
}
