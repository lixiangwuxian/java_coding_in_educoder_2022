package level12_usage_of_instanceof;

public abstract class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 20;// 亲密度

	/**
	 * 无参构造方法
	 */
	public Pet() {
	}

	/**
	 * 有参构造方法
	 * 
	 * @param name 昵称
	 */
	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0 || health > 100) {
			System.out.println("健康值应该在0至100之间，默认值为60。");
			this.health = 60;
			return;
		}
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if (love < 0 || love > 100) {
			System.out.println("亲密度应该在0至100之间，默认值为10。");
			this.love = 10;
			return;
		}
		this.love = love;
	}

	/**
	 * 输出宠物信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" +
				this.name + "，我的健康值是" + this.health
				+ "，我和主人的亲密程度是" + this.love + "。");
	}

	public abstract void toHospital();

	/**
	 * 抽象方法eat(),负责宠物吃饭功能。
	 */
	public abstract void eat();

}

class Dog extends Pet {
	private String strain;// 品种

	public Dog() {
	}

	/**
	 * 有参构造方法。
	 * 
	 * @param name   昵称
	 * @param strain 品种
	 */
	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void print() {
		super.print();
		System.out.println("我是一只" + this.getStrain() + "犬。");
	}

	public void toHospital() {
		this.setHealth(60);
		System.out.println("打针、吃药");
	}

	/**
	 * 实现吃食方法。
	 */
	public void eat() {
		if (getHealth() >= 100) {
			System.out.println("狗狗" + this.getName() + "吃饱了，不需要喂食了！");
		} else {
			this.setHealth(this.getHealth() + 3);
			System.out.println("狗狗" + this.getName() + "吃饱啦！健康值增加3。");
		}
	}

	// 狗狗叼飞碟
	public void catchingFlyDisc() {
		System.out.println("狗狗叼飞碟");
	}
}

class Penguin extends Pet {
	private String sex;// 性别

	public Penguin() {
	}

	/**
	 * 有参构造方法。
	 * 
	 * @param name 昵称
	 * @param sex  性别
	 */
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void print() {
		super.print();
		System.out.println("我的性别是" + this.getSex() + "。");
	}

	public void toHospital() {
		this.setHealth(70);
		System.out.println("吃药、疗养");
	}

	/**
	 * 实现吃食方法。
	 */
	public void eat() {
		if (getHealth() >= 100) {
			System.out.println("企鹅" + this.getName() + "吃饱了，不需要喂食了！");
		} else {
			this.setHealth(this.getHealth() + 5);
			System.out.println("企鹅" + this.getName() + "吃饱啦！健康值增加3。");
		}
	}

	public void swim() {
		System.out.println("企鹅在南极游泳");
	}
}

class Test {
	public static void main(String[] args) {
		// Pet pet = new Dog();
		Pet pet = new Penguin();
		int demo = 0;
		// 使用instanceof判断具体宠物类型，调用特定宠物方法
		// 判断父类的对象pet所指向的到底是哪一个类，如果是Dog类则将if的判断条件(demo==0)替换
		// 如果是Penguin类则将else if的判断条件(demo==1)替换
		if (pet instanceof Dog) {
			demo = 0;
		} else if (pet instanceof Penguin) {
			demo = 1;
		}
		if (demo == 0) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();// 执行狗狗特有的方法接飞盘
		} else if (demo == 1) {
			Penguin penguin = (Penguin) pet;
			penguin.swim();// 执行企鹅特有的方法在南极游泳
		}
	}
}
