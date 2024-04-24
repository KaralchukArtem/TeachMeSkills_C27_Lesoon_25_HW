package com.teachmeskills.lesson25.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        System.out.println("BookServlet");
        ArrayList<String> book = searchBook(new File("C:\\bookstore"));
        printWriter.write("<h1><p>Your library of books</p></h1>");
        for (String item : book) {
            printWriter.write(item+"<br>");
        }
        getServletContext().getRequestDispatcher("searchBook.jsp").forward(req, resp);
        printWriter.close();
        resp.setContentType("text/html");
    }

    private static ArrayList<String> searchBook(File rootFile) {
        ArrayList<String> book = new ArrayList<>();
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    book.add(file.getName());
                    System.out.println(file.getName());
                }
            }
        }
        return book;
    }
}
