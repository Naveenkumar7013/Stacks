import java.util.Stack;

public class celebrity {
    public static void main(String[] args) {
        int arr[][] = {{0, 1}, {0, 0}};
        System.out.println(solve(arr));
    }
    public static int solve(int[][] arr){
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<arr.length;i++){
            st.push(i);
        }
        while (st.size()>1){
            int p1 = st.pop();
            int p2 = st.pop();
            if(arr[p1][p2]==1){
                st.push(p2);
            }else{
                st.push(p1);
            }
        }
        int pceleb = st.pop();
        for(int i=0;i< arr.length;i++){
            if(arr[pceleb][i]==1){
                return -1;
            }
        }
        for(int i=0;i< arr.length;i++){
            if(pceleb!=i){
                if(arr[i][pceleb]==0){
                    return -1;
                }
            }

        }
       // System.out.println(pceleb);
        return pceleb;
    }

}
