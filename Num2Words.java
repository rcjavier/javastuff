import java.io.*;
class Num2Words{
	private static	String[] suffixes = new String[] {
				""
				," thousand,"
				," million,"
				," billion,"
				," trillion,"
				," quadrillion,"
				," quintillion,"
				," sextillion,"
				," septillion,"
				," octillion,"
				," nonillion,"
				," decillion,"
				," undecillion,"
				," duodecillion,"
				," tredecillion,"
				," quattuordecillion,"
				," quinquadecillion,"
				," sedecillion," 
				," septendecillion,"
				," octodecillion,"
				," novendecillion,"
				," vigintillion,"
				," unvigintillion,"
				," duovigintillion,"
				," tresvigintillion,"
				," quattuorvigintillion,"
				," quinquavigintillion,"
				," sesvigintillion,"
				," septemvigintillion,"
				," octovigintillion,"
				," novemvigintillion,"
				," trigintillion,"
				," untrigintillion,"
				," duotrigintillion,"
				," trestrigintillion,"
				," quattuortrigintillion,"
				," quinquatrigintillion,"
				," sestrigintillion,"
				," septentrigintillion,"
				," octotrigintillion,"
				," noventrigintillion,"
				," quadragintillion,"
				," unquadragintillion,"
				," duoquadragintillion,"
				," tresquadragintillion,"
				," quattuorquadragintillion,"
				," quinquaquadragintillion,"
				," sesquadragintillion,"
				," septenquadragintillion,"
				," octoquadragintillion,"
				," novenquadragintillion,"
				," quinquagintillion,"
				," unquinquagintillion,"
				," duoquinquagintillion,"
				," tresquinquagintillion,"
				," quattuorquinquagintillion,"
				," quinquaquinquagintillion,"
				," sesquinquagintillion,"
				," septenquinquagintillion,"
				," octoquinquagintillion,"
				," novenquinquagintillion,"
				," sexagintillion,"
				," unsexagintillion,"
				," duosexagintillion,"
				," tresexagintillion,"
				," quattuorsexagintillion,"
				," quinquasexagintillion,"
				," sesexagintillion,"
				," septensexagintillion,"
				," octosexagintillion,"
				," novensexagintillion,"
				," septuagintillion,"
				," unseptuagintillion,"
				," duoseptuagintillion,"
				," treseptuagintillion,"
				," quattuorseptuagintillion,"
				," quinquaseptuagintillion,"
				," seseptuagintillion,"
				," septenseptuagintillion,"
				," octoseptuagintillion,"
				," novenseptuagintillion,"
				," octogintillion,"
				," unoctogintillion,"
				," duooctogintillion,"
	};

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// prints samples
		// if(max>0){
		// 	for(int i=1; i<1000; i++){
		// 		cout(toWords(i));
		// 	}
		// }
		System.out.print("Enter a number: ");
		int num = (int)(Long.parseLong(br.readLine()));

		cout(toWords(num));
		br=null;
	}

	private static void cout(Object primitive){
		// println shorthand
		System.out.println(primitive);
	}


	private static String toWords(long num){
		String retVal="";


		int suffix=0;

		int tmp=0;	//tens and ones
		// process groups of 3, repeat until all digits are done
		int nums3=0;
		String tmpVal = "";
		while(num>0){
			// get groups of 3 digits
			nums3=(int)(num%1000);

			if(nums3>0){
				// save the next groups, if any, for later
				num-=nums3;
				// handle the last 2 digits
				tmp=nums3%100;
				if(tmp<11){
					tmpVal = getOnes(tmp);
				}else if(tmp<20){
					tmpVal = getTeens(tmp);
				}else{
					tmpVal = between20and99(tmp);
				}

				// handle the hundreds
				tmp=nums3/100;
				if(tmp>0){
					tmpVal = getOnes(tmp) + " hundred" + tmpVal;	
				}
			}
			// add suffix, prepare next suffix
			retVal = tmpVal + suffixes[suffix++] + retVal;
			num/=1000;


		}

		return retVal.toString();
	}


	private static String between20and99(int num){
		
		String retVal="";

		//get ones
		int ones=num%10;

		//get tens
		int tens = num-ones;
		String dashOrNone="";
		if(ones>0){
			dashOrNone="-";
		}

		retVal = getTens(tens) + dashOrNone + getOnes(ones).trim();
		return retVal;
	}

	private static String getOnes(int num){
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

	private static String getTens(int num){
		
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


	private static String getTeens(int num){
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