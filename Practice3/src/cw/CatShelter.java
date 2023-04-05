package cw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatShelter extends AnimalShelter {
    private List<Animal> catsList;

    public CatShelter() {
        this.catsList = new ArrayList<>();
    }

    public void addCat(Animal cat) {
        catsList.add(cat);
    }

    public List<Animal> getCatsList() {
        return catsList;
    }

    public void sort(AnimalComparator comparator) {
        Collections.sort(catsList, comparator);
    }

    public void print() {
        for (Animal cat : catsList) {
            System.out.println(cat);
        }
    }
}
