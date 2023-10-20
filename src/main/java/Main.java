import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("welcome to the calculator");
        System.out.println("Enter a command:");

        Calculator calculator = new Calculator();
        int number;
        boolean stop = false;

        while (!stop) {
            Scanner object = new Scanner(System.in);
            String command = object.next();
            if(command.equals("stop")){
                stop = true;
            }
            else if (command.equals("add")) {
                int num1 = object.nextInt();
                int num2 = object.nextInt();
                number = calculator.add(num1, num2);
                System.out.println(number);
            } else if (command.equals("subtract")) {
                int num1 = object.nextInt();
                int num2 = object.nextInt();
                number = calculator.subtract(num1, num2);
                System.out.println(number);
            } else if (command.equals("multiply")) {
                int num1 = object.nextInt();
                int num2 = object.nextInt();
                number = calculator.multiply(num1, num2);
                System.out.println(number);
            } else if (command.equals("divide")) {
                int num1 = object.nextInt();
                int num2 = object.nextInt();
                number = calculator.divide(num1, num2);
                System.out.println(number);
            } else if (command.equals("fibonacci")) {
                int num1 = object.nextInt();
                number = calculator.fibonacciNumberFinder(num1);
                System.out.println(number);
            } else if (command.equals("binary")) {
                int num1 = object.nextInt();
                String binarry;
                binarry = calculator.intToBinaryNumber(num1);
                System.out.println(binarry);
            } else {
                System.out.println("NOOOOOO");
            }
        }
    }
}
