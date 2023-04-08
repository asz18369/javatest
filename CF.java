import java.util.Scanner;

public class CF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度： ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("華氏溫度為：" + fahrenheit);
    }
}

//溫度轉換