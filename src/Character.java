import java.util.ArrayList;

public class Character {
    private ArrayList inventory;
    private ArrayList equipment;
    private int fatigue;

    public Character() {
        inventory = new ArrayList(20);
        equipment = new ArrayList(2);
        //equipment just backpack and shoes ATM; possibly armor later?
    }
    public void decreaseFatigue(int decrement) {
        fatigue = fatigue-decrement;
    }
    public void setFatigue(int value) {
        fatigue = value;
    }
    public void removeFromInventory(int index)  {
        inventory.remove(index);
    }
    public void addToInventory(Item item) {
        inventory.add(item);
    }
    public void setInventoryLocation(Item item, int index) {
        inventory.set(index, item);
    }
    public void setEquipment(Equippable item, int index) {
        //backpack location one, shoes location 2
    }
}
