package com.lumen.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFile {

	public static void main(String[] args) {

		//create a file for reading
		try(RandomAccessFile randomFile = new RandomAccessFile("demo.txt","rw");
		//get the channel from the file
		FileChannel channel = randomFile.getChannel()){
		//create the buffer with the size for reading
		ByteBuffer buffer = ByteBuffer.allocate(100);
		
		//read from channel and write into buffer
		int bytesRead = channel.read(buffer);
		System.out.println(bytesRead);
		
		//filp the buffer
		buffer.flip();
		
		//now buffer is in read mode
		while(buffer.hasRemaining()) {
			//get the data this is in bytes so covert to chars
			char c = (char) buffer.get();
			System.out.print(c);
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	}