package Ex3;

import java.util.List;
@FunctionalInterface
public interface BooksDistinctByAuthor {
    List<String> run(List<Book> books);
}
