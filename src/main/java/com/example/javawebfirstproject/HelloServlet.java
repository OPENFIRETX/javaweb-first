package com.example.javawebfirstproject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;


public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws jakarta.servlet.ServletException, IOException {
        String name = req.getParameter("name");
        String priceStr = req.getParameter("price");
        Integer price = Integer.parseInt(priceStr);

        System.out.println(name);
        System.out.println(price);
    }

}