/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;

import java.util.Arrays;
import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author Melnikov
 */
public class JKTV21OOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Lev");
        author1.setLastname("Tolstoy");
        Book book = new Book();
        book.setTitle("Voina i mir");
        book.addAuthor(author1);
        System.out.println(book.toString());
        System.out.printf("Book{authors = %s, title = %s}"
                ,Arrays.toString(book.getAuthors()),book.getTitle()
        );
        System.out.println();
        Author author3 = new Author();
        author3.setFirstname("Ilja");
        author3.setLastname("Ilf");
        Author author4 = new Author();
        author4.setFirstname("Jevgeny");
        author4.setLastname("Petrov");
        
        Book book1 = new Book();
        book1.setTitle("13 stuljev");
        book1.addAuthor(author3);
        book1.addAuthor(author4);
        System.out.println(book1.toString());
        
        
        
        
    }
    
}
