package com.bear.concurrency;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Piped {
	public static void main(String[] args) throws IOException {
		PipedWriter out=new PipedWriter();
		PipedReader in=new PipedReader();
		out.connect(in);
		Thread printThread=new Thread(new Print(in),"PrintThread");
		printThread.start();
		Thread outThread=new Thread(new Out(out),"OutThread");
		outThread.start();
//		int receive=0;
//			try {
//				while ((receive=System.in.read())!=-1) {
//				out.write(receive);
//			}
//			}finally {
//				out.close();
//			}
	}
	
	static class Print implements Runnable{
		private PipedReader in;
		
		public Print(PipedReader in) {
			super();
			this.in = in;
		}

		@Override
		public void run() {
			int receive=0;
			try {
				while ((receive=in.read())!=-1){
					System.out.print((char)receive);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	static class Out implements Runnable{
		private PipedWriter out;
		
		public Out(PipedWriter out) {
			super();
			this.out = out;
		}

		@Override
		public void run() {
			int receive=0;
			try {
				try {
					while ((receive=System.in.read())!=-1) {
					out.write(receive);
}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}finally {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
