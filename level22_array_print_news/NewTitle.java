package level22_array_print_news;

import java.util.ArrayList;
import java.util.List;
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
		// 具体实现步骤
		// 1、创建多个各类新闻标题对象
		NewTitle car = new NewTitle(1, "汽车", "管理员");
		NewTitle test = new NewTitle(2, "高考", "管理员");
		// 2、创建存储各类新闻标题的集合对象
		List newsTitleList = new ArrayList();
		// 3、按照顺序依次添加各类新闻标题
		newsTitleList.add(car);
		newsTitleList.add(test);
		// 4、获取新闻标题的总数
		System.out.println("新闻标题数目为：" + newsTitleList.size() + "条");
		// 5、根据位置获取相应新闻标题、逐条打印每条新闻标题的名称，也就是我们常说的遍历集合对象
		for (int i = 0; i < newsTitleList.size(); i++){
			//任务一：遍历集合获取新闻标题，请将下列注释恢复
			NewTitle title=(NewTitle)newsTitleList.get(i);
			System.out.println(i+1+":"+title.getTitleName());
		}

	}
}