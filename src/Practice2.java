import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		int [][] A = {		{1, 2}, {3, 4}		};
		int [][] B = {		{5, 6}, {7, 8}		};
		int [][] sumResults = new int[2][2];		
		int [][] gopResults = new int[2][2];		// 각 행렬의 선언
		
		System.out.println("<<<<행렬의 합>>>>");
		matrixAdd(A, B, sumResults);
		matrixPrint(sumResults);
		System.out.println("<<<<행렬의 곱>>>>");
		matrixMultiple(A, B, gopResults);
		matrixPrint(gopResults);
	}
	
	static void matrixMultiple(int [][] A, int [][] B, int [][] result) {	//행렬의 곱
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				for(int k = 0; k < A[i].length; k++) {
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}
	}
	static void matrixAdd(int [][] A, int [][] B, int [][] result) {		// 행렬의 합
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}//
		}
}
	static void matrixPrint(int [][] result) {
		for(int i = 0; i < result.length; i ++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}
}

