import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
    TreeSet<Book> book = new TreeSet(); // 1.Set'in oluþturulmasý
    
    //Kitaplarýn set'e atanmasý
    book.add(new Book("Harry Potter and the Philosopher's stone", 223,"J.K. Rowling ",1997));
    book.add(new Book("Harry Potter and the Chamber of Secrets", 352,"J.K. Rowling ",1998));
    book.add(new Book("Harry Potter and the Prisoner of Azkaban", 317,"J.K. Rowling ",1999));
    book.add(new Book("Harry Potter and the Goblet of Fire", 636,"J.K. Rowling ",2000));
    book.add(new Book("Harry Potter and the Order of the Phoenix", 766,"J.K. Rowling ",2003));
    
    System.out.println("====================================================================");
    System.out.println("-------------------Kitap Ýsmine Göre Sýralama-----------------------");
    System.out.println("====================================================================");
    for (Book bookName: book){
        System.out.println("Book Name: "+bookName.getName()+
                "\nNumber of page: "+bookName.getNumberOfPages()+
                "\nAuthor Name: "+bookName.getAuthor()+
                "\nReleased Date: "+bookName.getReleaseDate());
        System.out.println("----------------------------------------------------------------");
    }
    
  
    // 2.set'in oluþturulmasý ve compare metodunun override edilmesi
    TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getNumberOfPages() - o2.getNumberOfPages();
        }
    });

    books.addAll(book); // Ayný kitaplarýn 2.set'e atanmasý

    System.out.println("====================================================================");
    System.out.println("-------------Sayfa Numarasýna Göre Sýralama-------------------------");
    System.out.println("====================================================================");
    for (Book bookPage : books){
        System.out.println("Book Name: "+bookPage.getName()+
                "\nNumber of page: "+bookPage.getNumberOfPages()+
                "\nAuthor Name: "+bookPage.getAuthor()+
                "\nReleased Date: "+bookPage.getReleaseDate());
        System.out.println("----------------------------------------------------------------");
    }
  }
}
