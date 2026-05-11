package Atividades.lista_11;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[3];
        double sum = 0;
        int cont = 0;

        System.out.println("Digite 10 números reais.");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextDouble();
        }
        for (double numsSum : nums) sum += numsSum;
        double media = sum / nums.length;
        System.out.println("A média dos números é: " + media);
        for (double check : nums) if (check > media) cont++;
        if (cont>0) System.out.println(cont+ " número(s) maiores que a média.");
    }
}

