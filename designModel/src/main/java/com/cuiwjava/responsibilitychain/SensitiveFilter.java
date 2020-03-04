package com.cuiwjava.responsibilitychain;

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        req.str = req.str.replaceAll("996", "955") + "--SensitiveFilter()";
        chain.doFilter(req, res, chain);
        res.str += "--SensitiveFilter()";
        return true;
    }
}