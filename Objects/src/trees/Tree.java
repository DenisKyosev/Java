package trees;

/**
 * Created by clouway on 15-8-5.
 */
public class Tree<T> {
    private TreeNode<T> root;

    public Tree(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Cannot insert null");
        }
        root = new TreeNode<>(value);
    }

    private void printDFS(TreeNode<T> node) {
        if (root == null) {
            return;
        }
        TreeNode<T> child = null;
        for (int i = 0; i < node.childrenCount(); i++) {
            child = node.getChild(i);
            printDFS(child);
        }
        System.out.println(node.getValue());
    }

    public void printDFS() {
        this.printDFS(root);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

}