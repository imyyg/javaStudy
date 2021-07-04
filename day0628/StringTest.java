class StringTest{
	public static void main(String[] args){
		String s1 = "Hello World!";

		System.out.println(s1);

		String s2 = "a";
		String s3 = "";

		char c = ''; //编译不通过

		//--------------------------------

		int number = 1001;
		String numberStr = "学号： ";
		String info = numberStr + number; //+:连接运算
		boolean b1 = true;
		String info1 = info + b1; //+:连接运算
		Sysytem.out.println(info1);

		//----------------------------------
		//练习1
		char c = 'a';
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);
		System.out.println(c + str + num);
		System.out.println(c + (num + str));
		System.out.println((c + num) + str);
		System.out.println(str + num + c);

	}
}