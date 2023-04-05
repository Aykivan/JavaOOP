package cw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Создать классы cat и dog
 * Для них создать класс AnimalShelter с наследниками для cat и dog
 * Добавить возможность сравнения животных между собой и итерации по ним.
 */

public class main {
    public static void main(String[] args) {

        CatShelter catShelter = new CatShelter();
        DogShelter dogShelter = new DogShelter();
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) catShelter.addCat(new Cat("name" + i, i * 2, i * 3));
            else dogShelter.addDog(new Dog("name" + i, i * 3, i * 4));
        }

        catShelter.print();
        System.out.println();
        dogShelter.print();

        catShelter.sort(new AnimalComparator());
        dogShelter.sort(new AnimalComparator());

        System.out.println("--------------------------------------");

        catShelter.print();
        System.out.println();
        dogShelter.print();
    }
}