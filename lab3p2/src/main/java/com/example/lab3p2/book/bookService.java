package com.example.lab3p2.book;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class bookService {
 
    private final bookRepository BookRepository;
 
    @Autowired
    public bookService(bookRepository bookRepository) {
        this.BookRepository = bookRepository;
    }
 
    public List<Book> getAllBooks() {
        return BookRepository.findAll();
    }
 
    public Book addBook(Book book) {
        return BookRepository.save(book);
    }
 
    public Book getBookById(Long id) {
        return BookRepository.findById(id).orElse(null);
    }
 
    public Book updateBook(Long id, Book updatedBook) {
        if (BookRepository.existsById(id)) {
            updatedBook.setId(id);
            return BookRepository.save(updatedBook);
        }
        return null;
    }
 
    public void deleteBook(Long id) {
        BookRepository.deleteById(id);
    }
}
