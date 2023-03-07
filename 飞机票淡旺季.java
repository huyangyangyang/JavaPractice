import java.util.Scanner;

public class 飞机票淡旺季 {
    public static void main(String args[]){
        double[] arr1 = getAirTickerPrice(500,200);
        System.out.println("请输入您要选择的机票类型(头等舱1，经济舱2）：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("您需要支付"+arr1[0]+"元。");
        }else {
            System.out.println("您需要支付"+arr1[1]+"元。");
        }

    }

    public static double[] getAirTickerPrice(double firstClassPrice,double ecoClassPrice){
        double[] arr = new double[2];
        System.out.println("请选择您想要购买的机票月份(1-12)：");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int month = sc.nextInt();
            if (month >= 5 && month <= 10) {
                firstClassPrice *= 0.9;
                ecoClassPrice *= 0.85;
                flag = false;
            } else if ( (11 <= month   || month <= 4)&& month < 13 && month > 0) {
                firstClassPrice *= 0.7;
                ecoClassPrice *= 0.6;
                flag = false;
            } else {
                System.out.println("您输入的月份有误！");
                System.out.println("请重新输入月份(1-12):");
                flag = true;
            }
        }
        arr[0] = firstClassPrice;
        arr[1] = ecoClassPrice;
        return arr;
    }
}
