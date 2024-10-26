import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num2 == 0)
        {
            System.out.println("Division by zero");
        }
        else{
            int divi = num1/num2;


            System.out.println("Divison value is  : "+ divi);
        }
    }
}
