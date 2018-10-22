package pl.dopierala.trash.test;

public class Machine {
    public void publicMachine(){
        Animal a = new Animal();
        a.publicAnimal();
        a.protectedAnimal();
        a.packageNoModAnimal();
    }

}
