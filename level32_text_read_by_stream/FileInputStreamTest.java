package level32_text_read_by_stream;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args){
		FileInputStream fis=null;
		//创建流对象
		try {
			fis=new FileInputStream("/data/workspace/myshixun/src/test.txt");
			int data;
			System.out.println("可读取的字节数："+fis.available());
			System.out.print("文件内容为：");
			//read()方法是从输入流读取1个8位的字节，把它转化为0-255之间的整数返回。将返回的整数转换为字符
			//使用read()方法循环读数据
			for(int i=0;(data=fis.read())!=-1;i++){
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				//关闭流对象
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}