import java.util.Scanner;
public class P18{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r;
        System.out.println("輸入圓球半徑:");
        r = scn.nextInt();
        double PI = 3.14159;
        double A=(4/3f)*PI*r*r*r;

        System.out.println("圓球體積為: "+A);
    }
}

//面積