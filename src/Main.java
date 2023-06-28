import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean calculateRequest;

        System.out.println("hello, I will help you with some math problems!");

        do {
            double calculateResult = calculate();
            showResult(calculateResult);

            System.out.println("Did wanna try again? (s/n)");
            String answer = sc.next();
            answer = answer.toUpperCase().trim();

            calculateRequest = answer.equals("S");

        } while(calculateRequest);

        System.out.println("Thank You!");
        sc.close();
    }

    public static double calculate() {
        ResolveProblems resolveProblems = new ResolveProblems();
        Scanner sc = new Scanner(System.in);
        double problemAnswer;

        System.out.println("""
                Pick one:\s
                  1 - Sum of Delta + Bhaskara\s
                  2 - Triangle rectangle area\s
                  3 - Trapeze area\s
                  4 - Fibonacci\s
                  5 - Binary search""");
        int choiceMath = Integer.parseInt(sc.nextLine());

        switch (choiceMath){
            case 1 -> {
                System.out.print("Enter A value: ");
                double a = Double.parseDouble(sc.nextLine());

                System.out.print("Enter B value: ");
                double b = Double.parseDouble(sc.nextLine());

                System.out.print("Enter C value: ");
                double c = Double.parseDouble(sc.nextLine());

                problemAnswer = resolveProblems.deltaBhaskara(a, b, c);
            }
            case 2 -> {
                System.out.print("Enter triangle base: ");
                double base = Double.parseDouble(sc.nextLine());

                System.out.print("Enter triangle height: ");
                double height = Double.parseDouble(sc.nextLine());

                problemAnswer = resolveProblems.triangleRectangleArea(base, height);
            }
            case 3 -> {
                System.out.print("Enter trapeze height: ");
                double height = Double.parseDouble(sc.nextLine());

                System.out.print("Enter bigger base: ");
                double bigBase = Double.parseDouble(sc.nextLine());

                System.out.print("Enter minor base: ");
                double minorBase = Double.parseDouble(sc.nextLine());

                problemAnswer = resolveProblems.trapezeArea(height, bigBase, minorBase);
            }
            case 4 -> {
                System.out.print("Enter position of Fibonacci sequence: ");
                int position = Integer.parseInt(sc.nextLine());
                problemAnswer = resolveProblems.fibonacci(position);
            }
            case 5 -> {
                System.out.print("Enter the length of the array: ");
                int arrayLength = Integer.parseInt(sc.nextLine());

                System.out.print("Enter the number you would like to find: ");
                int number = Integer.parseInt(sc.nextLine());

                problemAnswer = resolveProblems.binarySearch(arrayLength, number);
            }
            default -> {
                System.out.println("Invalid option.");
                return 0;
            }
        }

        return problemAnswer;
    }

    public static void showResult(double value) {
        System.out.println("Result: " + value);

    }
}