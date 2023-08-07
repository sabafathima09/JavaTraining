package com.lumen.training;


	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.RandomAccessFile;
	import java.nio.ByteBuffer;
	import java.nio.channels.FileChannel;

	public class WriteFile {

		public static void main(String[] args) {

			//create a file for reading
			try(RandomAccessFile randomFile = new RandomAccessFile("demo.txt","rw");
			//get the channel from the file
			FileChannel channel = randomFile.getChannel();){
				
			//create the buffer with the size for reading
			ByteBuffer buffer = ByteBuffer.allocate(2000);
			
			//read from channel and write into buffer
			buffer.put("Hello".getBytes());
			
			//flip the buffer
			buffer.flip();
			
			//write into the channel from buffer
			channel.write(buffer);
			
			//flip the buffer to write mode
			buffer.flip();
			
			//write into the channel from buffer
			channel.read(buffer);

			//flip the buffer to show data
			buffer.flip(); // buffer in read mode
			//now buffer is in read mode
			while(buffer.hasRemaining()) {
				//get the data this is in bytes so convert to chars
				char c = (char) buffer.get();
				System.out.print(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}

