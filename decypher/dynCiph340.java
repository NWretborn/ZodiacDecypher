package decypher;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class dynCiph340 {

	public static int total = 0;
	public static int globalCounter = 0;
	public static int matchCounter;
	public static List<String> dict = Arrays.asList("bomb", "pigs","san","francisco","sacrifice","reborn","slaves","die","birth","afterlife","movie", "god", "hate", "button", "halloween", "paradise", "paradice","lake", "berryessa", "paul", "stine", "the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","part","murder","kill","death","pistol","gun","police","crime","insane","zodiac","killer","head","shot");
	//public static List<String> dict = Arrays.asList("I","like","killing","people","because","it","is","so","much","fun","it","is","more","fun","than","killing","wild","game","in","the","forest","because","man","is","the","most","dangerous","animal","of","all","to","kill","something","is","the","most","thrilling","experience","it","is","even","better","than","getting","your","rocks","off","with","a","girl","best","part","of","it","is","that","when","i","die","i","will","be","reborn","in","paradise","and","all","that","I","have","killed","will","become","my","slaves","i","will","not","give","you","my","name","try","slow","down","stop","collecting","my","afterlife");

	public static String[] mostCommon = {"e","t","a","o","i","n","s","h","r"};
	public static String[] leastCommon = {"v","k","x","j","q","z"};

	public static String[] common = { "a", "b", "c", "d", "e", "f", "g",
			"h", "i", "l", "m", "n", "o", "p", "r", "s", "t",
			"u", "w", "y" };

	public static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g",
			"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z" };

	//First zodiac cipher
	public static int H = 0;
	public static int E = 1;
	public static int R = 2;
	public static int rV = 3;
	public static int q = 4;
	public static int rL = 5;
	public static int fV = 6;
	public static int V = 7;
	public static int P = 8;
	public static int rK = 9;
	public static int vline = 10;
	public static int usC = 11;
	public static int L = 12;
	public static int T = 13;
	public static int G = 14;
	public static int bsC = 15;
	public static int rD = 16;
	public static int N = 17;
	public static int plus = 18;
	public static int B = 19;
	public static int vlo = 20;
	public static int fsquare = 21;
	public static int O = 22;
	public static int lsquare = 23;
	public static int D = 24;
	public static int W = 25;
	public static int y = 26;
	public static int dot = 27;
	public static int lV = 28;
	public static int rsquare = 29;
	public static int K = 30;
	public static int rF = 31;
	public static int hlo = 32;
	public static int ry = 33;
	public static int ijr = 34;
	public static int rC = 35;
	public static int M = 36;
	public static int u = 37;
	public static int Z = 38;
	public static int zodiac = 39;
	public static int J = 40;
	public static int S = 41;
	public static int triangledot = 42;
	public static int ftriangle = 43;
	public static int lsC = 44;
	public static int square = 45;
	public static int triangle = 46;
	public static int fT = 47;
	public static int tj = 48;
	public static int fcircle = 49;
	public static int F = 50;
	public static int fP = 51;
	public static int rsC = 52;
	public static int dash = 53;
	public static int hline = 54;
	public static int C = 55;
	public static int rQ = 56;
	public static int ijl = 57;
	public static int X = 58;
	public static int squaredot = 59;
	public static int rB = 60;
	public static int circledot = 61;
	public static int A = 62;
	public static int symbols[] = {
			H,E,R,rV,q,rL,fV,V,P,rK,vline,usC,L,T,G,bsC,rD,N,plus,B,vlo,fsquare,O,lsquare,D,W,y,dot,lV,rsquare,K,rF,hlo,ry,ijr,rC,M,u,Z,zodiac,
			J,S,triangledot,ftriangle,lsC,square,triangle,fT,tj,fcircle,F,fP,rsC,dash,hline,C,rQ,ijl,X,squaredot,rB,circledot,A
	};


	public static int cipher[] = 

		{

				H,E,R,rV,q,rL,fV,V,P,rK,vline,usC,L,T,G,bsC,rD,
				N,q,plus,B,vlo,fsquare,O,lsquare,D,W,y,dot,lV,rsquare,K,rF,hlo,
				B,ry,ijl,rC,M,plus,u,Z,G,W,vlo,hlo,L,fsquare,zodiac,H,J,
				S,q,q,triangledot,fV,rL,ftriangle,rsquare,V,lsC,q,O,plus,plus,R,K,bsC,
				
				square,triangle,M,plus,zodiac,fT,tj,rD,vline,fcircle,F,P,plus,fP,rsC,rK,dash,
				q,ftriangle,R,fV,F,rL,O,vline,rsquare,rD,C,rK,F,rV,bsC,D,hlo,
				fsquare,fcircle,plus,K,rQ,lsquare,ijl,bsC,u,rC,X,G,V,dot,zodiac,L,vline,
				vlo,G,bsC,J,rF,tj,fsquare,O,plus,square,N,y,zodiac,plus,squaredot,L,triangle,
				
				rD,lV,M,plus,rB,plus,Z,R,bsC,F,B,rC,ry,A,circledot,rsC,K,
				hline,zodiac,rL,u,V,plus,fV,J,plus,O,q,triangledot,lV,F,B,ry,hline,
				u,plus,R,dash,fcircle,fT,E,vline,D,y,B,q,rB,T,M,K,O,
				bsC,lV,rC,rL,R,J,vline,rsquare,fcircle,T,lsC,M,dot,plus,fP,B,F,
				
				zodiac,circledot,triangle,S,ry,fsquare,plus,N,vline,fcircle,F,B,rC,vlo,ijl,ftriangle,R,
				rL,G,F,N,fV,rF,fcircle,bsC,rsC,rB,dot,rC,V,rsC,fT,plus,plus,
				ry,B,X,usC,rsquare,ijr,lsC,triangle,C,E,lV,V,u,Z,fcircle,hline,plus,
				vline,rC,dot,lsC,zodiac,B,K,vlo,O,q,fV,dot,rF,M,rQ,G,bsC,
				
				R,rC,T,plus,L,usC,circledot,C,lV,plus,F,rL,W,B,vline,hlo,L,
				plus,plus,hlo,W,C,zodiac,W,rC,P,O,S,H,T,dash,vlo,hlo,q,
				vline,F,rK,rD,W,lV,triangledot,fT,B,square,y,O,B,rsquare,hline,C,rC,
				rV,M,D,H,N,q,rK,S,zodiac,Z,O,ftriangle,A,vline,K,ijl,plus

		};

	public static String solution[] = new String[340];
	public static String cipherKey[] = new String[63];
	//ETAOINSHR most common VKXJQZ least common
	public static int cipherCount[] = {
			14,11,11,6,8,10,12,9,7,12,
			7,6,9,9,9,8,10,7,10,6,
			8,8,6,5,12,21,8,5,6,3,
			6,7,6,6,8,4,6,8,10,8,
			3,5,9,8,6,7,5,8,4,1,
			6,4,1,8,1};


	public static void writeToFile(String str, String key, int counter) throws FileNotFoundException, UnsupportedEncodingException {
		try {
			Files.write(Paths.get("dynSolutions.txt"), ("</br>WordCount: " + counter + "</br>Key: " + key + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("dynSolutions.txt"), ("</br>Cipher: " + str + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("dynSolutions.txt"), ("</br>" + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		}
	}

	public static class wbreturn {
		int from, to;
		String prefix;

		public wbreturn(String prefix, int from, int to) {
			this.prefix = prefix;
			this.to = to;
			this.from = from;
		}
	}

	public static wbreturn wordBreak(List<String> dict, String str, String out)
	{
		if (str.length() == 0)
		{
			return null;
		}

		for (int i = 0; i <= str.length()-1; i++)
		{
			for(int k = i; k <= str.length()-1; k++) {
				String prefix = str.substring(i, k);
				if (dict.contains(prefix)) {
						if((prefix.length() > 3)) {
							wbreturn var = new wbreturn(prefix,i,k);
							return var;
						}
				}
			}
		}
		return null;
	}

	public static void wordCount(List<String> dict, String str, String out)
	{
		for (int i = 0; i <= str.length()-1; i++)
		{
			for(int k = i; k <= str.length()-1; k++) {
				String prefix = str.substring(i, k);
				if (dict.contains(prefix)) {
			
						if((prefix.length() > 2)) {
							matchCounter++;
						}
					
					}
				}
			}
		
	}

	public static void main (String [] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		int record = 0;
		while(true) {
			boolean[] checked = new boolean[63];
			int iterationCounter = 0;
			//avg(60) = 24, avg(30) = 22, avg(120) = 25
			while(iterationCounter < 60) {
				for(int i = 0; i < cipher.length; i++) {
					Random r = new Random();
					int letter;
					int low = 0;
					int high = common.length - 1;
					letter = r.nextInt(high-low);  
					for(int k = 0; k < cipher.length; k++) {
						if ((cipher[k] == cipher[i]) && !(checked[cipher[i]])) {
							solution[k] = common[letter];
							for(int p = 0; p < symbols.length; p++) {
								if(symbols[p] == cipher[k]) {
									cipherKey[p] = common[letter];
								}
							}
						}
					}
				}
				String str = String.join(",", solution);
				str = str.replace(",", "");
				wbreturn result = wordBreak(dict, str, "");
				if(result != null) {
					for(int i = result.from; i < result.to; i++) {
						checked[cipher[i]] = true;
					}
				}
				iterationCounter++;
			}
			String str = String.join(",", solution);
			str = str.replace(",", "");
			String key = String.join(",", cipherKey);
			key = key.replace(",","");
			wordCount(dict, str, "");
			total += matchCounter;
			System.out.println(matchCounter);
			if(matchCounter > record) {
				record = matchCounter;
				writeToFile(str, key, matchCounter);
			}
			globalCounter++;
			matchCounter = 0;
			System.out.println("average: " + total/globalCounter);

		}
	}
}
