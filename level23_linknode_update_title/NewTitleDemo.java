package level23_linknode_update_title;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class NewTitleDemo {
	private int id;            //ID
	private String titleName;  //名称
	private String creater;    //创建者
	public NewTitleDemo() {
	}
	public NewTitleDemo(int id, String titleName, String creater) {
		this.id = id;
		this.titleName = titleName;
		this.creater = creater;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	
	public static void main(String[] args) {
		// 具体实现步骤
		// 1、创建多个各类新闻标题对象
		NewTitleDemo car = new NewTitleDemo(1, "汽车", "管理员");
		NewTitleDemo medical = new NewTitleDemo(2, "医学", "管理员");		
		// 2、创建存储各类新闻标题的集合对象
		LinkedList newsTitleList = new LinkedList();		
		// 3、添加头条新闻标题和末尾标题
		newsTitleList.addFirst(car);
		newsTitleList.addLast(medical);
		// 4、获取头条、以及最末条新闻标题
        //任务一：请替换第46行，定义NewTitle对象first，获取头条新闻标题	
		//String first="";
		NewTitleDemo first=(NewTitleDemo)newsTitleList.getFirst();
		System.out.println("头条的新闻标题为:" + first.getTitleName());
        //任务二：请替换第49行，定义NewTitle对象last，获取最末条新闻标题
		//String last="";
		NewTitleDemo last=(NewTitleDemo)newsTitleList.getLast();
		System.out.println("排在最后的新闻标题为:" + last.getTitleName());
		// 5、删除头条和最末条新闻标题
		NewTitleDemo firstNews=(NewTitleDemo)newsTitleList.removeFirst();
		System.out.println("删除的头条新闻标题为:"+firstNews.getTitleName());
		NewTitleDemo lastNews=(NewTitleDemo)newsTitleList.removeLast();
		System.out.println("删除的末条新闻标题为:"+lastNews.getTitleName());
		System.out.println("删除后剩余的新闻条数："+newsTitleList.size());
	}
}