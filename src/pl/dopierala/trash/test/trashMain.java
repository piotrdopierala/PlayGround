package pl.dopierala.trash.test;

/**
 * Just trying stuff out.
 * don't look at this code
 */
public class trashMain {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.publicAnimal();
        d.protectedAnimal();
        d.packageNoModAnimal();

        Animal a = new Animal();
    }
}
