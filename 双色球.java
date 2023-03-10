import java.util.Random;

public class 双色球 extends 抽奖 {
    public static void main(String[] args) {
        int[] arr1 = new int[33];
        int[] arr2 = new int[16];
        int[] arr3 = new int[7];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i+1;
        }

        getGift(arr1);
        System.out.println();
        getGift(arr2);

        for (int i = 0; i < arr3.length; i++) {
            if(i != arr3.length-1){
                arr3[i] = arr1[i];
            }else
                arr3[i] = arr2[0];
        }

        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }

    }


}
