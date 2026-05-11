package Atividades.lista_11;

public class atv_1 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int save = 0;

        for (int num: nums){
            sum += num;
            System.out.println(save+" + "+num+" = "+sum);
            save = sum;
        }
    }
}
