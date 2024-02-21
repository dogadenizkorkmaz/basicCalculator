import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //define n1, n2, select
        int n1, n2, select;

    //define scanner
    Scanner doa = new Scanner(System.in);

        //get value from user
        System.out.println("Enter Firs Number :");
        n1 = doa.nextInt();

        System.out.println("Enter Second Number :");
        n2 = doa.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        select = doa.nextInt();

        //actions to take based on input
        switch (select) {

            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Substraction: " + (n1 - n2));
            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
            case 4:
                if (n2 != 0) //Converted the error to a warning
                    System.out.println("Division: " + (n1 / n2));
                else
                    System.out.println("You cannot divide a number by 0!");
                break;
            default:
                System.out.println("You made the wrong choice. Please try again.!");


        }
    }
}
