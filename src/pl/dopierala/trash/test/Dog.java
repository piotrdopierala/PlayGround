package pl.dopierala.trash.test;

public class Dog extends Animal implements Comparable<Dog> {
    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
