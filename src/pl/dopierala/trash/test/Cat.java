package pl.dopierala.trash.test;

public class Cat extends Animal {

    public Cat(){

    }

    public void testMethodCat(){
        Animal a = new Animal();
        a.publicAnimal();
        a.protectedAnimal();
        a.packageNoModAnimal();
    }

    @Override
    void packageNoModAnimal() {
        super.packageNoModAnimal();
    }

    @Override
    protected void protectedAnimal() {
        super.protectedAnimal();
    }

    @Override
    public void publicAnimal() {
        super.publicAnimal();
    }

}
