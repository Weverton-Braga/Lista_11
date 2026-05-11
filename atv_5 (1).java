package Atividades.lista_11;

public class atv_5 {
    public static void main(String[] args) {

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println("Tabuada do 5:");
        for (int tab : nums) System.out.println(5 + " x " + tab + " = " + (tab * 5));
    }
}
