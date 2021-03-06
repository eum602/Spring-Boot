package com.eum602.firstApp.bootstrap;

import com.eum602.firstApp.model.Author;
import com.eum602.firstApp.model.Book;
import com.eum602.firstApp.model.Publisher;
import com.eum602.firstApp.repositories.AuthorRepository;
import com.eum602.firstApp.repositories.BookRepository;
import com.eum602.firstApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //By using @Component we tell srping to use this class as a spring managed component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private  final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {//dependency injection
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setAddressLine1("NN");
        publisher.setName("Editorial - NN");
        publisherRepository.save(publisher);

        Author erick = new Author("Erick","Pacheco");
        Book blockchainBook = new Book("Blockchain behind the scenes","123456");
        erick.getBooks().add(blockchainBook);
        blockchainBook.getAuthors().add(erick);
        blockchainBook.setPublisher(publisher);
        publisher.getBooks().add(blockchainBook);
        //saving repositories into the database
        authorRepository.save(erick);
        bookRepository.save(blockchainBook);
        publisherRepository.save(publisher);

        Author arturo =  new Author("Arturo","Lord");
        Book industrialBook = new Book("Industrial Engineering","1234");
        arturo.getBooks().add(industrialBook);
        industrialBook.getAuthors().add(arturo);
        industrialBook.setPublisher(publisher);
        publisher.getBooks().add(industrialBook);
        authorRepository.save(arturo);
        bookRepository.save(industrialBook);
        publisherRepository.save(publisher);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of publisher books: " + publisher.getBooks().size());
    }
}
