package geekbrains.Lesson3_JavaCore_GB_Generic;

import java.util.ArrayList;

public class Box <T extends Fruit> {

   private ArrayList<T> box = new ArrayList<>();

    public float getWeight() {
        float sumWeightBox = 0.0f;
        for (T fruit : box) {
            sumWeightBox += fruit.getWeight();
        }
        return sumWeightBox;
    }

    public ArrayList<T> getProduct() {
        return box;
    }

    public void add(T fruit) throws MyBoxException {
        if (box.size() > 1) {
            if (isProductsComparable(fruit)) {
                throw new MyBoxException("А фруктик то, не тот(");
            }
        }
        box.add(fruit);
    }

    public boolean compare(Box otherBox) {
        return getWeight() > otherBox.getWeight();
    }

    public void shiftFruitToBox(Box otherBox) throws MyBoxException {
        if (isProductsComparable(otherBox)) {
            throw new MyBoxException("А фруктик то, не тот(");
        }
        for (int i = box.size() - 1; i >= 0; i--) {
            otherBox.getProduct().add(box.get(i));
            box.remove(i);
        }
    }

    public boolean isProductsComparable(Box otherBox) {
        return box.get(0).getClass().getName() != otherBox.getProduct().get(0).getClass().getName();
    }

    public boolean isProductsComparable(T fruit) {
        return box.get(0).getClass().getName() != fruit.getClass().getName();
    }

}
