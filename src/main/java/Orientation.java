
public enum Orientation {
    N(0), E(1), S(2), W(3);

    private int index;

    Orientation(int index) {
        this.index = index;
    }

    public Orientation turnLeft() {
        int pre = index - 1 < 0 ? index - 1 + values().length : index - 1;
        return values()[pre];
    }

    public Orientation turnRight() {
        int next = index + 1 >= values().length ? index + 1 - values().length : index + 1;
        return values()[next];
    }

    public Orientation getOrientation() {
        return values()[index];
    }
}
