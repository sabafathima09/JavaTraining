package com.lumen.training;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ScatteredReads {
	public static void main(String[] args)throws Exception {
		try(RandomAccessFile randomFile = new RandomAccessFile("demo.txt","rw");
				//get the channel from the file
				FileChannel channel = randomFile.getChannel();){
					
				//create the buffer with the size for reading
				ByteBuffer buffer1 = ByteBuffer.allocate(2000);
				ByteBuffer buffer2 = ByteBuffer.allocate(200);
				
				//create a ByteBuffer array
				ByteBuffer[] byteArray = {buffer1,buffer2};
				
				//read from channel into buffer
				channel.read(byteArray);
				System.out.println();
				buffer1.flip();
				buffer2.flip();
				while(buffer1.hasRemaining()) {
					System.out.print((char) buffer1.get());
				}
				System.out.println();
				while(buffer2.hasRemaining()) {
					System.out.print((char) buffer2.get());
				}
		}
	}
}
