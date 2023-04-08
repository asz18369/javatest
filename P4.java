import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入一個字元: ");
        String str = scn.next();

        scn.close();

        int i=str.charAt(0);

        final double PI=3.1415926;

        if(i>47 && i<58){
            System.out.println("輸入的字元為數字: "+str);
        }else{
            System.out.println("輸入的字元為字母: "+str);
        }
    }
}
//看識字元還是數字