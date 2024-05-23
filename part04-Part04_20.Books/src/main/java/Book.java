public class Book {

  private String title;
  private int pages;
  private int publicationYr;

  public Book(String title, int pages, int pubYr) {
    this.title = title;
    this.pages = pages;
    this.publicationYr = pubYr;
  }

  public String getTitle() {
    return title;
  }

  public String getEverything() {
    return title + ", " + pages + " pages, " + publicationYr;
  }
}
