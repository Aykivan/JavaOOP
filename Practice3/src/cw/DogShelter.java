package cw;

import java.util.ArrayList;
import java.util.List;

public class DogShelter extends AnimalShelter{
    private List<Animal> dogsList;

    public DogShelter() {
        this.dogsList = new ArrayList<>();
    }

    public void addDog(Animal cat) {
        dogsList.add(cat);
    }

    public void print() {
        for (Animal dog : dogsList) {
            System.out.println(dog);
        }
    }

}
