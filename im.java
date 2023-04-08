import java.util.Scanner;
public class im{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int i,j,k;
            /*for(i=1;i<=5;i++){
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            */
//數字斜三角
            int n=10;
            /*for(i=1;i<=n;i++)
            {
                for(j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }*/
//正三角

            /*
            int[][] ary=new int[num][num];

                for(i=0;i<ary.length;i++)
                {
                    ary[i][0]=1;
                    ary[i][i]=1;
                }
                for(i=1;i<ary.length;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        ary[i][j]=ary[i-1][j-1]+ary[i-1][j];
                    }
                    return ary;
                }
                System.out.print("輸入行列: ");
                int sum=scn.nextInt();

                int[][] ary=getTriangle(num);
                print(ary);
                */
                //巴斯卡(未完成)

                /*for(i=1;i<=10;i++){
                    
                    for(j=1;j<=j-i;j++){
                        System.out.print(" ");
                    }
                    for(j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }*/
                //*號左三角
                /* 
                for(i=1;i<=10;i++){
                    
                    for(j=i;j<10;j++){
                        System.out.print(" ");
                    }
                    for(k=1;k<=i;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                */
                //*右三角形

                /* 
                for ( i = 10; i >= 1; i--) {
            // 在每一行中打印出對應的星號數量
            for (j = i; j < 01; j++) {
                System.out.print(" "); // 打印出一個空格
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*"); // 打印出一個星號
            }
            System.out.println(); // 換行
            */
            //右半邊的倒置等邊三角形

            for ( i = 1; i <= 10; i++) {
            // 在每一行中打印出對應的星號數量
            for ( j = 1; j < i; j++) {
                System.out.print(" "); // 打印出一個空格
            }
            for ( k = i; k <= 10; k++) {
                System.out.print("*"); // 打印出一個星號
            }
            System.out.println(); // 換行
        }

        //左半邊的倒置等邊三角形
        }
    }

                
