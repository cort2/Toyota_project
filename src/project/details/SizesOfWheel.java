package project.details;

public enum SizesOfWheel {
    SIXTEEN(16),
    SEVENTEEN(17),
    TWENTY(20);

    private int size;

    SizesOfWheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
