class ThreadEx extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.err.print("run thread : "+i);
//sleep(3);
        }
         
    }
    static ThreadEx obj=new ThreadEx();
    public static void main(String[] args) {
       
        obj.start();
        for(int i=11;i<20;i++)
        {
            System.err.print("ren 2nd thread : "+i);
        }
       
        
       
        
    }
}