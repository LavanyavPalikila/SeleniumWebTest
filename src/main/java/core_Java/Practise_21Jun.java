package core_Java;

public class Practise_21Jun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1 2 3 4
		   5 6 7
		   8 9
		   10 */
		int k=1;
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(k +" ");
				k++;
			}
			System.out.println("");
		} 
		
		/* 1
		   2 3 
		   4 5 6
		   7 8 9 10  */
	
		int p=1;
		for(int m=1;m<5;m++) {
			for(int n=1;n<=m;n++) {
				System.out.print(p +" ");
				p++;
			}
			
			System.out.println("");
		}
	
		/* 1
		   1 2
		   1 2 3
		   1 2 3 4 */
	
		for(int x=1; x<=4;x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}
		
		/* 3
		   6 9
		   12 15 18 */
		
		int d=3;
		for(int z=1; z<=3;z++) {
			for(int a=1; a<=z;a++) {
				System.out.print(d+ " ");
				d = d+3;
			}
			System.out.println(" ");
		}
		
		//multi dimensional array - print all
		int a[][] = {{3,6,4}, {2,8,5}, {1,2,6}};
		System.out.println(a[1][1]);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
				
			}
			
		}
		
		//multi dimensional array - print only minimum num
		
		int bat[][] = {{3,6,4}, {2,8,5}, {1,2,6}};
		int sim= bat[0][0];

	for(int xi=0;xi<3;xi++) {
			for(int yi=0;yi<3;yi++) {
				if(bat[xi][yi]< sim) {
					sim = 5;
				}
			}
			
		}		
		System.out.println(sim);
		System.out.println("gyu");
		
		
	}
}








