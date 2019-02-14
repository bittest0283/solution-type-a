package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		String countNum = Integer.toString(number);
		int countSize = countNum.length();
		int clapCnt = 0;
		for(int i = 0 ; i < countSize; i++) {
			if(countNum.charAt(i) == '3' || countNum.charAt(i) == '6' || countNum.charAt(i) == '9') {
				clapCnt++;
			}
		}
		
		return clapCnt;
	}
}