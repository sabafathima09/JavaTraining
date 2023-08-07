package com.lumen.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GatheredWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(RandomAccessFile randomFile = new RandomAccessFile("demo.txt","rw");
				//get the channel from the file
				FileChannel channel = randomFile.getChannel();){
					
				//create the buffer with the size for reading
				ByteBuffer buffer1 = ByteBuffer.allocate(2000);
				ByteBuffer buffer2 = ByteBuffer.allocate(200);
				
				//add  msgs and buffer is in write mode
				buffer1.put("hello welcome".getBytes());
				buffer2.put("have a nice day".getBytes());
				
				//create a ByteBuffer array
				ByteBuffer[] byteArray = {buffer1,buffer2};
				buffer1.flip();
				buffer2.flip();
				
				//read from channel into buffer
				channel.write(byteArray);
				System.out.println();
		}
	}
}