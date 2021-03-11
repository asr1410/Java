class Cylinder {
    private int radius;

    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getSurfaceArea() {
        return ((2 * 22 * radius * height) / 7.0f);
    }

    public float getVolume() {
        return ((22 * radius * radius * height) / 7.0f);
    }
}

public class AcessModifier {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(10);
        myCylinder.setRadius(10);
        // System.out.println(myCylinder.getHeight());
        // System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.getSurfaceArea());
        System.out.println(myCylinder.getVolume());
    }
}
