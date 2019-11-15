package TreeCode;


import java.util.List;
import java.util.LinkedList;
/**
 * * A class to represent a generic tree in which each node
 * can have any number of children.
 * Because the number of children per node is not fixed,
 * each node has list of children.
 * * **/
public class Tree<T> {
    private TreeNode<T> root;

    // ---------- Beginning of TreeNode class ------------------
    // A class to represent a node of the tree
    public static class TreeNode<T> {
        private T data;
        private List< TreeNode<T> > children;

        // constructor
        public TreeNode(T d){
            data = d;
            children = new LinkedList< TreeNode<T> >();
        }

        // adds a child node to this node
        public void addChild(TreeNode<T> node) {
            children.add(node);
        }

        // removes all the children of this node.
        public void clearChildren() {
            children.clear();
        }
    }
    // ---------- End of TreeNode class ------------------

    // constructor to create an empty tree
    public Tree() {
        root = null;
    }

    // constructor to create a tree with only a root node
    public Tree(T rootData) {
        root = new TreeNode<T>(rootData);
    }

    /**
     * Constructor to create a tree with a root and subtrees
     * The "..." syntax implies that we can give as many parameters
     * as we want, of the specified type.  Thus, calls to this method
     * may look like:
     *    new Tree(rootData, subtree1)
     *    new Tree(rootData, subtree1, subtree2)
     *    new Tree(rootData, subtree1, subtree2, subtree3)
     * etc.
     **/
    public Tree(T rootData, Tree<T>... subTrees) {
        root = new TreeNode<T>(rootData);
        addSubTrees(subTrees);
    }

    /**
     * Method to add subtrees to this tree, by adding to children
     * of the root.
     * The "..." syntax implies that we can give as many parameters
     * as we want, of the specified type.  Thus, calls to this method
     * may look like:
     *    tree.setSubTrees(subtree1)
     *    tree.setSubTrees(subtree1, subtree2)
     *    tree.setSubTrees(subtree1, subtree2, subtree3)
     * etc.
     * Note that this Java syntax means that the variable subTrees is
     * treated as if it were of type Tree<T>[] i.e. an array of Tree objects
     **/
    public void addSubTrees(Tree<T>... subTrees) {
        if (subTrees.length > 0) {
            for (int i=0; i<subTrees.length; i++) {
                if (subTrees[i] != null)
                    root.addChild(subTrees[i].root);
            }
        }
    }

    /**
     * Method to set the subtrees of the root of this tree.
     * Note that any existing children of the root are discarded.
     * The "..." syntax implies that we can give as many parameters
     * as we want, of the specified type.  Thus, calls to this method
     * may look like:
     *    tree.setSubTrees(subtree1)
     *    tree.setSubTrees(subtree1, subtree2)
     *    tree.setSubTrees(subtree1, subtree2, subtree3)
     * etc.
     **/
    public void setSubTrees(Tree<T>... subTrees) {
        root.clearChildren();
        addSubTrees(subTrees);
    }



    // A method to draw a tree with appropriate indentation
    public void drawTree() {
        if (root != null)
            drawSubTree(root, 0); // call the recursive helper method
        else
            System.out.println("The tree is empty");
    }

    // A private recursive helper method to draw a subtree as an
    // indented list of the descedants of this node (including itself)
    // The indentLevel parameter just tells us how much to indent when printing
    private void drawSubTree(TreeNode<T> currentNode, int indentLevel){
        // The base case is that currentNode is null, in which case we
        // don't want to do anything.  We only do something if currentNode is
        // not null;
        if (currentNode != null) {
            for (int i=0; i<indentLevel; i++)
                System.out.print("\t");
            System.out.println(currentNode.data + " ");

            List< TreeNode<T> > children = currentNode.children;
            for (TreeNode<T> child : children)
                // The recursive call makes progress towards the base case
                // (currentNode being null) by calling the method on the
                // child of the current node.
                drawSubTree(child,indentLevel+1);
        }
    }

    // A method to count the nodes in a tree
    public int countNodes() {
        return countNodes(root);
    }

    // A private recursive method to count the nodes in a subtree
    // rooted at a given node
    public int countNodes(TreeNode<T> subtreeRoot) {

        if (subtreeRoot == null)
            return 0;

        else {
            int nodeCount = 1; // count this node

            // recursively count any children.
            for (TreeNode<T> child : subtreeRoot.children) {
                // The recursive call makes progress towards the base case
                // (curNode being null) by calling the method on the
                // child of the current node.
                nodeCount += countNodes(child);
            }
            return nodeCount;
        }
    }



    // A method to count the nodes in a tree
    public int countLeaves() {
        return countLeaves(root);
    }

    // A private recursive method to count the leaves in a subtree
    // rooted at a given node
    public int countLeaves(TreeNode<T> subtreeRoot) {
        if (subtreeRoot == null)
            return 0;

        else if (subtreeRoot.children.isEmpty())
            return 1;

        else {
            // recursively count leaves in the subtrees rooted at the
            // child nodes of this node
            int leafCount = 0;
            for (TreeNode<T> child : subtreeRoot.children) {
                leafCount += countLeaves(child);
            }
            return leafCount;
        }
    }

    public void printPreOrderTraversal() {
        printPreOrderTraversal(root);
        System.out.println(".");
    }

    public void printPreOrderTraversal(TreeNode<T> stRoot) {
        if (stRoot != null) {
            System.out.print(stRoot.data);
            for (TreeNode<T> child : stRoot.children) {
                System.out.print(", ");
                printPreOrderTraversal(child);
            }
        }
    }
}

