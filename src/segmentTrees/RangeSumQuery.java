package segmentTrees;
 // query method answer is not correct

public class RangeSumQuery {
    // limit for array size
   // static int N = 100000;

    static int n; // array size

    // Max size of tree
    static int []st ;

    public static void main(String[] args) {
       //  n =6;
        int []arr = {1, 3,2,-2,4,5};
        n = arr.length;
        st= new int[4*n+1];
        int st_idx =1; //start of segTree
        int start =0, end = n-1;

        //buildsegTree
        buildSegTree(st_idx, arr , start , end);
        System.out.println("Segment Tree is :");
        for(int i=0;i<4*n;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();

        System.out.println("Query is 0 based indexed: ");
        System.out.println("RangeSum(2,4): " + query(2,4,st_idx,start,end));
        System.out.println("RangeSum(1,4): " + query(1,4,st_idx,start,end));
        System.out.println("RangeSum(3,3): " + query(3,3,st_idx,start,end));

        arr[2] =100;
        updateNode(st_idx,start,end,2,100);
        System.out.println("Segment Tree is :");
        for(int i=0;i<4*n;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();

        System.out.println("Query is 0 based indexed: ");
        System.out.println("RangeSum(2,4): " + query(2,4,st_idx,start,end));
        System.out.println("RangeSum(1,4): " + query(1,4,st_idx,start,end));
        System.out.println("RangeSum(3,3): " + query(3,3,st_idx,start,end));

    }

    private static void updateNode(int st_idx, int start, int end, int pos, int newValue) {
        if(start >pos || end <pos){ //invalid case-no overlap
            return;
        }
        if(start == end){ //leafnode case (total overlap)
            st[st_idx] =newValue;
            return;
        }

        //Internal Node case
        int middle = start + (end-start)/2;
        updateNode(2*st_idx, start, middle, pos, newValue);
        updateNode(2*st_idx+1, middle+1, end,  pos, newValue);
        st[st_idx] = st[2*st_idx] +st[2*st_idx+1];
    }

    private static int query(int qs, int qe, int st_idx, int start, int end) {
        if(qs>end || qe<start){ //No overlap
            return 0;
        }
        if(start >= qs && end <= qe){ //Total Overlap
            return st[st_idx];
        }
        int middle = start + (end-start)/2;
        int leftSum = query(qs,qe,2*st_idx,start, middle);
        int rightSum = query(qs,qe,2*st_idx, middle+1, end);
        return leftSum+rightSum;
    }

    public static void buildSegTree(int st_idx , int[] arr , int start , int end){
        if(start > end ) return ; // invalid case
        if(start == end){ //base case(leafnode)
            st[st_idx] = arr[start];
            return;
        }

        //Internal nodes
        int middle = start + (end-start)/2;
        buildSegTree(2*st_idx,arr, start, middle); // left side
        buildSegTree(2*st_idx+1, arr,middle+1,end);  //right side
        st[st_idx] = st[2*st_idx] + st[2*st_idx+1];


    }
}
