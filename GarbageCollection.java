public class GarbageCollection {

    int x;

    GarbageCollection(int i) {
        x = i;
    }

    // called when object is recycled
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }


    // generates an object that's immediately destroyed
    void generator(int i) {
        GarbageCollection obj = new GarbageCollection(i);
    }

}
