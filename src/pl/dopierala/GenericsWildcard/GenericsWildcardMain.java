package pl.dopierala.GenericsWildcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsWildcardMain {
    public static void main(String[] args) {
        List<? extends Number> a = new ArrayList<Integer>();
        List<? extends Number> b = new ArrayList<Double>();
        List<? extends Number> c = new ArrayList<Float>();
        List<? extends Number> d = new ArrayList<Number>();

        //a.add(2);
        Number number = a.get(0);
        Integer intValue = (Integer) a.get(0);


        //List<? super Number> e = new ArrayList<Integer>();
        List<? super Integer> e = new ArrayList<Number>();
        List<? super Integer> f = new ArrayList<Object>();

        e.add(3);


    }

}
