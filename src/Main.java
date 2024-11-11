import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A program to print whether the input number is even or odd

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        }

        else {
            System.out.println("The number " + number + " is odd.");
        }

    }
}
