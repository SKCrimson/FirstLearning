package krivoshein.learning;

public class Box {
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private double width;
    private double height;
    private double depth;

    public double boxVolume(){
        double volume = width * height * depth;

        System.out.print("Box volume is: ");
        System.out.println(volume);

        return volume;
    }
}
