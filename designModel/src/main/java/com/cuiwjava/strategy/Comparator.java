package com.cuiwjava.strategy;

/*在API文档中 Comparator接口中有一个方法*/
public interface Comparator<T> { 
    int compare(T o1,T o2); //定义泛型T
}