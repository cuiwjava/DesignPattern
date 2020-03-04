package com.cuiwjava.responsibilitychain;

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        req.str = req.str.replaceAll("<", "[").replaceAll(">", "]") + "--HTMLFilter()";
        chain.doFilter(req, res, chain);
        res.str += "--HTMLFilter()";
        return true;
    }
}