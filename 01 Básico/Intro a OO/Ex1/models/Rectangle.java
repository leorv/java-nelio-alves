package models;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    /**
     * @return double return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return double return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimetro() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width*width + height*height);
    }

}
