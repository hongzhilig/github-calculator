public class Main{
    public static void main(String[] args) {
        System.out.println("welcome to the calculator");
        System.out.println("Enter a command:");

        Calculator calculator = new Calculator();
        int number = 0;

        if (args[0].equals("add")){
            number = calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(number);
        }
        else if (args[0].equals("subtract")) {
            number = calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(number);
        }
        else if (args[0].equals("multiply")) {
            number = calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(number);
        }
        else if (args[0].equals("divide")){
            number = calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println(number);
        }
        else if (args[0].equals("fibonacci")){
            number = calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
            System.out.println(number);
        }
        else if (args[0].equals("binary")){
            String binarry;
            binarry = calculator.intToBinaryNumber(Integer.parseInt(args[1]));
            System.out.println(binarry);
        }
    }
}
