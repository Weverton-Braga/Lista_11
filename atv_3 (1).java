package Atividades.lista_11;

import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[15];
        boolean parCheck = false;

        System.out.println("Digite 15 números inteiros.");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("\nNúmeros pares: ");
        for (int par : nums) {
            if (par % 2 == 0) {
                System.out.println(par);
                parCheck = true;
            }
        }
        if (!parCheck) System.out.println("Não a números pares.");
        sc.close();
    }
}
