package pl.dopierala.trash.test;

import java.util.function.Supplier;

public class Animal {

    public int publicVarAnimal;
    protected int protectedVarAnimal;
    int packageNoModVarAnimal;
    private int privateVarAnimal;

    public Animal(){
        publicVarAnimal=0;
    }

    private void privateAnimal(){
    }

    void packageNoModAnimal(){
    }

    protected void protectedAnimal(){
    }


    public void publicAnimal(){
    }

    public static void publicStaticAnimal(){
    }


}
