package geekbrains.Lesson3_JavaCore_GB_Generic;

import java.util.Arrays;

public class Lesson3_Generic {

    public static void main(String[] args) throws MyBoxException {

//        Задача №1
        ReplacementElementArray<Integer> replacementIntegerElementArray = new ReplacementElementArray(new Integer[]{1, 2, 3});
        System.out.println(Arrays.deepToString(replacementIntegerElementArray.getReplacementElementArray()));
        replacementIntegerElementArray.doReplacementElementArray();
        System.out.println(Arrays.deepToString(replacementIntegerElementArray.getReplacementElementArray()));

        ReplacementElementArray<String> replacementStringElementArray = new ReplacementElementArray(new String[]{"1", "2", "3"});
        System.out.println(Arrays.deepToString(replacementStringElementArray.getReplacementElementArray()));
        replacementStringElementArray.doReplacementElementArray();
        System.out.println(Arrays.deepToString(replacementStringElementArray.getReplacementElementArray()));


//        Задача №2
        Apple apple = new Apple(1f);
        Orange orange = new Orange( 1.5f);

        Box box1 = new Box();
        for (int i = 0; i < 5; i++){
            box1.add(apple);
        }
        System.out.println("В первую корзинку мы положили: " + box1.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Вес первой корзинки: " + box1.getWeight());

        Box box2 = new Box();
        for (int i = 0; i < 5; i++) {
            box2.add(orange);
        }
        System.out.println("Во вторую корзинку мы положили: " + box2.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Вес второй корзинки: " + box2.getWeight());

        System.out.println("Вес первых двух корзинок: " + (box1.compare(box2) ? "равен" : "не равен"));

        Box box3 = new Box();
        for (int i = 0; i < 5; i++){
            box3.add(apple);
        }
        System.out.println("В третью корзинку мы положили: " + box3.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Вес третьей корзинки: " + box3.getWeight());


        System.out.println("Пробуем пересыпать из первой корзинки в третью.");
        try {
            box1.shiftFruitToBox(box3);
        } catch (MyBoxException exc) {
            System.out.println(exc);
        }
        System.out.println("Вес первой корзинки: " + box1.getWeight());
        System.out.println("Вес третьей корзинки: " + box3.getWeight());

        System.out.println("Пробуем пересыпать из второй корзинки в третью.");
        try {
            box2.shiftFruitToBox(box3);
        } catch (MyBoxException exc) {
            System.out.println(exc);
        }
        System.out.println("Вес второй корзинки: " + box2.getWeight());
        System.out.println("Вес третьей корзинки: " + box3.getWeight());

        System.out.println("Положим апельсины в корзинку с яблоками.");
        try {
            for (int i = 0; i < 5; i++){
                box3.add(orange);
            }
        } catch (MyBoxException exc) {
            System.out.println(exc);
        }
        System.out.println("Вес третьей корзинки: " + box3.getWeight());







    }
}
