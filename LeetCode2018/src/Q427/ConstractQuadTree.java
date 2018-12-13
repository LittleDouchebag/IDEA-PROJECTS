package Q427;

public class ConstractQuadTree {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0}};
        Node node = construct(grid);
        System.out.println(node);
    }

    public static Node construct(int[][] grid) {
        Node CurrentNode = new Node();
//        1.Total Check
        CurrentNode.isLeaf = true;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != grid[0][0]) {
                    CurrentNode.isLeaf = false;
                    break;
                }
            }
            if (CurrentNode.isLeaf == false) {
                break;
            }
        }
        CurrentNode.val=(grid[0][0]==1);
        if (CurrentNode.isLeaf == false) {
//            2.Top Left Check Test
            int[][] subgrid1 = new int[grid[0].length / 2][grid[0].length / 2];
            for (int i = 0; i < grid[0].length / 2; i++) {
                for (int j = 0; j < grid[0].length / 2; j++) {
                    subgrid1[i][j] = grid[i][j];
                }
            }
            CurrentNode.topLeft=construct(subgrid1);
//            3.Bottom Left Check Test
            int[][] subgrid2 = new int[grid[0].length / 2][grid[0].length / 2];
            for (int i = 0; i < grid[0].length / 2; i++) {
                for (int j = 0; j < grid[0].length / 2; j++) {
                    subgrid2[i][j] = grid[i + grid[0].length / 2][j];
                }
            }
            CurrentNode.bottomLeft=construct(subgrid2);
//            4.Top Right Check Test
            int[][] subgrid3 = new int[grid[0].length / 2][grid[0].length / 2];
            for (int i = 0; i < grid[0].length / 2; i++) {
                for (int j = 0; j < grid[0].length / 2; j++) {
                    subgrid3[i][j] = grid[i][j + grid[0].length / 2];
                }
            }
            CurrentNode.topRight=construct(subgrid3);
//            5.Bottom Right Check Test
            int[][] subgrid4 = new int[grid[0].length / 2][grid[0].length / 2];
            for (int i = 0; i < grid[0].length / 2; i++) {
                for (int j = 0; j < grid[0].length / 2; j++) {
                    subgrid4[i][j] = grid[i + grid[0].length / 2][j + grid[0].length / 2];
                }
            }
            CurrentNode.bottomRight=construct(subgrid4);
        }
        return CurrentNode;
    }
}

// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
    }

    public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}


