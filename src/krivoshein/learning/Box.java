package krivoshein.learning;

public class Box {

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        volume = width * height * depth;
    }
    public Box(double len) {
        width = height = depth = len;
        volume = width * height * depth;
    }
    public Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    protected double width;
    protected double height;
    protected double depth;

    protected double volume;

    public boolean equals(Box box) {
        if (this.width == box.width && this.height == box.height && this.depth == box.depth)
            return true;

        return false;
    }

    public double boxVolume() {
        return volume;
    }

    public void printVolume() {
        System.out.println("Box volume is: " + volume);
    }
}
