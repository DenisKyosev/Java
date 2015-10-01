package trees;

/**
 * Created by clouway on 15-8-5.
 */
public final class RunTree {

    private RunTree() {
    }

    public static void main(String[] args) {
        Tree tree = new Tree<>(5);
        tree.getRoot().addChild(new TreeNode(3));
        tree.getRoot().getChild(0).addChild(new TreeNode(7));
        tree.getRoot().addChild(new TreeNode(6));
        tree.getRoot().getChild(1).addChild(new TreeNode(8));
        tree.getRoot().addChild(new TreeNode(9));
        tree.printDFS();
    }
}