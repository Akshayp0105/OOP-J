import java.util.Scanner;
//simple java program with basic arithematic operation are done by else if
public class simplecalc {
    public static void main(String[] args){
        System.out.println("Enter your operation(+,-,*,/): "); //to ask the user which operator he/she want to use
        Scanner scanner = new Scanner (System.in);
        char sym = scanner.next().charAt(0);
        if(sym =='+') //to chect the operation
        {
            //if it is true executing a part to add two numbers intergers and float can be used
            System.out.println("Enetr your first number: ");
            float a = scanner.nextInt();
            System.out.println("Enter your second number: ");
            float b = scanner.nextInt();
            float result = a + b;
            System.out.println("The sum is: "+result);
        } else if (sym =='-') {
            //if it is true executing  subtractiobn part
            System.out.println("Enter your first number: ");
            float a = scanner.nextInt();
            System.out.println("Enter your second number: ");
            float b = scanner.nextInt();
            float result = a - b;
            System.out.println("The difference is: "+result);
        } else if (sym =='*') {
            //if the operation is a multiplying operation
            System.out.println("Enter your first number: ");
            float a = scanner.nextInt();
            System.out.println("Enter your second number: ");
            float b = scanner.nextInt();
            float result = a * b;
            System.out.println("The product is: "+result);
        }else if (sym =='/') {
            //if the operation is a divion operation
            System.out.println("Enter your first number: ");
            float a = scanner.nextInt();

            System.out.println("Enter your second number: ");
            float b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Division by zero is not possible");

            } else {
                float result = a / b;
                System.out.println("The product is: " + result);
            }
        }else{
            //if all operator are checked the display this message
            System.out.println("Wrong input :): ");
        }


    }
}
