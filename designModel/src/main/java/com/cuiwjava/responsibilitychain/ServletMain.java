package com.cuiwjava.responsibilitychain;

/**
 * servlet中的request response过责任链
 * request过1 2 response过2 1 使用同一个责任链
 */
public class ServletMain {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        request.str = "request";
        response.str = "response";

        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new SensitiveFilter());
        chain.doFilter(request, response, chain);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}