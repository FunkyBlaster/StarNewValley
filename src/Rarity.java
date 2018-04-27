public enum Rarity {
    COMMON, UNCOMMON, RARE, LEGENDARY, EXOTIC;
    //gray, green, blue, purple, red
    public Rarity getRandomRarity() {
        int random = (int) (Math.random()*5)+1;
        switch(random) {
            case(1): return COMMON;
            case(2): return UNCOMMON;
            case(3): return RARE;
            case(4): return LEGENDARY;
            case(5): return EXOTIC;
        }
        return null;
    }
}
