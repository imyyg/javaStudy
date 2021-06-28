class VariableTest2{
	public static void main(String[] args){
		byte b1 = 2;
		int i1 = 129;
		//编译不通过
		// byte b2 = b1 + i1;

		int i2 = b1 + i1;
		System.out.println(i2);

		float f1 = b1 + i1;
		System.out.println(f1);


		byte b3 = 100;
		float f2 = b3 + 123.6F;
		System.out.println(f2);

	}
}