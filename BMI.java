import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double W;
        double H;
        System.out.println("Enter your weight(kg) : ");
        W = scn.nextDouble();
        System.out.println("Enter your height(cm) : ");
        H = scn.nextDouble();
        double B=W/((H/100)*(H/100));
        double BMI=Math.round(B*10.0)/10.0;
        System.out.println("Your BMI is : "+BMI);

        if(BMI>=24 && 27>=BMI){
            System.out.println("微胖");
        }else if(BMI<18.5){
            System.out.println("過瘦");
        }else if(BMI>=27 && BMI>=30){
            System.out.println("過胖");
        }
        else{
            System.out.println("正常範圍");
        }
    }
}