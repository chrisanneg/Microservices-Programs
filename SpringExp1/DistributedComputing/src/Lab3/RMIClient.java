package Lab3;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String args[]) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:1900" + "/chris");
            System.out.println("Addition answer: " + stub.add(59, 4));
        } catch (Exception e) {
        }
    }
}
