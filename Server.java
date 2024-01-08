import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws Exception {
        MathC mathObj = new MathC();
	
	LocateRegistry.createRegistry(8080);

	//bind object to rmi registry
        Naming.rebind("rmi://localhost:8080/MATH", mathObj);

	// Naming.rebind("MATH", mathObj);
        System.out.println("Math Server Started");
    }
}
