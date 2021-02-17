public class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double volume() {
        return ((4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    public void drawFace() {
        double inRange;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                inRange = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if (inRange > radius - 0.5 && inRange < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
