package krivoshein.learning;

public class RecTest {
    private int[] values;

    public RecTest(int i){
        values = new int[i];
        initArray(i);
    }

    private void initArray(int i){
        if(i == 0) return;
        else initArray(i -1);

        values[i-1] = i;
        System.out.println("values[" + (i - 1) + "]=" + values[i-1]);
    }
}
