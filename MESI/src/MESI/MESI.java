/*
Command Line:
MESI "input_file" "no_processor" "cache_size" "block_size"
*/
package MESI;

import java.io.File;

public class MESI {

	public static boolean verbose;
	
	public static void main(String[] args) {
		//String filename = args[0] + ".prg";
		int coreNum = Integer.parseInt(args[1]);
		int cacheSize = Integer.parseInt(args[2]);
		int blockSize = Integer.parseInt(args[3]);
		String [] filename = new String[coreNum];
		verbose = Boolean.parseBoolean(args[4]);
		for(int i=0; i<coreNum; i++){
			filename[i] = args[0] + i + ".prg";
			if(verbose){
				System.out.println("The input file is:" + filename[i]);
			}
		}
		if(verbose){
			System.out.println("The core number is: " + coreNum + " The cachesize is: " + cacheSize + " The block size is: " + blockSize);
		}
	}

}