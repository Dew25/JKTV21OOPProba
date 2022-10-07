/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;


import myclasses.Book;
import tools.Tools;

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        Tools tools = new Tools();
        Book book = tools.createBook("Book Ivana");
        book.addAuthor(tools.createAuthor("Ivan","Ivanov"));
        System.out.println(book.toString());
    }
   
}
