package com.cuiwjava.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        if (index == filters.size()) {
            return false;
        }
        Filter f = filters.get(index);
        index++;
        return f.doFilter(req, res, chain);
    }
}