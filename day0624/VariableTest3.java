class VariableTest3{
    public static void main(String[] args){
        //精度损失举例-1
        double d1 = 12.9;
        int i1 = (int)d1;
        System.out.println(i1);  //12
        
        //无精度损失
        long l1 = 132;
        short s1 = (short)l1;
        System.out.println(s1); //132
        
        //精度损失举例-2
        int i2 = 128;
        byte b1 = (byte)i2;
        System.out.println(b1); //-128
    }
}