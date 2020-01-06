import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        double d=Math.pow(10,2);
        System.out.println((int)d);
       map.put("chailu",15);
       map.put("alok",05);
        System.out.println(map.get("chailu"));
        System.out.println(map.get("alok"));
    }
}
