package pl.dopierala.CodeWars;

import java.util.TreeMap;

public class DidYouMean {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        System.out.println(dictionary.findMostSimilar("berry"));
    }
}

class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        TreeMap<Integer,String> stats = new TreeMap<>();

        for (String word : words) {
            stats.put(bestNoCHarToChange(to,word),word);
        }

        return stats.firstEntry().getValue();
    }

    private Integer bestNoCHarToChange(String base, String compare){
        Integer bestNoCharToChange = base.length();
        Integer newNoCharToChange = bestNoCharToChange;

        bestNoCharToChange = NoCharToChange(base,compare);

        //try to fit if compare is longer than base
        for (int i = 1; i <= compare.length()-base.length(); i++) {
            newNoCharToChange=NoCharToChange(base,compare.substring(i,i+base.length()));
            newNoCharToChange+=compare.length()-base.length();
            if(newNoCharToChange<bestNoCharToChange)
                bestNoCharToChange=newNoCharToChange;
        }

        //try to fit if base is longer than compare
        for (int i = 1; i <= base.length()-compare.length(); i++) {
            newNoCharToChange=NoCharToChange(base.substring(i,i+compare.length()),compare);
            newNoCharToChange+=base.length()-compare.length();
            if(newNoCharToChange<bestNoCharToChange)
                bestNoCharToChange=newNoCharToChange;
        }

        return bestNoCharToChange;
    }

    private Integer NoCharToChange(String base, String compare) {
        Integer NoCharToChange = 0;

        for (int i = 0; i < base.length(); i++) {
            if (compare.length()<=i || (base.charAt(i) != compare.charAt(i)))
                NoCharToChange++;
        }
        return NoCharToChange;
    }

}
