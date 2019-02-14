package problem02;

public class SmartPhone extends MusicPhone {
	
	
	@Override
	public void execute( String function ) {
		if (function.equals("음악")) {
			System.out.println(runApp(function));
			return;
		}else if(function.equals("앱")) {
			System.out.println(runApp(function));
			return;
		}else {
			super.execute(function);
		}
		
	}

	
	
	public String runApp(String function) {
		String resultTxt = null;
		if(function.equals("음악")) {
			resultTxt = "스트리밍";
		}else if(function.equals("앱")) {
			resultTxt = "앱실행";
		}
		
		
		return resultTxt;
	}
}