package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] data= new String[4][2];
		
		//Row 1
		data[0][0]="username";
		data[0][1]="password";
		
		//Row 2
		data[1][0]="user1";
		data[1][1]="password1";
		
		//Row 2
		data[2][0]="user2";
		data[2][1]="password2";
		
		//Row 3
		data[3][0]="user3";
		data[3][1]="password3";
		
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(data[r][c]);
			}
		}

	}

}
