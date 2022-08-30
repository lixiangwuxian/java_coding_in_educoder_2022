package level36_write_text_by_fileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterFiletTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Writer fw=null;
		try {
			  //创建一个FileWriter对象
			  fw=new FileWriter("/data/workspace/myshixun/src/test.txt"); 
			  //fw=new FileWriter("C:\\myDoc\\简介.txt",true); 
			  //任务一：写入信息"我热爱我的团队！"
              fw.write("我热爱我的团队！");
			  //任务二：刷新缓冲区
			  fw.flush();
			 
		}catch(IOException e){
			  System.out.println("文件不存在!");
		}finally{
			try {
				if(fw!=null)
					fw.close();  //关闭流
	 	     } catch (IOException e) {
				e.printStackTrace();
			 }
		}
	}

}

