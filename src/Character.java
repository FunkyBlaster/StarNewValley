import sun.awt.EventQueueItem;

import java.util.ArrayList;

public class Character {
    private ArrayList<Item> inventory;
    private ArrayList<Equippable> equipment;
    private int fatigue;
    private int BACKPACK;
    private int SHOES;
    private int xCoord;
    private int yCoord;

    public Character() {
        inventory = new ArrayList<>(20);
        equipment = new ArrayList<>(2);
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
        equipment.add(equippable);
    }
    public void setEquipment(Equippable equippable, int index) {
        //backpack location zero, shoes location 1
        equipment.set(index,equippable);
    }
    public void moveHorizontal() {
        //default move method insures constant movement and reduces stuttering (using smaller move values [currently 1 coordinate])
        xCoord++;
    }
    public void moveHorizontalManual(int x) {
        //manual method for moving, only use if needed
        xCoord = xCoord + x;
    }
    public void moveVertical() {
        //default move method insures constant movement and reduces stuttering (using smaller move values [currently 1 coordinate])
        xCoord++;
    }
    public void moveVerticalManual(int y) {
        //manual method for moving, only use if needed
        yCoord = yCoord + y;
    }
}
