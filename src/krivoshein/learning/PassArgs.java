package krivoshein.learning;

public class PassArgs {
    static void vTest(int ... v){
         System.out.print("Pocet argumentu: " + v.length + " Obsah: ");

         for(int i : v)
             System.out.print(i + " ");

         System.out.println();
    }
}
