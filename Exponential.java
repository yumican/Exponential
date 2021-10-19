import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = keyboard.nextInt();
        int a = 0;
        int x = 0;
        for (int increase = 1, increase1 = 1; a <= input; increase *= 4,increase1 *= 5) {
            a++;
            System.out.print(x+". "+"Exponential number (4) : ");
            System.out.println(increase);
            System.out.print(x+". "+"Exponential number (5) : ");
            System.out.println(increase1);
            x++;
        }
    }
}
