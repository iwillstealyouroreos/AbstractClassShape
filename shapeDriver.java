public class shapeDriver {
    public static void main(String args[]) {

        Sphere a = new Sphere(10);
        System.out.println(a.volume());
        System.out.println(a.surfaceArea());
        System.out.println(a.toString());
        a.drawFace();

        Shape b = new rectangularPrism(4.5, 4, 7);
        System.out.println(b.getWidth());
        System.out.println(b.getHeight());
        System.out.println(b.getLength());
        System.out.println(b.volume());
        System.out.println(b.surfaceArea());
        System.out.println(b.toString());
        ((rectangularPrism) b).drawFace();
    }

}
