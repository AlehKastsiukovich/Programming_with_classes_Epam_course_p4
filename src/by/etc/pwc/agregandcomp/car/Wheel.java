package by.etc.pwc.agregandcomp.car;


public class Wheel {
    private String wheelBrand;
    private int dim;
    private boolean broken;

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

    public static Wheel[] createComplect(String wheelBrand, int dim, int num) {
        Wheel[] wheels = new Wheel[num];

        for (int i = 0; i < num; i++) {
            wheels[i] = new Wheel();
            wheels[i].setWheelBrand(wheelBrand);
            wheels[i].setDim(dim);
        }

        return wheels;
    }
}
