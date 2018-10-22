package pl.dopierala.DependencyInjection;

/**
 * Excercise of Dependency Injection concept
 *
 */
public class DepInjectionMain {

    public static void main(String[] args) {

        Service s1 = new Service("cool service");
        Service s2 = new Service("medium service");
        Service s3 = new Service("bad service");

        Customer c1 = new Customer(s1);
        Customer c2 = new Customer(s1);
        Customer c3 = new Customer(s1);

        c1.printService();
        c1.s.setServiceName("cool service chandeg by c1.");
        c2.printService();
        c2.s.setServiceName("cool service changed by c2.");
        c3.printService();

    }
}
