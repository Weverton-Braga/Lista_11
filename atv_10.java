package Atividades.lista_11;

import java.util.Random;
import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[30];
        Random rnd = new Random();
        int cont = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(51);
            System.out.print(nums[i] + " ");
        }
        do {
            System.out.print("\n\nDigite um número de 0 a 50 para chegar quantas vezes ele aparece no vetor(Digitar um número inválido finaliza o programa): ");
            int n = sc.nextInt();
            if (n < 0 || n > 20){
                System.out.println("\nNúmero inválido digitado.\nPrograma finalizado...");
                break;
            }
            for (int check : nums){
                if (n == check) cont++;
            }
            if (cont == 0) System.out.println("\nO número "+n+" não aparece nenhuma vez.");
            else if (cont == 1) System.out.println("\nO número "+n+" aparece 1 vez.");
            else System.out.println("\nO número "+n+" aparece "+cont+" vezes.");
            cont = 0;
        } while (true);
        sc.close();
    }
}
