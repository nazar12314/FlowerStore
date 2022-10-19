package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {

    private final List<FlowerBucket> buckets = new ArrayList<>();

    public void addBucket(FlowerBucket flowerBucket) {
        buckets.add(flowerBucket);
    }

    public List<FlowerBucket> search(FlowerType flower) {
        return buckets.stream().filter(bucket -> bucket.hasFlower(flower)).collect(Collectors.toList());
    }
}
