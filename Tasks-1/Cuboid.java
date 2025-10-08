public class Cuboid
{
    static int cuboidVolume(int l,int b,int h)
    {
          return (l*b+l*h+h*b);
    }
    public static void main(String[] args) {
        int l=2,b=3,h=4;
        System.out.println(cuboidVolume(l,b,h));
    }
}