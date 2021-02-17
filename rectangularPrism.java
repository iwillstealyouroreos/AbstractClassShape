public class rectangularPrism extends Shape {

    static double width;
    static double length;
    static double height;

    public rectangularPrism(double w, double l, double h) {
       super(l, w, h);

    }
    @Override
    public double surfaceArea() {

        return 2 * ((getLength() * getWidth()) + ((getHeight() * getLength()) + ((getWidth() * getHeight()))));
    }

    @Override
    public double volume() {
        return (getWidth() * getLength() * getHeight());
    }

    @Override
    public String toString() {
       
        return "Width: " + getWidth() + "\n" + "Height: " + getHeight() + "\n" + "Length: " + getLength();
    }

    public void drawFace(){
        for(int i = 1; i <= getHeight(); i++){
            for(int j = 1; j <= getLength(); j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


}
