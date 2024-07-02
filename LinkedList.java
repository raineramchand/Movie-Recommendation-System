/**
 * The LinkedList class implements the necessary functionalities of a linked list to be used in the project
 */
public class LinkedList {
    LNode head;

    public LinkedList() {
        head = null;
    }

    /**
     * Take movie as parameter
     * insert movie at the head of the list
     *
     * @param m TNode variable carrying the data of the movie.
     */
    public void insert(TNode m) {
        if (m != null) {
            LNode temp = head;
            head = new LNode(m);
            head.next = temp;
        }
    }

    /**
     * empties the list
     */
    public void clear() {
        head = null;
    }

    /**
     * deletes a given movie from the list
     *
     * @return the details of the deleted movie
     */
    public TNode delete(String m) { // delete a node with value d (first occurrence)
        LNode temp = head;
        LNode prev;
        if (temp.movie.name.equals(m)) {
            head = head.next;
            return temp.movie;
        } else {
            prev = temp;    //update later
            temp = temp.next;
            while (!temp.movie.name.equals(m)) {
                prev = temp;
                temp = temp.next;
                if (temp == null) return null;
            }
            prev.next = prev.next.next;
            return temp.movie;
        }
        //return temp.movie;
    }

    /**
     * Concatenate the list into a String,
     *
     * @return the Concatenated String
     */
    public String toString() {
        String rtrn = "";
        LNode temp = head;
        while (temp != null) {
            rtrn += temp + " | ";
            temp = temp.next;
        }
        return rtrn;
    }
}
