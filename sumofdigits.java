import java.util.Scanner;
//simple java program to get the sum of digits
public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); //stored the input data
        int sum = 0;
        int temp = number;
        while(temp != 0) {
            sum += temp % 10;
            temp = temp / 10;

        }
        System.out.println("The sum of digit is : "+sum);
    }
}
