package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("zywoo");
        list1.add("dev1ce");
        list1.add("simple");
        list1.add("twistzz");
        for(Iterator iterator=list1.iterator();iterator.hasNext();)
        {
            String temp=(String) iterator.next();
            System.out.println(temp);
        }
    }
}
