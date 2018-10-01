import java.lang.*;
class Book
{
  private String name;
  private String author;
  private int numPages;
  public Book ()
  {
    name="IT";
    author="Stiven King";
    numPages=913;
  }
  public Book (int num)
  {
    numPages = num;
  }
  public Book (String n)
  {
    name = n;
  }
   public Book (String a, String n)
  {
    author = a;
    name=n;

  }
  public Book (String n, String a, int num )
  {
    name=n;
    author=a;
    numPages=num;
  }
  public void setName (String n)
  {
    name = n;
  }
  public void setAuthor (String a)
  {
    author = a;
  }
  public void setNumPages (int n)
  {
    numPages = n;
  }
  public String getName ()
  {
    return name;
  }
  public String getAuthor ()
  {
    return author;
  }

  public int getNumPagers ()
  {
    return numPages;
  }

  public String ToString(){
      return "Name book: "+name+" \nAuthor:"+author+"\nNumbers pages: "+numPages+"\n";
  }
}
public class BookTest
{
  public static void main (String[]args)
  {
      Book b= new Book();
      System.out.println(b.ToString());
      b.setName("Dark tower");
      System.out.println(b.ToString());
  }
}
