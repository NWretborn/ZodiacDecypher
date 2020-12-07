package decypher;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Random;

import decypher.statCiph.wbreturn;

import java.util.List;

public class combined {

	public static int total = 0;
	public static int matchCounter;
	public static List<String> dict = Arrays.asList("the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","part","murder","kill","death","pistol","gun","police","crime","insane","zodiac","killer","head","shot");

	public static String[] mostCommon = {"e","t","a","o","i","n","s","h","r"};
	public static String[] leastCommon = {"v","k","x","j","q","z"};

	public static String[] common = { "a", "b", "c", "d", "e", "f", "g",
			"h", "i", "l", "m", "n", "o", "p", "r", "s", "t",
			"u", "w", "y" };

	public static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g",
			"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z" };

	//First zodiac cipher
	public static int triangle = 0;
	public static int hsquare = 1;
	public static int P = 2;
	public static int dash = 3;
	public static int Z = 4;
	public static int u = 5;
	public static int B = 6;
	public static int rK = 7;
	public static int O = 8;
	public static int R = 9;
	public static int dK = 10;
	public static int rP = 11;
	public static int X = 12;
	public static int W = 13;
	public static int V = 14;
	public static int plus = 15;
	public static int rE = 16;
	public static int G = 17;
	public static int y = 18;
	public static int F = 19;
	public static int dO = 20;
	public static int H = 21;
	public static int dsquare = 22;
	public static int K = 23;
	public static int I = 24;
	public static int Q = 25;
	public static int M = 26;
	public static int J = 27;
	public static int dV = 28;
	public static int dtriangle = 29;
	public static int T = 30;
	public static int dT = 31;
	public static int N = 32;
	public static int D = 33;
	public static int fO = 34;
	public static int vlO = 35;
	public static int S = 36;
	public static int hlO = 37;
	public static int fsquare = 38;
	public static int A = 39;
	public static int rF = 40;
	public static int rL = 41;
	public static int E = 42;
	public static int L = 43;
	public static int rD = 44;
	public static int rR = 45;
	public static int rdash = 46;
	public static int ftriangle = 47;
	public static int zodiac = 48;
	public static int dL = 49;
	public static int rC = 50;
	public static int ij = 51;
	public static int tj = 52;
	public static int square = 53;
	public static int rJ = 54;

	public static int symbols[] = {
			triangle, hsquare, P, dash, Z, u, B, rK, O, R, dK, rP, X, W, V, plus, rE, G, y, F, dO, H, dsquare, K, I, Q, M, J, dV, dtriangle, T, dT,
			N, D, fO, vlO, S, hlO, fsquare, A, rF, rL, E, L, rD, rR, rdash, ftriangle, zodiac, dL, rC, ij, tj, square, rJ
	};


	public static int cipher[] = 

		{

				triangle, hsquare, P, dash, Z, dash, u, B, hsquare, rK, O, R, dK, rP, X, dK, B,
				W, V, plus, rE, G, y, F, dO, triangle, H, P, dsquare, K, I, Q, y, rE,
				M, J, y, dV, u, I, rK, dtriangle, Q, T, dT, N, Q, y, D, fO, hlO,
				S, vlO, dash, triangle, fsquare, B, P ,O, R, A, u, hsquare, rF, R, rL, Q, E,
				rK, dV, L, M, Z, J, rD, rR, rdash, rP, F, H, V, W, rE, ftriangle, y,
				dsquare, plus, Q , G, D, triangle, K, I, hlO, dO, Q, X, ftriangle, fO, zodiac, S, vlO,
				R, N, dT, I, y, E, rL, O, ftriangle, Q, G, B, dL, Q, S, fsquare, B,
				L, rD, dash, P, fsquare, B, dsquare, X, Q, E, H, M, u, dV, R, R, rK,

				rC, Z, K, Q, rP, I, hlO, W, Q, ij, ftriangle, fO, L, M, rR, triangle, fsquare,
				B, P, D, R, plus, tj, dK, dO, rdash, N, vlO, rE, E, u, H, rK, F,
				Z, rC, rP, O, V, W, I, fO, plus, dT, L, hlO, rL, dV, R, dO, H,
				I, triangle, D, R, square, T, y, rR, rdash, rD, rE, dash, dsquare, X, J, Q, A,
				P, fO, M, ftriangle, R, u, dT, hsquare, L, hlO, N, V, E, K, H, dK, G, 
				rR, I, ij, rJ , rK, fO, triangle, ftriangle, L, M, rL, N, A, hlO, Z, vlO, P,
				zodiac, u, rP, rK, A, triangle, fsquare, B, V, W, rdash, plus, V, T, dT, O, P,
				dV, dK, S, rR, rL, rF, u, rE, dO, dtriangle, D, zodiac, G, hsquare, hsquare, I, M,

				N, rK, hlO, S, rC, E, dash, triangle, hsquare, hsquare, Z, rF, A, P, fsquare, B, V,
				rP, rE, X, Q, W, Q, square, F, fsquare, ftriangle, rC, plus, dsquare, triangle, A, triangle, B,
				hsquare, O, T, fO, R, u, rC, plus, square, rD, y, Q, square, dV, S, Q, W,
				V, Z, rE, G, y, K, E, square, T, y, A, triangle, hsquare, fsquare, L, dT, square,
				H, ij, F, B, X, triangle, zodiac, X, A, D, rD, rdash, dtriangle, L, ij, dK, Q,
				square, rE, rD, fsquare, fsquare, dO, rE, fO, P, O, R, X, Q, F, hsquare, G, rC,
				Z, dsquare, J, T, dT, Q, square, ftriangle, J, I, plus, rR, B, P, Q, W, dO,
				V, E, X, rR, triangle, W, I, dO, Q, E, H, M, hlO, dK, u, I, rK

		};

	public static String solution[] = new String[408];
	public static String cipherKey[] = new String[55];
	//ETAOINSHR most common VKXJQZ least common
	public static int cipherCount[] = {
			14,11,11,6,8,10,12,9,7,12,
			7,6,9,9,9,8,10,7,10,6,
			8,8,6,5,12,21,8,5,6,3,
			6,7,6,6,8,4,6,8,10,8,
			3,5,9,8,6,7,5,8,4,1,
			6,4,1,8,1};


	public static void writeToFile(String str, String[] key, int counter) throws FileNotFoundException, UnsupportedEncodingException {
		try {
			Files.write(Paths.get("dynSolutions.txt"), ("WordCount: " + counter + " key: " + Arrays.toString(key) + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("dynSolutions.txt"), (str + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("dynSolutions.txt"), ("******" + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		}
	}
	
	public static void writeToFileStat(String str, String[] key, int counter) throws FileNotFoundException, UnsupportedEncodingException {
		try {
			Files.write(Paths.get("statSolutions.txt"), ("WordCount: " + counter + " key: " + Arrays.toString(key) + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("statSolutions.txt"), (str + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("statSolutions.txt"), ("******" + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
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
					if(matchCounter < 1) {
						if((prefix.length() > 3)) {
							wbreturn var = new wbreturn(prefix,i,k);
							return var;
						}
					}
					if(matchCounter == 1) {
						if((prefix.length() > 2)) {
							wbreturn var = new wbreturn(prefix,i,k);
							return var;
						}
					}
					if(matchCounter > 1) {
						if((prefix.length() > 1)) {
							wbreturn var = new wbreturn(prefix,i,k);
							return var;
						}
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
					if(matchCounter < 1) {
						if((prefix.length() > 3)) {
							matchCounter++;
						}
					}
					else if(matchCounter == 1) {
						if((prefix.length() > 2)) {
							matchCounter++;
						}
					}
					else if(matchCounter > 1) {
						if((prefix.length() > 1)) {
							matchCounter++;
						}
					}
				}
			}
		}
	}

	public static wbreturn wordBreak2(List<String> dict, String str, String out)
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
					
						if((prefix.length() > 1)) {
							wbreturn var = new wbreturn(prefix,i,k);
							return var;
						}
					
				}
			}
		}
		return null;
	}

	public static void wordCount2(List<String> dict, String str, String out)
	{
		for (int i = 0; i <= str.length()-1; i++)
		{
			for(int k = i; k <= str.length()-1; k++) {
				String prefix = str.substring(i, k);
				if (dict.contains(prefix)) {
					
						if((prefix.length() > 1)) {
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
			boolean[] checked = new boolean[55];
			int iterationCounter = 0;
			while(iterationCounter < 100) {
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
			wordCount(dict, str, "");
			total += matchCounter;
			if(matchCounter > 70) {
				record = matchCounter;
				writeToFile(str, cipherKey, matchCounter);
				System.out.println("DynSolution found");
			}
			matchCounter = 0;
			int iterationCounter2 = 0;
			while(iterationCounter2 < 100) {
			for(int i = 0; i < cipher.length; i++) {
				Random r = new Random();
				int letter;
				int low = 0;
				int high = common.length - 1;
				letter = r.nextInt(high-low);  
				for(int k = 0; k < cipher.length; k++) {
					if ((cipher[k] == cipher[i])) {
						solution[k] = common[letter];
						for(int p = 0; p < symbols.length; p++) {
							if(symbols[p] == cipher[k]) {
								cipherKey[p] = common[letter];
							}
						}
					}
				}
			}
			String str2 = String.join(",", solution);
			str2 = str2.replace(",", "");
			wbreturn result2 = wordBreak2(dict, str2, "");
			
		
		wordCount2(dict, str2, "");
		total += matchCounter;
		if(matchCounter > 70) {
			record = matchCounter;
			writeToFileStat(str2, cipherKey, matchCounter);
			System.out.println("stat solution found");
		}
		matchCounter = 0;
		iterationCounter2++;
		}
	}
	}}
