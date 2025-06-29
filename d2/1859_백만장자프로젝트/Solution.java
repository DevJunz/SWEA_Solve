import java.io.*;
class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=0;test_case<T;test_case++){
            int items_length = Integer.parseInt(br.readLine());
            String[] tokens = br.readLine().split(" ");
            int[] items = new int[tokens.length];
            for(int i = 0; i < items.length; i++){
                items[i] = Integer.parseInt(tokens[i]);
            }
            int Max_value = items[items.length-1];
            long result = 0;//result는 int형을 초과할 수 있다.
            for(int i =items.length-2; i>=0; i--){
                if(items[i]>Max_value){
                    Max_value = items[i];

                }
                else{
                    result +=(Max_value-items[i]);
                }
            }
            System.out.printf("#%d %d%n",test_case+1,result);

        }
    }
}