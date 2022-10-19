package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack fp : flowerPacks) {
            price += fp.getPrice();
        }

        return price;
    }

    public boolean hasFlower(FlowerType flower) {
        return flowerPacks
                .stream()
                .anyMatch(flowerPack -> flowerPack
                        .getFlower()
                        .getClass()
                        .getSimpleName()
                        .equalsIgnoreCase(flower.toString()));
    }
}
