package com.challenge3p.mbt;


/**
 * Class to build a Binary Tree from a array of nums
 */
public class MaximumBinaryTreeBuilder {


    /**
     * Build a BinaryTree and print in console
     * @param values valid array of integers
     */
    public void buildAndPrint(int[] values){
        print(buildMaximumBinaryTree(values));
    }


    /** Build a BinaryTree from a valid array of integers
     * @param nums valid array of integers
     * @return  Binary Tree
     */
    public TreeNode buildMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length);
    }

    /** Build a BinaryTree
     * @param values valid  integers array
     * @param leftIndex left index start in 0
     * @param rightIndex right index start in nums.length
     * @return Binary Tree Built
     */
    private TreeNode build(int[] values,int leftIndex, int rightIndex){
        if (leftIndex == rightIndex)
            return null;

        int maxIndex = getIndexOfMaxValue(values, leftIndex, rightIndex);
        TreeNode root = new TreeNode(values[maxIndex]);
        root.left = build(values, leftIndex, maxIndex);
        root.right = build(values, maxIndex + 1, rightIndex);
        return root;
    }

    /** get index of the max value
     * @param nums integer array
     * @param left left index
     * @param rigth right index
     * @return index of the max value in the array
     */
    private int getIndexOfMaxValue(int[] nums, int left, int rigth) {
        int maxi = left;
        for (int i = left; i < rigth; i++) {
            if (nums[maxi] < nums[i])
                maxi = i;
        }
        return maxi;
    }


    /** Print a Binary Tree in console
     * @param root  Binary Tree
     */
    private void print(TreeNode root){
        System.out.println(root.print());
    }


}
