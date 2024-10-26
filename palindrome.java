import java.util.Scanner;
//simple java program to check whether a number is palindrome or not
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }
        if (original == reversed) {
            System.out.println("It is a palindrome number."+ original);
        }else{
            System.out.println("It is not a palindrome number."+ original);
        }
        scanner.close();
    }
}
