package com.assignment.demo.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogRecord;
import java.util.stream.Collectors;

@Component
@Order(1)
public class TransactionFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        if ("POST".equalsIgnoreCase(req.getMethod()))
        {
            var body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            body.replace(";", "");
        }
        chain.doFilter(request, response);
    }
}

