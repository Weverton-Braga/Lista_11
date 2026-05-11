package Atividades.lista_11;

import java.util.Random;

public class atv_6 {
    public static void main(String[] args) {

        int[] nums = new int[12];
        Random random = new Random();

        System.out.println("O sistema vai gerar um vetor com 12 números aleatórios e mostar qual o maior e o menor: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101);
        }

        int maior = nums[0];
        int menor = nums[0];
        for (int check : nums) {
            System.out.print(check+" ");
            if (check > maior) maior = check;
            if (check < menor) menor = check;
        }
        System.out.println("\n\nO maior número é: "+maior+".");
        System.out.println("O menor número é: "+menor+".");
    }
}
