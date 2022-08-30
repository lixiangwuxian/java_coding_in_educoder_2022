package level35_read_text_by_textBuffer;

import  java.io.*;
public class BufferedReaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
	        //创建一个FileReader对象
	        fr=new FileReader("/data/workspace/myshixun/src/test.txt"); 
	        //创建一个BufferedReader 对象
	        br=new BufferedReader(fr); 
	        //读取一行数据 
	        String line=null;
			//使用while循环将test.txt中不是空行的内容输出
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
	        
	    }catch(IOException e){
	            System.out.println("文件不存在!");
	    }finally{
	    	 try {
	    	     //关闭 流
	    		if(br!=null)
	    			br.close();
	    		if(fr!=null)
	    			fr.close(); 
	 	     } catch (IOException e) {
				e.printStackTrace();
			 }
	    }
	}
}
