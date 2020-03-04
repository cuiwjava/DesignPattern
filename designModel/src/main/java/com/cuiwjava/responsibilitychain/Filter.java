package com.cuiwjava.responsibilitychain;

interface Filter {
    boolean doFilter(Request req, Response res, FilterChain chain);
}