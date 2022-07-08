package project.details;

public class Wheel {
    private SizesOfWheel size;
    private boolean notBrokenWheel;

    public Wheel(SizesOfWheel size, boolean notBrokenWheel) {
        this.size = size;
        this.notBrokenWheel = notBrokenWheel;
    }

    public SizesOfWheel getSize() {
        return size;
    }

    public boolean getNotBrokenWheel() {
        return notBrokenWheel;
    }

    public void setNotBrokenWheel(boolean notBrokenWheel) {
        this.notBrokenWheel = notBrokenWheel;
    }
}
