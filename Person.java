/*
 * 这个是一个关于人的类
 */
class Person {
	private String name;
	private int age;

	public Person() {}

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void toString() {
		System.out.println("Person:[name=" + name + ", age=" + age + "]");
	}
}