package Practice4.cw;

import java.util.ArrayList;
import java.util.List;

public class HomePets<T extends Animal> {
    private List<T> listPets;

    public HomePets() {
        this.listPets = new ArrayList<>();
    }

    public void addPet(T petT){
        listPets.add(petT);
    }

    public List<T> getListPets() {
        return listPets;
    }

    public void setListPets(List<T> listPets) {
        this.listPets = listPets;
    }

    @Override
    public String toString() {
        return "HomePets " + listPets;
    }
}
