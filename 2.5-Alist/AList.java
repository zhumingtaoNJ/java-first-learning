/** Array based list.
 */

public class AList {
    private int size;
    private int[] items;
    /** Creates an empty list. */
    public AList() {
        size = 0;
        items = new int[100];
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int x = getLast();
        size -= 1;
        return x;
    }
} 
