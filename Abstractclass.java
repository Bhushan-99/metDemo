abstract class fun
{
  private int No;
  fun(int N)
  {
    this.No=N;
  }

  abstract protected void add(int a,int b);
  abstract protected void gun();
  void sun()
  {
    System.out.println("Ram ram Pahune");
  }
  public int getNo()
  {
       return No;
  }
}

class Demo extends fun{
   Demo(int no)
   {
     super(no);
   }
    protected void add(int d,int v)
    {
       System.out.println(d+v);
    }
    protected void gun()
    {
       System.out.println(10+29);
    }
}

class Abstractclass
{
  public static void main(String arg[])
  {
   
  Demo fn = new Demo(10);
  
    fn.sun(); 
  }
}