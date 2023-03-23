package bookStore;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class MyStore implements Store{
    private Set<Book> books;
    @Override
    public boolean add(Book o) {
        boolean result = true;
        for (Book book : books){
            if(book.isTheSameType(o)){
                result = false;
            } else {
                books.add(o);
            }
        }
        return result;
    }

    @Override
    public void remove(Book o) {
        books.remove(o);
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        List<Book> result = new LinkedList<Book>();
        for (Book book : books){
            if(book.getAuthor() == author){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        List<Book> result = new LinkedList<Book>();
        for (Book book : books ) {
            if(book.getPublishedYear().isAfter(from)){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        List<Book> result = new LinkedList<Book>();
        for (Book book : books ) {
            if(book.getPublishedYear().isAfter(from) && book.getPublishedYear().isBefore(to)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public void clear() {
        books.clear();
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
        return null;
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return null;
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        return null;
    }
}
