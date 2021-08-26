package com.challenge3p.mbt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaximumBinaryTreeBuilderTest {
    MaximumBinaryTreeBuilder builder;

    @BeforeAll
    void  setUp(){
        builder = new MaximumBinaryTreeBuilder();
    }

    @Test
    void buildMaximumBinaryTreeTest() {
        int[] array = {3,2,1};
        TreeNode tree = builder.buildMaximumBinaryTree(array);
        assertEquals("[3, null, 2, null, 1]",tree.print());

        int[] array2 = {3,2,1,6,0,5};
        TreeNode tree2 = builder.buildMaximumBinaryTree(array2);
        assertEquals("[6, 3, 5, null, 2, 0, null, null, 1]",tree2.print());



        int[] array3 = {};
        TreeNode tree3 = builder.buildMaximumBinaryTree(array3);
        assertNull(tree3);


        int[] array4 = {6,6,6,6};
        TreeNode tree4 = builder.buildMaximumBinaryTree(array4);
        assertEquals("[6, null, 6, null, 6, null, 6]",tree4.print());

    }
}