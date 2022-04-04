import java.util.ArrayList;

public class Tree {

    public int height = 0;
    public boolean ifConifer = false;
    ArrayList<Object> elements = new ArrayList<>();

    public void grow() {
        this.height++;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.grow();
        Trunk trunk = new Trunk();
        tree.elements.add(trunk);
        tree.grow();
        tree.elements.get(0)
    }

}
