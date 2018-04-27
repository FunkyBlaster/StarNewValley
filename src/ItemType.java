public enum ItemType {
    CROP, ORE, FISH;
    public ItemType getRandomType() {
        int random = (int) (Math.random()*3)+1;
        switch(random) {
            case(1): return CROP;
            case(2): return ORE;
            case(3): return FISH;
        }
        return null;
    }
}
