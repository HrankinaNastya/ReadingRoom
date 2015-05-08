package org.room.reading.dao.interfaces;

import org.room.reading.entities.Author;
import org.room.reading.entities.Book;
import org.room.reading.entities.Genre;

import java.util.List;

/**
 * Created by Анастасия on 04.05.2015.
 */
public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);

}
