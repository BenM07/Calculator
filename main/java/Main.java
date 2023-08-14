import java.util.Scanner;

public class Main {
    
    final Scanner scan = new Scanner(System.in);
    
    double inputNumber(String prompt) {
        
        double in;
        System.out.print(prompt);
        in = scan.nextDouble();
        scan.nextLine();
        
        return in;
    } // close inputDouble method
    
    String inputString(String prompt) {
        
        String in;
        System.out.print(prompt);
        in = scan.nextLine();
        
        return in;
    } // close inputString method
    
    String calculate(double a, double b, String op) {

        String fixCalc;
        double calc = 0;
        int length;
        
        switch(op) {
            case "+": calc = a + b;
            break;
            case "-": calc = a - b;
            break;
            case "×": calc = a * b;
            break;
            case "÷": calc = a / b;
            break;
        } // close switch statement
        
        fixCalc = String.valueOf(calc);
        length = fixCalc.length();
        
        
        if (fixCalc.contains(".0")) 
        fixCalc = fixCalc.substring(0, length - 2);
        
        return fixCalc;

    } // close calc method
    
    void startCalculator() {
        
        double a, b;
        String op;
        String calc;
        String result;
        
        System.out.println("-----------------");
        System.out.println("Start Calculation");
        System.out.println("-----------------");
        
        a = inputNumber("a: ");
        op = inputString("op: ");
        b = inputNumber("b: ");
        
        calc = calculate(a, b, op);
        result = String.format("result: [ %s ]", calc);
        
        System.out.println("-----------------");
        System.out.println(result);
        System.out.println("-----------------");
        
    } // close startCalculator method
    
    public static void main(String[] args) {
        
        Main main = new Main();
        main.startCalculator();
        
        
    } // close main method
    
} // close class
