import java.util.*;
public class FinalizedMethod
{
    int a=10;
    protected void finalize()
    {
        System.err.println("finalized method");
    }
    public static void main(String[] args) {
        FinalizedMethod obj=new FinalizedMethod();
        obj=null;
        System.err.println(obj.a);
        System.gc();
        System.err.println("called");

    }
}


/*class Demo {
    protected void finalize() {
        System.out.println("Object is about to be destroyed");
    }
}

public class FinalizedMethod{
    public static void main(String[] args) {
        Demo d = new Demo(); // create object
        d = null;            // object no longer needed
        System.gc();         // ask GC to clean up
        System.out.println("Main finished");
    }
}*/
