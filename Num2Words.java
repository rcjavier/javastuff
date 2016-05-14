import java.io.*;
class Num2Words{
	private static	String[] suffixes = new String[] {
				""
				," thousand"
				," million"
				," billion"
				," trillion"
				," quadrillion"
				," quintillion"
				," sextillion"
				," septillion"
				," octillion"
				," nonillion"
				," decillion"
				," undecillion"
				," duodecillion"
				," tredecillion"
				," quattuordecillion"
				," quinquadecillion"
				," sedecillion" 
				," septendecillion"
				," octodecillion"
				," novendecillion"
				," vigintillion"
				," unvigintillion"
				," duovigintillion"
				," tresvigintillion"
				," quattuorvigintillion"
				," quinquavigintillion"
				," sesvigintillion"
				," septemvigintillion"
				," octovigintillion"
				," novemvigintillion"
				," trigintillion"
				," untrigintillion"
				," duotrigintillion"
				," trestrigintillion"
				," quattuortrigintillion"
				," quinquatrigintillion"
				," sestrigintillion"
				," septentrigintillion"
				," octotrigintillion"
				," noventrigintillion"
				," quadragintillion"
				," unquadragintillion"
				," duoquadragintillion"
				," tresquadragintillion"
				," quattuorquadragintillion"
				," quinquaquadragintillion"
				," sesquadragintillion"
				," septenquadragintillion"
				," octoquadragintillion"
				," novenquadragintillion"
				," quinquagintillion"
				," unquinquagintillion"
				," duoquinquagintillion"
				," tresquinquagintillion"
				," quattuorquinquagintillion"
				," quinquaquinquagintillion"
				," sesquinquagintillion"
				," septenquinquagintillion"
				," octoquinquagintillion"
				," novenquinquagintillion"
				," sexagintillion"
				," unsexagintillion"
				," duosexagintillion"
				," tresexagintillion"
				," quattuorsexagintillion"
				," quinquasexagintillion"
				," sesexagintillion"
				," septensexagintillion"
				," octosexagintillion"
				," novensexagintillion"
				," septuagintillion"
				," unseptuagintillion"
				," duoseptuagintillion"
				," treseptuagintillion"
				," quattuorseptuagintillion"
				," quinquaseptuagintillion"
				," seseptuagintillion"
				," septenseptuagintillion"
				," octoseptuagintillion"
				," novenseptuagintillion"
				," octogintillion"
				," unoctogintillion"
				," duooctogintillion"
	};

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// prints 1-999
		// for(int i=1; i<1000; i++){
		// 	System.out.println(toWords(i));
		// }

		System.out.print("Enter a number: ");
		int num = (int)(Long.parseLong(br.readLine()));

		System.out.println(toWords(num));
		br=null;
	}

	private static String getLast3Digits(int num){

		return "";
	}

	private static String toWords(int num){
		String retVal;



		// get below 100 part
		int tmp = num%100;
		

		if(tmp<11){
			retVal=between1and10(tmp);
		}else if(tmp<20){
			retVal=between10and20(tmp);
		}else{
			retVal=between20and99(tmp);
		}

		// get the hundreds
		num/=100;
		if(num>0){
			retVal = between1and10(num) + " hundred" + retVal;	
		}

		return retVal;
	}

	private static void print(int num){
		System.out.println(num);
	}

	private static void print(String str){
		System.out.println(str);
	}

	private static String between20and99(int num){
		
		String retVal="";

		//get ones
		int tmp=num%10;

		//get tens
		num = num-tmp;
		retVal = between20and100(num) + between1and10(tmp);
		return retVal;
	}

	private static String between1and10(int num){
				String retVal="";
		switch(num){
			case 1: retVal=" one";
				break;
			case 2: retVal=" two";
				break;
			case 3: retVal=" three";
				break;
			case 4: retVal=" four";
				break;
			case 5: retVal=" five";
				break;
			case 6: retVal=" six";
				break;
			case 7: retVal=" seven";
				break;
			case 8: retVal=" eight";
				break;
			case 9: retVal=" nine";	
				break;
			case 10: retVal=" ten";
		}		

		return retVal;
	}

	private static String between20and100(int num){
		
		String retVal="";
		switch(num){
			case 20: retVal=" twenty";
				break;
			case 30: retVal=" thirty";
				break;
			case 40: retVal=" forty";
				break;
			case 50: retVal=" fifty";
				break;
			case 60: retVal=" sixty";
				break;
			case 70: retVal=" seventy";
				break;
			case 80: retVal=" eighty";
				break;
			case 90: retVal=" ninety";	
		}

		return retVal;
	}


	private static String between10and20(int num){
		String retVal="";
		switch(num){
			case 11: retVal=" eleven";
				break;
			case 12: retVal=" twelve";
				break;
			case 13: retVal=" thirteen";
				break;
			case 14: retVal=" fourteen";
				break;
			case 15: retVal=" fifteen";
				break;
			case 16: retVal=" sixteen";
				break;
			case 17: retVal=" seventeen";
				break;
			case 18: retVal=" eighteen";
				break;
			case 19: retVal=" nineteen";	
		}

		return retVal;
	}


}