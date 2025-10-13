abstract class Anonymous
{
    abstract int method(int a);
    abstract void dog();
    public static void main(String[] args) {
        Anonymous obj=new Anonymous(){
            int method(int a)
            {
                System.err.println("method a val : "+a);
                return a;
            }
            void dog()
            {
                System.err.println("eating");
            }
        };
        System.err.println(obj.method(2));
        obj.dog();
    }
    
}