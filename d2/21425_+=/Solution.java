import java.io.*;
// Swea no. 21425 += Source Code
class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i =0;i<T;i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);
            int cnt = 0;
            do{
                if(x>y){
                    y+=x;
                    cnt++;
                }
                else{
                    x+=y;
                    cnt++;
                }
            }
            while(Math.max(x,y)<=N);
            System.out.println(cnt);


        }
    }
}