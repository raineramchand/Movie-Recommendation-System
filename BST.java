public class BST {
    TNode[] Root;
    HashMap MyList;
    LinkedList History;

    public BST() {
        Root = new TNode[9]; //change 9 to as many genres needed
        MyList = new HashMap();
        History = new LinkedList();
    }

    public void insert(String n, double s, String g) {
        TNode newNode = new TNode(n, s, g);
        int i = getIndex(g);
        if (i > -1) {
            if (Root[i] == null) Root[i] = newNode;
            else {
                TNode curr = Root[i];
                TNode pvs = null;
                while (curr != null) {
                    if (newNode.score < curr.score) {
                        pvs = curr;
                        curr = curr.left;
                    } else {
                        pvs = curr;
                        curr = curr.right;
                    }
                }
                if (newNode.score < pvs.score) {
                    pvs.left = newNode;
                } else {
                    pvs.right = newNode;
                }
            }
        }
    }

    public void traverseGenre(String g) {
        int i = getIndex(g);
        //insert code for Inorder Traversal; (has to be non recursive)
    }

    public void topScore(float s) {
        for (int i = 0; i < Root.length; i++) {
        }
    }

    public TNode find(String m /*,String g*/) {
        TNode curr;
        /*int i = getIndex(g)*/
        for (int i = 0; i < Root.length; i++) {
            curr = Root[i];
            //code to traverse the Tree
            if (m.equals(curr.name)) return curr;
        }
        return null;
    }

    public void myListInsert(String m) {
        MyList.insert(find(m));
        System.out.println(m + " has been added to your watch list");
    }

    public void displayMyList() {
        System.out.println("Your watch list: ");
        MyList.display();
    }

    public void clearMyList() {
        MyList.clear();
        System.out.println("Your watch list has been cleared");
    }

    public void watch(String m) {
        History.insert(MyList.pop(m));
        System.out.println(m + " has now been watched");
    }

    public void displayHistory() {
        System.out.println("Your watch history: ");
        System.out.println(History);
    }

    private int getIndex(String g) {
        int i = -1; //index in an array corresponding to a genre
        if (g.equals("Action")) i = 0;
        else if (g.equals("Fantasy")) i = 1;
        // insert continuing else if for all genres;
        return i;
    }
}
