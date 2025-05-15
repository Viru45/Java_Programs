class GenericClass<T1,T2>
{
    private T1 data1;
    private T2 data2;

    public GenericClass(T1 data1,T2 data2)
    {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void getdata()
    {
        System.out.println("Data1: "+data1);
        System.out.println("Data2: "+data2);
        System.out.println();
    }
}

class GenericDemoEx
{
    public static void main(String[] args)
    {
        GenericClass<Integer,String> obj1 = new GenericClass<>(10,"Viru");
        obj1.getdata();

        GenericClass<Double,Character> obj2 = new GenericClass<>(11.11,'V');
        obj2.getdata();
    }
}