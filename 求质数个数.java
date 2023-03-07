public class 求质数个数 {
    public static void main(String[] args) {
        System.out.println(getPrimeNum(4,12));

    }

    public static int getPrimeNum(int from, int to){
        int count = 0;
        for(int i = from;i <= to;i++){
            boolean flag = true;
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }else
                    continue;
                }
            if(flag == true){
                count++;
            }
        }
        return count;
    }
}
