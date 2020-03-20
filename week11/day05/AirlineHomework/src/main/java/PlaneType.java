public enum PlaneType {
    BOEING747(333394,467),
    AIRBUSA380(560000,525),
    BOEING737(62820,526),
    WEEPLANE1(1000, 2);

    private final int weight;
    private final int capacity;

    PlaneType(int weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
