import java.util.ArrayList;

public class Character {
    private ArrayList inventory;
    private ArrayList equipment;
    private int fatigue;
    private int BACKPACK;
    private int SHOES;

    public Character() {
        inventory = new ArrayList(20);
        equipment = new ArrayList(2);
        //equipment just backpack and shoes ATM; possibly armor later?
        BACKPACK = 0;
        SHOES = 1;
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
    public void addToEquipment(Equippable equippable) {

    }
    public void setEquipment(Equippable equippable, int index) {
        //backpack location zero, shoes location 1
        equipment.set(index,equippable);
    }

}
