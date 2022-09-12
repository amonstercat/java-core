package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("zywoo");
        list1.add("simple");
        List<String> list2=new ArrayList<>();
        list2.add("device");
        list2.add("ropz");
        System.out.println(list1);
        System.out.println(list1.addAll(list2));
        System.out.println(list1);
        list1.add("niko");
        String str="niko";
        list1.add(str);
        System.out.println(str.equals("niko"));
        System.out.println(list1);
        //Test  add() & set()
        list2.add(0,"rain");  //若不指定index直接加则是在数组末尾加
        list2.add(str);
        System.out.println(list2);
        list2.set(2,"elige");//直接替代特定索引位置的元素，不能越界
        System.out.println(list2);
        System.out.println(list2.get(2));//返回指定索引位置的元素
        System.out.println(list1.indexOf("niko")); //返回特定元素第一次出现的位置

    }
}
