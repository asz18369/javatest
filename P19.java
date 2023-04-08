import java.util.Scanner;
public class P19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many days do you want?");
        int total;
        total = scn.nextInt();
        if(total%7==0){
            System.out.print(total/7+" weeks");
        }else {
            System.out.print(total/7+" weeks and ");
            System.out.print(total%7+" days");
        }
    }
}

//幾周幾天