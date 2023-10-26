package ucu.edu.apps.flowerstore;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    // public Flower(Flower flower) {
    //     this.flowerType = flower.flowerType;
    //     this.price = flower.price;
    //     this.sepalLength = flower.sepalLength;
    //     this.color = flower.color;
    // }

    public String getColor() {
        return color.toString();
    }

    @Override
    public String toString() {
        return flowerType + "{" + "sepalLength=" + sepalLength + ", color="
                + color + ", price=" + price + '}';
    }
}