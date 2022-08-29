package level24_iteator_traverse;

import java.util.*;

public class NewTitle {
	private int id;            //ID
	private String titleName;  //名称
	private String creater;    //创建者
	public NewTitle() {
	}
	public NewTitle(int id, String titleName, String creater) {
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
		// 1、创建多个各类新闻标题对象
		NewTitle car = new NewTitle(1, "汽车", "管理员");
		NewTitle test = new NewTitle(2, "高考", "管理员");
		// 2、创建存储各类新闻标题的集合对象
		Set newsTitleList = new HashSet();
		// 3、按照顺序依次添加各类新闻标题
		newsTitleList.add(car);
		newsTitleList.add(test);
		// 4、获取新闻标题的总数
		System.out.println("新闻标题数目为：" + newsTitleList.size() + "条");
		// 5、使用iterator()获取Iterator对象
		Iterator iterator = newsTitleList.iterator();
		// 6、使用Iterator遍历集合
		while(iterator.hasNext()){
			NewTitle title = (NewTitle) iterator.next();
			System.out.println(title.getTitleName());
		}
		System.out.println("************************");
		// 任务一：使用增强型for遍历集合并换行输出结果
        for(NewTitle title:(HashSet<NewTitle>)newsTitleList){
			System.out.println(title.getTitleName());
		}

	}
}