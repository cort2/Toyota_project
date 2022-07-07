package project.details;

public class Wheel {
    private int size;
    private boolean notBrokenWheel;

    public Wheel(SizesOfWheel size, boolean notBrokenWheel) {
        this.size = size.getSize();
        this.notBrokenWheel = notBrokenWheel;
    }

    public int getSize() {
        return size;
    }

    public boolean getNotBrokenWheel() {
        return notBrokenWheel;
    }

    public void setNotBrokenWheel(boolean notBrokenWheel) {
        this.notBrokenWheel = notBrokenWheel;
    }
}
