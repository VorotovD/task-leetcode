package io.vorotovd.RecursionI;

public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, one, three);
        TreeNode seven = new TreeNode(7);
        TreeNode root = new TreeNode(4, two, seven);
        SearchInABinarySearchTreeSolution solution = new SearchInABinarySearchTreeSolution();
        System.out.println(solution.searchBST(root, 5));
    }
}

class SearchInABinarySearchTreeSolution {
    /**
     * Метод ищет в бинарном дереве вершину с заданным значением и возвращает ее
     *
     * @param root Корень дерева
     * @param val  Искомое значение
     * @return Узел дерева с искомым значением
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) {
            return root;
        }
        TreeNode result;
        if (root.left != null && root.val > val) {
            result = searchBST(root.left, val);
            return result;
        } else if (root.right != null) {
            result = searchBST(root.right, val);
            return result;
        }
        return null;
    }
}
