import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Testing how to sort array preserving original order (previous indexes)
 */
public class MainClient {
    public static void main(String[] args) {


        System.out.println("---- END OF PROGRAM ----");

    }

    public static String order(String words) {
        return Arrays.stream(words.split(" ")).sorted(Comparator.comparing(word -> position(word))).collect(Collectors.joining(" "));
    }

    public static Integer position(String word){
        OptionalInt position;
        position = word.chars().map(p->Character.getNumericValue((char)p)).filter(p->(p>0 && p<10)).findFirst();
        return position.getAsInt();
    }

}
