package io.vorotovd.RecursionI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInABinarySearchTreeTest {
    @Test
    public void searchExist() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, one, three);
        TreeNode seven = new TreeNode(7);
        TreeNode root = new TreeNode(4, two, seven);
        SearchInABinarySearchTreeSolution solution = new SearchInABinarySearchTreeSolution();
        Assertions.assertEquals(two,solution.searchBST(root,2));
    }
    @Test
    public void search2NotExist() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, one, three);
        TreeNode seven = new TreeNode(7);
        TreeNode root = new TreeNode(4, two, seven);
        SearchInABinarySearchTreeSolution solution = new SearchInABinarySearchTreeSolution();
        Assertions.assertEquals(two,solution.searchBST(root,5));
    }
}