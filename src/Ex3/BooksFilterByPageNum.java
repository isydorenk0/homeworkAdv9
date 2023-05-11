package Ex3;

import java.util.List;

@FunctionalInterface
public interface BooksFilterByPageNum {
    List<Book> run(List<Book> books, int pages);
}
