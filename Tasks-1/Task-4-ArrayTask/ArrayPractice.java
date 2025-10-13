public class ArrayPractice
{
    public static void main(String[] args) {
        String[] names={"padma", "kavya", "josh"};
        for(int i=0;i<names.length;i++)
        {
           if(names[i].equals("kavya"))
           {
            names[i]="vijay";
            
           }
           System.err.println(names[i]);
        }
        
    }
}