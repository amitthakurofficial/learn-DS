import java.util.*;
public class test1 {
    void test1()
    {
        LinkedList<Object> l = new LinkedList<>();
        l.add(2);
        l.add('a');
        l.add(3.4);
        System.out.println(l.getFirst());
    }
    test1 a=null;
    public LinkedList meth() {
        LinkedList<Object> l = new LinkedList<>();
        l.add(2);
        l.add('a');
        l.add(3.4);
        l.add(1,34);
        System.out.println(l.getFirst());
        System.out.println(l.get(1));

        return l;
    }
    public static void main(String[] args) {
      test1 t=new test1();
      System.out.println(t.meth());
    }
}
