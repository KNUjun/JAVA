public class MultipleChoice{
	public static void main(String[] args){
		char[][] answerArr ={
			{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'}
		};
		char[] key={'D','B','D','C','C','D','A','E','A','D'};
		int[][] count= new int[8][10];
		int sum=0;
		for(int i=0;i<answerArr.length;i++){
			for(int j=0;j<answerArr[i].length;j++){
				if(answerArr[i][j]==key[j]) sum++;
			}
			System.out.println("Student "+i+" correct : " +sum );
			sum=0;
		}
	}
}