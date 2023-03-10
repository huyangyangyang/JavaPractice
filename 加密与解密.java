public class 加密与解密 {
    public static void main(String args[]){
        int num1 = 1;
        System.out.println(getEncryptionNum(num1));

        int num2 = 10;
        System.out.println(getEncryptionNum(num2));

        int num3 = 1983;
        System.out.println(getEncryptionNum(num3));
        System.out.println(getDecryptionNum(getEncryptionNum(num3)));

        int num4 = 549865156;
        System.out.println(getEncryptionNum(num4));
        System.out.println(getDecryptionNum(getEncryptionNum(num4)));
    }

    public static int getEncryptionNum(int num){
        //最后return的变量要定义在循环外面
        int newNum = 0;
        while(num > 0){
            int ge = num % 10  ;
             num = num / 10;

             int newGe = (ge + 5) % 10;
             newNum = newNum * 10 + newGe;
        }
        return newNum;
    }

    public static int getDecryptionNum(int num){
        int newNum = 0;
        while(num > 0){
            int ge = num % 10;
            num = num / 10;

            int newGe = 0;
            if(ge >= 5){
                 newGe = (ge - 5) % 10;
            }else {
                 newGe = (ge + 5) % 10;
            }

            newNum = newNum * 10 + newGe;
        }
        return newNum;
    }
}
