public class Driver {
    public static void main(String[] args) {
        BST Trakr = new BST();
        Trakr.insert("John Wick 2", 8.5, "Action");
        System.out.println(Trakr.Root[0]);
        Trakr.insert("Matrix", 9, "Action");
        System.out.println(Trakr.Root[0].right);
        Trakr.insert("The Hobbit", 7, "Fantasy");
        System.out.println(Trakr.Root[1]);
    }
}
