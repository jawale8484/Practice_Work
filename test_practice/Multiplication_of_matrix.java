//Multiplication of two matrix

package test_practice;

public class Multiplication_of_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}}; 
		
		int mult[][]=new int[3][3];
		//multiplication
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
				for(int k=0;k<3;k++) {
					mult[i][j]=mult[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		
		//result
		for(int i=0;i<3;i++) {
			for(int p=0;p<3;p++) {
				System.out.print(mult[i][p]+" ");
			}
			System.out.println();
		}
	}

}
