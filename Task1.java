import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            double num1, num2, result;
            do {
                System.out.println("Simple Calculator");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                choice = sc.nextInt();
                sc.nextLine(); 
                
                switch (choice) {
                    case 1: {
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();
                        sc.nextLine(); 
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                    }
                    
                    case 2: {
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();
                        sc.nextLine(); 
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                    }
                    
                    case 3: {
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();
                        sc.nextLine(); 
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                    }
                    
                    case 4: {
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();
                        sc.nextLine(); 
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                    }
                    
                    case 5: System.out.println("Exiting...");
                    
                    default: System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
                
            } while (choice != 5);
        }
    }
}
