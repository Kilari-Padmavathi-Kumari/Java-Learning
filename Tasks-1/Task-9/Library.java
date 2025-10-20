class Book
{
    private String title;
    private int price;
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }
}
class Author
{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getage()
    {
        return age;
    }

}
public class Library
{
    public static void main(String[] args) {
        Book b=new Book();
        b.setTitle("The darkness");
        b.setPrice(300);
        System.err.println("Book title : "+b.getTitle());
        System.err.println("price of the book : "+b.getPrice());
        Author a=new Author();
        a.setName("jon");
        a.setAge(45);
        System.err.println("book author : "+a.getage());
        System.err.println("age of the person : "+a.getName());
    }
}