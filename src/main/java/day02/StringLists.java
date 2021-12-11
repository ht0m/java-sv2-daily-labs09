package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words) {
        List<String> resultList = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String actual : words) {
            if (actual.length() < minLength) {
                resultList.clear();
                minLength = actual.length();
            }
            if (actual.length() == minLength) {
                resultList.add(actual);
            }
        }
        return resultList;
    }
}
