class VariableTest{
	public static void main(String[] args){

        //编译通过，输出123
        //表明long型变量的值后不加L不会报错，会被当作int型
		long l1 = 123;
        System.out.println(l1);
        
        //编译不通过，21883843298798432超出int型最大范围
        long l2 = 21883843298798432;
        int i2 = l2;
        
        //编译不通过:错误: 不兼容的类型: 从double转换到float可能会有损失
        //12.8被默认为double型，不能将double型常量赋值给float型变量
        float f1 = 12.8;
        System.out.println(f1);
	}
}