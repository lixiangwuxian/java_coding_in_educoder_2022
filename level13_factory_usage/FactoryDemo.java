package level13_factory_usage;

/**
 * 商品类
 */
class Goods {
	public void price(){
		System.out.println("打印商品价格");
	}

}
class Foods extends Goods {

	@Override
	public void price() {
		System.out.println("打印食品类商品价格");
	}
	

}
class TVs extends Goods {

	@Override
	public void price() {
		System.out.println("打印电视类商品价格");
	}
	
}

/**
 * 商品工厂类
 */
public class FactoryDemo {
	public Goods getGoods(String str){
		if(str.equals("food"))
			return new Foods();
		else
			return new TVs();
	}
    public static void main(String[] args){
		
        Goods good=new Goods();
        Foods food=new Foods();
        TVs tvs=new TVs();
		FactoryDemo factory=new FactoryDemo();
        
        Goods good1=null;
		// 任务一：利用类工厂完成goods1的实例化
		good1=factory.getGoods("food");
		good1.price();
		
		Goods good2=null;
		// 任务二：利用类工厂完成goods2的实例化
		good2=factory.getGoods("tvs");
		good2.price();
	}

}


