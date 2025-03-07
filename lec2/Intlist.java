public class Intlist {
    public int first;
    public Intlist rest;

    /**initialize an Intlist Node */
    public Intlist(int f, Intlist r) {
        first = f;
        rest = r;
    }

    /**return the size of an Intlist */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**return the ith item in an Intlist */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        Intlist L = new Intlist(15, null);
        L = new Intlist(10, L);
        L = new Intlist(5, L);
        System.out.println(L.size());
        System.out.println(L.get(1));
    }
}