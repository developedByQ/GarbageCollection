

public class Finalize {
    public static void main(String[] args) {

        int count;
        GarbageCollection ob = new GarbageCollection(0);

        /*
         NOTE: You may need to change the number of objects generated
         in order to force garbage collection.
        */
        for(count = 1; count < 290000; count++) {
            ob.generator(count);
        }
    }
}