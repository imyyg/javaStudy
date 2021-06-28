class VariableTest{
	public static void main(String[] args){
		int myAge = 27;
		System.out.println(myAge);

		myAge = 26;
		System.out.println(myAge);

		int myClassNumber;
		getMyClass();
		System.out.println(myClassNumber);
	}


	public static void getMyClass(){
		myClassNumber = 1;
	}

}