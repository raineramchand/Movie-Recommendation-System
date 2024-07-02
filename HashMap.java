/**
 * The HashMap class implements the necessary functionalities of a hash table to be used in the project to create the user's watch list
 */
public class HashMap {
    LinkedList[] list;

    public HashMap() {
        list = new LinkedList[100];
    }

    /**
     * Take movie as parameter
     * insert movie into the relevant index of the hash table
     *
     * @param m TNode variable carrying the data of the movie
     */
    public void insert(TNode m) {
        int i = hash(m.name);
        if (list[i] == null)
            list[i] = new LinkedList();
        list[i].insert(m);
    }

    /**
     * remove the movie from the hashmap,
     *
     * @return the movie that has been deleted
     */
    public TNode pop(String m) {
        int a = hash(m);
        return list[a].delete(m);
    }

    /**
     * display the user's watch list
     */
    public void display() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }
    }

    /**
     * clear the user's watch list
     */
    public void clear() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) list[i].clear();
        }
    }

    private int hash(String obj) {
        return obj.hashCode() % list.length;
    }
}
