package bg.fmi.course.wdwj;

import bg.fmi.course.wdwj.model.Book;
import bg.fmi.course.wdwj.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WdwjApplication implements CommandLineRunner {
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(WdwjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		Book book = new Book();
		book.setAuthor("ASD");
		book.setIsbn("ISBNASD");

		bookService.add(book);

		System.out.println(bookService);

	}
}
