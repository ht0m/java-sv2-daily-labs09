package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void testCaesar () {
        System.out.println(new Caesar(3).encrypts("xyz"));
        System.out.println(new Caesar(3).encrypts("Never believe to Brutus"));
    }


}