class  VariableTest{

    public static void main(String[] args){

        byte B=122;
        System.out.println(B);
        long  l1=34234234234L;
        System.out.println("long type demo");
        System.out.println(l1);

        float f1=144.3F;
        System.out.println(f1);
        double d1=1344.432;
        System.out.println(d1);

        char ch='a';
        System.out.println("char typpe:"+ch);
        char ln='\n';
        char tb='\t';
        System.out.print("换行符"+ln);
        System.out.print("换行");


        System.out.print("制表符号"+tb);
        System.out.println("制表end");

        char specialChar='\u0043';
        System.out.println("sepcial char:unicode=>"+specialChar);

        char t='a';
        byte bt=3;
        System.out.println(t+bt);


        int  i1=128;
        byte b1=(byte)i1;
        System.out.println(b1);//输出-128

    }

}