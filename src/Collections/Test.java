package Collections;

import javax.print.attribute.HashDocAttributeSet;
import java.util.*;

public class Test {

    public void list(){

        List<String> list= new LinkedList<String>();
        list.add("5");
        list.add("154");
        list.add("5");
        list.add("65");
        list.add("5");

        list.remove("5");
        list.remove(3);

        list.get(2);

        list.contains("65");

        list.size();

        list.clear();

        list.indexOf("65");

    }

    public void setler(){


        Set<String > set2= new TreeSet<>();

        Set<String> set3= new LinkedHashSet<>();

        Set<String> set= new HashSet<>();

        set.add("elma");
        set.add("çilek");
        set.add("armut");
        set.add("çilek");

        set.remove("armut");

        set.contains("elma");

        set.size();
        set.clear();

        System.out.println(set);

    }

    // Kuyruk (Queue) -> First in First out (FIFO)
    public void queue(){
        Queue<String> queue= new LinkedList<>();
        // eleman ekler
        queue.add("muz");
        queue.add("domates");
        queue.add("patates");
        // ilk elemanı siler
        queue.remove();
        //ilk elemani getirir
        queue.peek();
        queue.remove();
        // ilk elemanı getirip siler
        queue.poll();
        // eleman sayısı verir
        queue.size();
    }

    // Stack (yıgın) -> Last in First out (LIFO)
    public void stack(){

        Stack<String> stack = new Stack<String>();
        stack.push("marul");
        stack.push("portakal");
        stack.push("limon");
        // son elemanı getirir
        stack.peek();
        // son elemanı getirip siler
        stack.pop();


    }


    // Mapler anahtar -deger çifti tutar.
    // anatharlar benzersiz olmak zorunda
    public void map(){
        Map<Integer, String> map = new HashMap<>();
        // eleman ekler, ilk deger anahtar ikincisi value dur
        map.put(5,"muz");
        map.put(7,"çilek");
        map.put(6,"armut");
        // girilen key'in value sunu getirir
        map.get(7);

        // verilen key silinir
        map.remove(6);
        // girilen key var mı
        map.containsKey(5);
        // girilen value var mı
        map.containsValue("armut");

        // bütün keyleri getirir
        map.keySet();
        // bütün valueları getirir.
        map.values();

        // key ve value aynı anda getirilir.
        map.entrySet();

        map.size();
        map.clear();
    }







}
