package krivoshein.learning;

public class Main {

    public static void main(String[] args) {
	    System.out.println("--- First learning app ---");

	    Box box1 = new Box(7, 3,4);
	    box1.printVolume();

	    Box box2 = new Box(10);
	    box2.printVolume();

		System.out.println(box1.equals(box2)
				? "box1 == box2"
				: "box1 != box2");
    }
}
