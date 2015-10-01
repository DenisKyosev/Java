package trees;

/**
 * Created by clouway on 15-8-5.
 */
import java.util.ArrayList;

public class TreeNode<T> {
    private T value;
    private ArrayList<TreeNode<T>> children;
    private boolean hasParent;

    public TreeNode(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Cannot insert null");
        }
        this.setValue(value);
        hasParent = false;
        this.children = new ArrayList();
    }

    public void addChild(TreeNode<T> child) {
        if (child == null) {
            throw new IllegalArgumentException("Cannot insert null");
        }
        if (child.hasParent) {
            throw new IllegalArgumentException("Child has a parent");
        }
        this.children.add(child);
        child.hasParent = true;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int childrenCount() {
        return this.children.size();
    }

    public TreeNode<T> getChild(int index) {
        return this.children.get(index);
    }

}
