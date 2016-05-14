import java.io.*;
class OrdinalNumbers{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// for(int i=1; i<=150; i++){
		// 	System.out.println(ordinal(i));
		// }

		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());

		System.out.println(ordinal(num));
		br=null;
	}

	private static String ordinal(int num){
		String retVal="";

		//get last digit- 1st, 2nd, 3rd, others-th
		int lastDigit = num%10;
		
		switch(lastDigit){
			case 1: retVal=num+"st";
				break;
			case 2: retVal=num+"nd";
				break;
			case 3: retVal=num+"rd";
				break;
			default: retVal=num+"th";
		}

		return retVal;
	}

}