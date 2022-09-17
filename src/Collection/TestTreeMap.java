package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {

                Map<String,Integer> map=new TreeMap<>();
                map.put("zywoo",1);
                map.put("simple",2);
                map.put("niko",3);
                //对key排序 然后遍历
        for (String key: map.keySet()) {
            System.out.println(key);
        }

        Map<Player,String> treemap =new TreeMap<>(); //泛型的使用
        treemap.put(new Player(1,"zywoo",5000),"法国cs");
        treemap.put(new Player(3,"simple",3500),"乌克兰cs");
        treemap.put(new Player(4,"niko",3000),"波黑cs");
        treemap.put(new Player(2,"dev1ce",3500),"丹麦cs");
          //按照key递增方式排序，重写了compareTo()方法
        for (Player key: treemap.keySet()) {
            System.out.println(key);
        }

    }
}


class Player  implements  Comparable<Player>{
    int id ;
    String name;
    int salary;
    public Player(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Player player) {
        if (this.salary>player.salary)
        {
            return 1;
        } else if (this.salary<player.salary) {
            return  -1;
        }else {
             if (this.id>player.id)
             {
                 return  1;
             } else if (this.id < player.id) {
                 return  -1;
             }else {
                 return  0;  //先比较薪水，薪水相同情况下比较id
             }
        }
    }

    @Override
    public String toString() {
        return "id:"+id+"salary:"+salary+"name:"+name;
    }

}
