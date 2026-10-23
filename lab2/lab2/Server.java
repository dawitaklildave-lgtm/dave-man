import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.CountDownLatch;

public class Server {

    public static void main(String[] args) {

        try {

            Calculator calc = new Calculator();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("CalculatorService", calc);

            System.out.println("Calculator service is ready...");

            new CountDownLatch(1).await();

        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }

    }
}