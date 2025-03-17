/** Array based list.
 */

public class AList<Item> {
    private int size;
    private Item[] items;
    /** Creates an empty list. */
    public AList() {
        size = 0;
        items = (Item [])new Object[100];
    }

    /**resize the size of items */
    private void resize(int capacity) {
        Item[] a = (Item []) new Object[size + 1];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
    /** Inserts X into the back of the list. 
     *  if size == items.length, create new items to replace items
     * */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size *= 2;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size -= 1;
        return x;
    }
} 
