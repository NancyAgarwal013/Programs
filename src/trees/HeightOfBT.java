package trees;

/**
 *    can be any definition :: nodes kitni hai??? (here we are using this)
 *    or edges kitni hai???
 *
 *          100                               100
 *         /   \                            /    \
 *       20     500                       20     500
 *      /  \                              /  \
 *     10   30                           10   30
 *     // height = 3                            \
 *                                               40  // height = 4
 *          1
 *         /                                   1
 *        2                                   //height = 1
 *       /
 *      3                                     null
 *     /                                        // height = 0
 *    4   // height = 4
 *
 */
public class HeightOfBT {
    public static void main(String[] args) {
          //  Node root
    }

    static int findHeight(Node root){
        if(root == null)
            return 0;
        return Math.max( findHeight(root.left), findHeight(root.right))+1;
    }
}
