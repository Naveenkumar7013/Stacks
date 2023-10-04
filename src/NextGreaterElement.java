import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        nger(arr);
    }
    public static void nger(int arr[]){
    int ans[]  = new int[arr.length];
    Stack<Integer> st = new Stack<>();
      /*
        for(int i= arr.length-1;i>=0;i--){
            while (st.size()!=0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()!=0)
                ans[i]=st.peek();
            else
                ans[i]=-1;
            st.push(arr[i]);
        }
        //System.out.println(ans[]);
        for (int an:ans) {
            System.out.println(an);
        }

       */
        for(int i=0;i< arr.length;i++){
            while (st.size()!=0 && arr[st.peek()]<= arr[i]){
                int idx = st.peek();
                st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        while(st.size()!=0){
            int idx = st.pop();
            ans[idx]=-1;
        }
        for (int an:ans) {
            System.out.println(an);
        }
    }
}
