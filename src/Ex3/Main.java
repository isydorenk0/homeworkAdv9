package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", "Author 1", 111));
        books.add(new Book("Book 2", "Author 1", 222));
        books.add(new Book("Book 4", "Author 4", 333));
        books.add(new Book("Book 3", "Author 3", 444));

        BooksDistinctByAuthor booksDistinctByAuthor = param -> param.stream().map(Book::getAuthor).distinct().collect(Collectors.toList());
        BooksFilterByPageNum booksFilterByPageNum = (param, pages) -> param.stream().filter(b -> b.getPages() > pages).collect(Collectors.toList());

        System.out.println(booksDistinctByAuthor.run(books));
        System.out.println(booksFilterByPageNum.run(books, 300).toString());

    }
}
