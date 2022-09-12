package Collection;

import Thread.MethodTest.Interrupt;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zywoo");
        map.put(2,"simple");
        //map中键不能重复
        System.out.println(map.get(2));
    }
}
