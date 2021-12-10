package day04.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String text) {
        List<Character> resultList = new ArrayList<>();
        if (text==null) {
            throw new IllegalArgumentException("Text is null.");

        }
        for (int i = 0; i < text.length(); i++) {
            if (!resultList.contains(text.charAt(i))) {
                resultList.add(text.charAt(i));
            }
        }
        return resultList;
    }
}
