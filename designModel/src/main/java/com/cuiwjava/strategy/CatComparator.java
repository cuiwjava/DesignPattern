package com.cuiwjava.strategy;

/*根据猫的身高来比较*/
public class CatComparator implements Comparator<Cat>{//实现Comparator接口
	/*这里和Cat类中方法相同*/
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height) return -1;
        else if (o1.height < o2.height) return 0;
        else return 0;
    }
}