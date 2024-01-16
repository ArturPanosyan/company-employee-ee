package com.example.companyemployeeee.servlet;

import com.example.companyemployeeee.manager.CompanyManager;
import com.example.companyemployeeee.model.Company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/companies")
public class CompaniesServlet extends HttpServlet {

    private CompanyManager companyManager = new CompanyManager();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Company> companies = companyManager.getCompanies();
        req.setAttribute("companies", companies);

        req.getRequestDispatcher("/WEB-INF/companies.jsp").forward(req, resp);
    }
}
