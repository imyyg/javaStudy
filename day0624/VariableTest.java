class VariableTest{
	public static void main(String[] args){
		long l1 = 123;
        int i1 = l1 + 5;
        System.out.println(i1); //编译通过，输出128
        
        //编译不通过，21883843298798432超出int型最大范围
        // long l2 = 21883843298798432;
        // int i2 = l2;
        
        //编译不通过，12.8被默认为double型，不能将double型常量赋值给float型变量
        float f1 = 12.8;
	}
}