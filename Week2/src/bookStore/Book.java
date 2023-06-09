package bookStore;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private BigDecimal price;
    private String publisher;
    private LocalDate publishedYear;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public LocalDate getPublishedYear() {
        return this.publishedYear;
    }

    public void setTitle(String newTitle) {
        if(newTitle != null){
            this.title = newTitle;
        } else {
            throw new RuntimeException("Title should be not empty!");
        }
    }

    public void setAuthor(String newAuthor) {
        if(newAuthor != null){
            this.author = newAuthor;
        } else {
            throw new RuntimeException("Author should be not empty!");
        }
    }

    public void setPrice(BigDecimal newPrice) {
        if(newPrice != null){
            this.price = newPrice;
        } else {
            throw new RuntimeException("Price should be not empty");
        }
    }

    public void setPublisher(String newPublisher) {
        if(newPublisher != null){
            this.publisher= newPublisher;
        } else {
            throw new RuntimeException("Publisher should be not empty!");
        }
    }

    public void setPublishedYear(LocalDate newPublishedYear) {
        if(newPublishedYear.isBefore(LocalDate.now())){
            this.publishedYear = newPublishedYear;
        } else {
            throw new RuntimeException("Published date should be before today!");
        }
    }

    public Book(String newTitle, String newAuthor, BigDecimal newPrice, String newPublisher, LocalDate newPublishedYear) {
        setAuthor(newAuthor);
        setTitle(newTitle);
        setPrice(newPrice);
        setPublisher(newPublisher);
        setPrice(newPrice);
        setPublishedYear(newPublishedYear);
    }

    @Override
    public boolean equals(Object o){
       if(this == o) {
           return true;
       }
       if(o == null || getClass() != o.getClass()) {
           return false;
       }
       Book book = (Book) o;
       return title.equals(book.title) &&
               author.equals(book.author) &&
               publishedYear.equals(book.publishedYear);
    }

    @Override
    public String toString() {
        return "\n\nAuthor: " + this.getAuthor() +
                "\nTitle: " + this.getTitle() +
                "\nPrice: " + this.getPrice() +
                "\nPublisher: " + this.getPublisher() +
                "\nPublished year: " + this.getPublishedYear();
    }
}
