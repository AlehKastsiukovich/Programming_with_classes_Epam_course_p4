package by.etc.agrandcomp.car;


public class Wheel {
    private String wheelBrand;
    private int dim;
    private boolean broken;

    public Wheel(String wheelBrand, int dim, boolean broken) {
        this.wheelBrand = wheelBrand;
        this.dim = dim;
        this.broken = broken;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public String getWheelBrand() {
        return wheelBrand;
    }

    public void setWheelBrand(String wheelBrand) {
        this.wheelBrand = wheelBrand;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }
}
