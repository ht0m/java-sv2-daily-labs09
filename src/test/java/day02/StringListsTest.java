package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestlist() {
        List<String> s = Arrays.asList("abr", "aaa", "ab", "aj", "cccc", "ga","kkj","eere");
        List<String> resultList = Arrays.asList("ab", "aj", "ga");

        assertEquals(resultList, new StringLists().shortestWords(s));

    }
}