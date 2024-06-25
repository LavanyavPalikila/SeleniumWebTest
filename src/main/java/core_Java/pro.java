package core_Java;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{3,6,4}, {2,8,5}, {1,2,6}};
		int min= b[0][0];
		int mincol = 0;
	for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				if(b[x][y]< min) {
					min = b[x][y];
					mincol = y;	
				}
			}
		}	
	System.out.println(mincol);
	System.out.println(min);
		
	}

}

/* 3 6 4
   2 8 5
   1 2 6 */