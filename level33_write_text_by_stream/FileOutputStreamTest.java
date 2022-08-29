package level33_write_text_by_stream;

import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args){
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("/data/workspace/myshixun/src/test.txt",true);
			String str="好好学习Java";
			byte[] words=str.getBytes();
            //任务：调用方法将str写入test.txt
            fos.write(words,0,words.length);
			System.out.println("hello文件已更新");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件更新时出错！");
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}