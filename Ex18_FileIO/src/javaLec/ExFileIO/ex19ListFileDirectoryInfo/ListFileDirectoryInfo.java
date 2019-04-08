package javaLec.ExFileIO.ex19ListFileDirectoryInfo;

import java.io.File;

public class ListFileDirectoryInfo {
	public static void main(String[] args) {
		File myDir = new File(".");
		File[] fList =  myDir.listFiles();
		for(File f : fList) {
			System.out.println(f.getName());
			if(f.isDirectory())
				System.out.println("\t \t DIR");
			else
				System.out.println("\t \t FILE");
		}
	}
}





