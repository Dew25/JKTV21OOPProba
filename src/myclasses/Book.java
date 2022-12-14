/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author Melnikov
 */
public class Book {
    private Author[] authors;
    private String title;

    public Book() {
        authors = new Author[0];
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public void addAuthor(Author author){
        //создаем копию authors с дополнительной ячейкой
        //В доп ячейку помещаем author
        //В authors кладем ссылку на новый массив.
        Author[] newAuthors = Arrays.copyOf(authors, authors.length + 1);
        newAuthors[newAuthors.length-1] = author;
        this.authors = newAuthors;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" 
                + "authors=" + Arrays.toString(getAuthors()) 
                + ", title=" + title 
                + '}';
    }
    
}
