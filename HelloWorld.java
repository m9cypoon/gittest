/*
 * 测试Git的java文件
 */
class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Git");

		System.out.println(add(3, 4));
	}

	public static int add(int a, int b) {
		return a + b;
	}
}