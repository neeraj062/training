package io;

import java.io.*;

public class IoEx4 {
	public static void main(String[] args) {
		IoEx4 ui = new IoEx4();
		try {
		ui.execute();
	}catch(Exception e) {
		System.out.println("Problem in inputfile");
	}
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long executionTime=endTime-startTime;
		
		System.out.println("Program Exceution time : "+executionTime);
		}
	
	public void execute() throws Exception{
		InputStreamReader reader= null;
		OutputStreamWriter writer=null;
		try {
			reader = new InputStreamReader(System.in);
			writer= new OutputStreamWriter(System.out);
			
			int read;
			while((read=reader.read())>=0 ) {
				//os.write(read);
				writer.write(read);
				writer.flush();
				char ch = (char)read;
				if(ch=='z')
					break;
				//System.out.write(read);
			}
		}catch(Exception e) {
			//e.printStackTrace();
		}
		finally {
			try {
				System.out.println("File is Successfully copied");
			}catch(Exception e) {
				System.out.println("Couldn't close the file properly");
			}
		}
	}	
}

