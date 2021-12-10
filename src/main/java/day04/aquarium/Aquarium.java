package day04.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    static final int CAPACITY = 20;
    private List<Fish> fishList = new ArrayList<>();


    public void addFish(Fish fish) {
        if (5 * (fishList.size() + 1) <= CAPACITY) {
            fishList.add(fish);
        } else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed() {
        for (Fish actualFish : fishList) {
            actualFish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> fatFish = new ArrayList<>();
        for (Fish actualFish : fishList) {
            if (actualFish.getWeight() > maxWeight) {
                fatFish.add(actualFish);
            }
        }
        fishList.removeAll(fatFish);
    }

    public List<String> getStatus() {
        List<String> resultList = new ArrayList<>();
        for (Fish actualFish : fishList) {
            resultList.add(actualFish.getStatus());
        }
        return resultList;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int sum = 0;
        for (Fish actualFish : fishList) {
            if (actualFish.hasMemoryLoss()) {
                sum++;
            }
        }
        return sum;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish actualFish : fishList) {
            if (actualFish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = null;
        for (Fish actualFish : fishList) {
            if (smallestFish == null || actualFish.getWeight() < smallestFish.getWeight()) {
                smallestFish = actualFish;
            }
        }
        return smallestFish;
    }
}