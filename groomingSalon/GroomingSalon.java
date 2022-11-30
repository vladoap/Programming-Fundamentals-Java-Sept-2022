package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    // инциализиране на лист data от клас Pet който съхранява обекти Pets.
    private List<Pet> data;
    private int capacity;

    public GroomingSalon (int capacity) {
        this.capacity = capacity;
        // създаване на нов arrayList за обекти Pet
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
       // StringBuilder клас за апендване на стрингове от for цикъл
        StringBuilder sb = new StringBuilder("The grooming salon has the following clients:" + "\n");
        for (Pet pet : this.data) {
            sb.append(pet.getName());
            sb.append(" ");
            sb.append(pet.getOwner());
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();

    }


}
