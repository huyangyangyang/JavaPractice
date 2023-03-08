import java.util.Random;

public class 随机生成验证码 {
    public static void main(String[] args) {
        System.out.println(getVerificatrionCode());

    }

    public static String getVerificatrionCode(){
        String s1 = "";
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if(i <= 25){
                //添加小写字母
                chs[i] = (char)(97 + i);
            }else {
                //添加大写字母
                chs[i] = (char)(65 + i - 26);
            }
        }
        Random r = new Random();
        for(int i = 0; i < 4 ;i++){
            int rnum1 = r.nextInt(52);
            s1 += chs[rnum1];
        }

        int rnum2 = r.nextInt(10);

        s1 += rnum2;

        return s1;
    }
}
