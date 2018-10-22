package pl.dopierala.DependencyInjection;

public class Customer {

    Service s;

    public Customer(Service s) {
        this.s = s;
    }

    public void printService(){
        System.out.println(s.getServiceName());
    }

}
