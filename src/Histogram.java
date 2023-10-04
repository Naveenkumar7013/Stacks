import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
    solve(arr);
    }
    public static void solve(int arr[]){
       int n = arr.length;
        int[] nseri = new int[n];
        int[] nseli = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()!=0 && arr[i]<arr[st.peek()]){
                int idx =st.pop();
                nseri[idx]=i;
            }
            st.push(i);
        }
        while (st.size()!=0){
            int idx = st.pop();
            nseri[idx]=n;
        }

        for(int i=n-1;i>=0;i--){
            while(st.size()!=0 && arr[i]<arr[st.peek()]){
                int idx =st.pop();
                nseli[idx]=i;
            }
            st.push(i);
        }
        while (st.size()!=0){
            int idx = st.pop();
            nseli[idx]=-1;
        }
        int maxArea =0;
        for(int i=0;i<n;i++){
            int h =arr[i];
            int w = nseri[i]-nseli[i]-1;
            int a = h*w;
            maxArea = Math.max(maxArea,a);
        }
        System.out.println(maxArea);
    }
}
