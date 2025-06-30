import java.io.*;
class Solution {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int i=1; i<=T; i++) {
        String clap = "";
        String tokens = Integer.toString(i);
        for(int j=0; j<tokens.length(); j++) {
            char token = tokens.charAt(j);
            if(token=='3'||token=='6'||token=='9') {
                clap+="-";
            }
        }
        if(clap.length()==0) {
            System.out.printf("%s ",tokens);
        }
        else{
            System.out.printf("%s ",clap);
        }
    }
    }
}