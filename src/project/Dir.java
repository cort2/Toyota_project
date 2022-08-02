package project;

public enum Dir {
    CAMRY(5000),
    SOLARA(8000),
    HIANCE(10000),
    DYNA(12000);
    private double selfPrice;

    Dir(double selfPrice) {
        this.selfPrice = selfPrice;
    }

    public double getSelfPrice() {
        return selfPrice;
    }
}
