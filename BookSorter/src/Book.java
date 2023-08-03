
public class Book implements Comparable<Book> {

	private String name;
	private int numberOfPages;
	private String author;
	private int releaseDate;
	
	public Book(String name, int numberOfPages, String author, int releaseDate) {
		super();
		this.name = name;
		this.numberOfPages = numberOfPages;
		this.author = author;
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public int compareTo(Book b) {
		return name.compareTo(b.name);
	}
}
