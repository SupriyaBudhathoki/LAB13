import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception {
        Mathl mathObj = (Mathl) Naming.lookup("rmi://localhost:8080/MATH");

        // Call functions of the MathC object
        // int resultAdd = mathObj.add(7, 5);
        // System.out.println("Addition: " + resultAdd);

        int resultSubtract = mathObj.subtract(10, 5);
        System.out.println("Subtraction: " + resultSubtract);

        int resultMultiply = mathObj.multiply(3, 4);
        System.out.println("Multiplication: " + resultMultiply);

        float resultDivide = mathObj.divide(8.0f, 2.0f);
        System.out.println("Division: " + resultDivide);

        int resultFactorial = mathObj.factorial(5);
        System.out.println("Factorial: " + resultFactorial);
    }
}
