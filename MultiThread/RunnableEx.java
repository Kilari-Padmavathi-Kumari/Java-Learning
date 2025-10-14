class RunnableEx implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println(i);
    }
    public static void main(String[] args) {
        RunnableEx obj=new RunnableEx();
        Thread obj1=new Thread(obj);
        obj1.start();
        for(int i=11;i<20;i++)
        {
            System.err.println(i);
        }
    }
} 