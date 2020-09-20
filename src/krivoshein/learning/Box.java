package krivoshein.learning;

public class Box {
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

    private double width;
    private double height;
    private double depth;

    private double volume;

    public boolean equals(Box box)
    {
        if(this.width == box.width && this.height == box.height && this.depth == box.depth)
            return true;

        return false;
    }

    public double boxVolume(){
        return volume;
    }
    public void printVolume(){
        System.out.println("Box volume is: " + volume);
    }
}
