package Array;

public class RotaoteImage {

public void rotate2(int[][] matrix) {
	
	int m=matrix.length,n=0;
	if(m>0)
        n=matrix[0].length;
	
	int[][] result= new int[m][n];
	int iIndx=0,jIndx=0,j=0;
	for(int i=n-1;i>=0;i--){ //column
		for( j=0,iIndx=0;j<m;j++) //row
		{
			result[iIndx][jIndx]=matrix[i][j];
			
			iIndx++;
		}
		jIndx++;
	}
	result[0][0]=result[0][0];
    }
	public static void main(String[] args) {
		RotaoteImage obj= new RotaoteImage();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },
				{ 10, 11, 12 } };
		obj.rotate2(matrix);

	}

}
