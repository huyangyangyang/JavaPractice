public class 迁移数组元素 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(getCopyArr(arr,len)[i]+" ");
        }
    }

    public static int[] getCopyArr(int[] arr,int len){
        int[] arr1 = new int[len];

        for (int i = 0; i < len; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
