public class Item extends Object {
    private Rarity rarity;
    private String name;
    private String description;
    private ItemType type;
    private int amount;

    public Item() {
        type =
    }
    public Item(ItemType initType, int initAmount, String initName, String initDesc, Rarity initRarity) {
        type = initType;
        amount = initAmount;
        name = initName;
        description = initDesc;
        rarity = initRarity;
    }
}
