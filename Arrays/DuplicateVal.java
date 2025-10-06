import java.util.*;

public class DuplicateVal
{
    public static void main(String[] args) {
        int[] str={1,2,3,4,5,4,5};

      for(int i=0;i<str.length;i++)
      {
        for(int j=i+1;j<str.length;j++)
        {
           if(str[i]==str[j])
           {
               System.err.println(str[i]);
           }
        }
      }
            
    }
}