package com.teachmeskills.lesson25.model;

import javax.naming.Name;
import java.io.File;

public class BookModel {
    private String nameAuthor;
    private String nameBook;
    private File file;

    public BookModel(String nameAuthor, String nameBook, File file) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.file = file;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
