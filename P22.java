import java.util.Scanner;
public class P22 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a letter ");
        
        char letter = input.next().charAt(0);
        int order = (int) Character.toUpperCase(letter) - 64;


        System.out.print("The letter "+ letter + "number is "+ order);

    }
}

//Scanner字母 然後找出是第幾位