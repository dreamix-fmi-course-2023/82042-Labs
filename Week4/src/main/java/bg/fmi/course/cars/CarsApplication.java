package bg.fmi.course.books;

import bg.fmi.course.books.model.Book;
import bg.fmi.course.books.repository.BookRepository;
import bg.fmi.course.books.repository.BookRepositoryImpl;
import bg.fmi.course.books.service.BookService;
import bg.fmi.course.books.service.BookServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class WdwjApplication implements CommandLineRunner {
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        BookRepository bookRepository = new BookRepositoryImpl();
        bookService = new BookServiceImpl(bookRepository);

        Book book = new Book();

        book.setAuthor("ASD");
        book.setIsbn("ISBNASD");

        bookService.add(book);

        System.out.println(bookService);

    }

    public static void main(String[] args) {
        SpringApplication.run(WdwjApplication.class, args);
    }
}