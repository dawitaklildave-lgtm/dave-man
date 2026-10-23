import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            Interfaceclass calc = (Interfaceclass) registry.lookup("CalculatorService");

            System.out.println("Add: " + calc.add(10, 5));
            System.out.println("Subtract: " + calc.subtract(10, 5));
            System.out.println("Multiply: " + calc.multiply(10, 5));
            System.out.println("Divide: " + calc.divide(10, 5));

        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }

    }
}