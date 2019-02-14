package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int baseBallCnt = (int)(Math.random()*1000) +1;
		Scanner key = new Scanner(System.in);
		int totalCnt = 0;
		if(baseBallCnt < 100) {
			baseBallCnt = (int)(Math.random()*1000) +1;
		}
		
		System.out.println("랜덤 시작값 :   " + baseBallCnt);
		
		while(true) {
			int sCnt = 0;
			int bCnt = 0;
			int oCnt = 0;
			String inputKey = key.nextLine();
			String checkKey = Integer.toString(baseBallCnt);
			for(int i = 0 ; i < checkKey.length(); i++) {
				for(int j = 0 ; j < inputKey.length(); j++) {
					if(checkKey.charAt(i) == inputKey.charAt(j)) {
						if(i == j) {
							sCnt++;
						}else if(i != j) {
							bCnt++;
						}
					}
				}
				if((sCnt + bCnt) == 3) {
					oCnt = 0;
				}else if((sCnt + bCnt) == 2) {
					oCnt = 1;
				}else if((sCnt + bCnt) == 1) {
					oCnt = 2;
				}else if((sCnt + bCnt) == 0) {
					oCnt = 3;
				}
			}
			System.out.println("s : " + sCnt);
			System.out.println("b : " + bCnt);
			System.out.println("o : " + oCnt);
			if(sCnt == 3) {
				System.out.println();
				System.out.println("총 도전 횟수 : "+ ++totalCnt);
				break;
			}else {
				totalCnt++;
			}
		}
	}
}