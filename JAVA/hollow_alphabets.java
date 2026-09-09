public class Main{
    public static void main(String[] args){
        
        int n=5;
        char ch='A';
        for(int i =1;i<=n;i++){
            
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1|| j==i || i==n){
                    System.out.print(ch+" ");
                    ch++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
