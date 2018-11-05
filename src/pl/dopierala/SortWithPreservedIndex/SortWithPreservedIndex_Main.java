package pl.dopierala.SortWithPreservedIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortWithPreservedIndex_Main {

    public static void main(String[] args) {
        Double [] abArray = {4.0, 3.0, 2.0, 1.0};
        List<NoObject> lst = new ArrayList();

        lst=Arrays.stream(abArray)
                .filter(x->x>0)
                .map(x-> new NoObject(0,x))
                .collect(Collectors.toList());


        lst = IntStream
                .range(0,abArray.length)
                .mapToObj(x->new NoObject(x+1,abArray[x]))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(lst);
    }


}
