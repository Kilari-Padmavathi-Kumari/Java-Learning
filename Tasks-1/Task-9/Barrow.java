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
    void borrowBook()
    {
       System.err.println(title +"  borrow this book for  "+price);
    }
    void returnBook()
    {
        System.err.println("return  "+title);
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
    void borrowBook()
    {
       System.err.println(name +"  Borrow book from Author cls her age is "+age);
    }
    void returnBook()
    {
        System.err.println("return  "+name);
    }

}
public class Barrow
{
    public static void main(String[] args) {
        Book b=new Book();
        b.setTitle("The darkness");
        b.setPrice(300);
        System.err.println("Book title : "+b.getTitle());
        System.err.println("price of the book : "+b.getPrice());
        b.borrowBook();
        b.returnBook();
        Author a=new Author();
        a.setName("jon");
        a.setAge(45);
        System.err.println("book author : "+a.getage());
        System.err.println("age of the person : "+a.getName());
        a.borrowBook();
        a.returnBook();
    }
}