package com.teachmeskills.lesson25.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

@WebServlet("/load-book")
@MultipartConfig(maxFileSize = 15 * 1024 * 1024, fileSizeThreshold = 15 * 1024 * 1024)
public class LoadBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part partFile = req.getPart("file");
        partFile.write("C:\\bookstore\\" + partFile.getSubmittedFileName());
    }
}
