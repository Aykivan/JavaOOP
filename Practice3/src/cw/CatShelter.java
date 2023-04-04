package cw;

import java.util.ArrayList;
import java.util.List;

public class CatShelter extends AnimalShelter {
    private List<Animal> catsList;

    public CatShelter() {
        this.catsList = new ArrayList<>();
    }

    public void addCat(Animal cat) {
        catsList.add(cat);
    }

    public void print() {
        for (Animal cat : catsList) {
            System.out.println(cat);
        }
    }

}
