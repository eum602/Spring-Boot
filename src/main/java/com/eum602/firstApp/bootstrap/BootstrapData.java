package com.eum602.firstApp.bootstrap;

import com.eum602.firstApp.model.Author;
import com.eum602.firstApp.model.Book;
import com.eum602.firstApp.repositories.AuthorRepository;
import com.eum602.firstApp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //By using @Component we tell srping to use this class as a spring managed component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {//dependency injection
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author erick = new Author("Erick","Pacheco");
        Book blockchainBook = new Book("Blockchain behind the scenes","123456");
        erick.getBooks().add(blockchainBook);
        blockchainBook.getAuthors().add(erick);
        //saving repositories into the database
        authorRepository.save(erick);
        bookRepository.save(blockchainBook);

        Author arturo =  new Author("Arturo","Lord");
        Book industrialBook = new Book("Industrial Engineering","1234");
        arturo.getBooks().add(industrialBook);
        industrialBook.getAuthors().add(arturo);
        authorRepository.save(arturo);
        bookRepository.save(industrialBook);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
    }
}
