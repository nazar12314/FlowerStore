package flower.store;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public void setPrice(double flowerPrice) {
        this.price = flowerPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color.toString();
    }

    public void setColor(FlowerColor flowerColor) {
        this.color = flowerColor;
    }
}
