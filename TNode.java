public class TNode {
    TNode right, left;
    String name, genre;
    double score;

    public TNode(String n, double s, String g) {
        name = n;
        score = s;
        genre = g;
        right = left = null;
    }

    public String toString() {
        return name;
    }
}
