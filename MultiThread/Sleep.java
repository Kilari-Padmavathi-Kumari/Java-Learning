class Sleep implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println(i);
        try{
            Thread.sleep(23);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        Sleep obj=new Sleep();
        Thread obj1=new Thread(obj);
        obj1.start();
        for(int i=11;i<20;i++)
        {
            System.err.println(i);
        }
    }
} 