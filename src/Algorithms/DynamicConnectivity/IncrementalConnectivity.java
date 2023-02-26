package Algorithms.DynamicConnectivity;

public class IncrementalConnectivity {

    static int root(int arr[], int i){
        while(arr[i] != i){
            arr[i] = arr[arr[i]];
            i = arr[i];
        }
        return i;
    }

    //union of two nodes a and b
    static void weighted_union(int arr[], int rank[], int a, int b){
        int root_a = root(arr, b);
        int root_b = root(arr, b);

        //union based on rank
        if(rank[root_a] < rank[root_b]){
            arr[root_a] = arr[root_b];
            rank[root_b] += rank[root_a];
        }else{
            arr[root_b] = arr[root_a];
            rank[root_a] += rank[root_b];
        }
    }

    //returns true if two nodes have same root
    static boolean isSameRoot(int arr[], int a, int b){
        return (root(arr,a) == root(arr, b));
    }

    //perform operation according to query type
    static void query(int type, int x, int y, int arr[], int [] rank){
        //type 1 query means checking if
        // node x and y are connected or not
        if(type == 1){
            //If roots of x and y is same
            // then yes is the answer
            if(isSameRoot(arr, x, y) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else if (type == 2){
            //If x and y have different roots then perform union
            if(isSameRoot(arr,x,y) == false)
                weighted_union(arr, rank, x, y);
        }
    }

    public static void main(String [] args){
        //Number of nodes
        int n = 7;

        // implement disjoint set data structure.
        // arr[] holds the parent nodes while rank
        // array holds the rank of subset
        int []arr = new int[n];
        int []rank = new int[n];

        // initializing both array and rank
        for (int i = 0; i < n; i++)
        {
            arr[i] = i;
            rank[i] = 1;
        }

        // number of queries
        int q = 11;
        query(1, 0, 1, arr, rank);
        query(2, 0, 1, arr, rank);
        query(2, 1, 2, arr, rank);
        query(1, 0, 2, arr, rank);
        query(2, 0, 2, arr, rank);
        query(2, 2, 3, arr, rank);
        query(2, 3, 4, arr, rank);
        query(1, 0, 5, arr, rank);
        query(2, 4, 5, arr, rank);
        query(2, 5, 6, arr, rank);
        query(1, 2, 6, arr, rank);
    }

}
