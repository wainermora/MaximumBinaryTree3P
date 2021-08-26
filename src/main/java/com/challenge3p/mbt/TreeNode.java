package com.challenge3p.mbt;


import java.util.ArrayList;
import java.util.List;

/**
 * TreeNode structure
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }


    /** Print the TreeNode Structure
     * @return  String representation of the tree node
     */
    public String print(){
        List lista = getList();
        return  lista.toString();
    }


    /**Build an ArrayList to be printed
     * @return  the ArrayList built from the tree node
     */
    private List getList() {
        List lista = new ArrayList();
        int h = height(this);
        for (int i=1; i<=h; i++)
            addCurrentLevel(this, i,lista);
        return lista;
    }

    /* add  nodes at the current level to the list to be printed*/
    private void addCurrentLevel (TreeNode root ,int level,  List lista )
    {
        if (root == null) {
            if(level==1) {
                lista.add(null);
            }
            return;
        }
        if (level == 1) {
            lista.add(root.val);
        }else if (level > 1)
        {
            if(root.left==null && root.right==null)
                return;
            addCurrentLevel(root.left, level-1,lista);
            addCurrentLevel(root.right, level-1,lista);
        }
    }



    /** Method to count levels in a BinaryTree
     * @param root TreeNode root
     * @return count levels
     */
    private int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }


}
