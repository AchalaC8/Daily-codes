/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<n;i++){
		    for(int k=1;k<=n-i;k++){
		        System.out.print("  ");
		    }
		    int a=i;
		    for(int j=1;j<=i;j++){
		        System.out.print(a+" ");
		        a--;
		    }
		    for(int j=2;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		    
		    
		}
		    
		    for (int i=n;i>=1;i--){
		    for(int k=1;k<=n-i;k++){
		        System.out.print("  ");
		    }
		    int a=i;
		    for(int j=1;j<=i;j++){
		        System.out.print(a+" ");
		        a--;
		    }
		    for(int j=2;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	
}}
