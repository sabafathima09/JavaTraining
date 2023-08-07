//package com.lumen.io;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
// 
//public class FileReadWrite {
//	    public static void main(String[] args) {
//	    	FileReader filereader = null ;
//	    	FileWriter filewriter = null ;
//	    	try {
//	         FileReader filereader1 = new  FileReader("demo1.txt");
//	          FileWriter filewriter1 = new  FileWriter("trial.txt");
//	          int num=FileReader.read();
//	          FileWriter.write((char)num);
//	          do {
//	 			 num = fileReader.read();
//	 			 fileWriter.write(char)num;
//	 	     }while(num!=-1);
//			try {
//				num = FileReader.read();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	          FileWriter.write((char)num);
//	     do {
//			 value = (char)reader.read();
//			 writer.write(value);
//	     }while(num!=-1);
//	     }catch (FileNotFoundException e) {
//	    	 System.out.println(e.getMessage());
//	     }
//	     catch (IOException e) {
//	    	 System.out.println(e.getMessage());
//	     }finally {
//	    	 try {
//	    		 if(fileWriter!=null)
//	    			 
//	    	 }
//	    	 
//	    	 
//	    	 
//	    }
//	    	 
//	    	 
//	    	 
//	     }
//}
