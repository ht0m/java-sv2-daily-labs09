package day04.owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

    List<String> owls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    public int getNumberOfOwls(String county) {
        for (String actual : owls) {
            String[] splitted = actual.split("=");
            if (splitted[0].equals(county)) {
                return Integer.parseInt(splitted[1]);
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int sum = 0;
        for (String actual : owls) {
            String[] splitted = actual.split("=");
            sum += Integer.parseInt(splitted[1]);
        }
        return sum;
    }
}
