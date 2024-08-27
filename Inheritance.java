class inheritance
{
    public int multi(int x,int y)
    {
        return x*y;
    }
}
class child extends inheritance
{
    public static void main(String[] args)
    {
        inheritance ob1 = new inheritance();
        System.out.println(ob1.multi(5, 10));
    }
}