package io;

import java.io.*;

public class IoEx2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		IoEx2 ui = new IoEx2();
		try {
		ui.execute();
	}catch(Exception e) {
		System.out.println("Problem in inputfile");
	}
		long endTime = System.currentTimeMillis();
		long executionTime=endTime-startTime;
		
		System.out.println("Program Exceution time : "+executionTime);
		
		}
	
	public void execute() throws Exception{
		InputStream is= null;
		OutputStream os=null;
		try {
			File inputFile = new File("C:\\Users\\admin\\Desktop\\Neeraj\\Training\\IoExamples\\input.txt");
			is = new FileInputStream(inputFile);
			File outFile = new File("C:\\Users\\admin\\Desktop\\Neeraj\\Training\\IoExamples\\output.txt");
			os=new FileOutputStream(outFile);
			
			int readBytesCount;
			byte[] buffer=new byte[1000];
			while((readBytesCount=is.read(buffer))>=0) {
				os.write(readBytesCount);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(is!=null)
					is.close();
				if(os!=null)
					os.close();
				
				System.out.println("File is Successfully copied");
			}catch(Exception e) {
				System.out.println("Couldn't close the file properly");
			}
		}
	}
		
		
}

