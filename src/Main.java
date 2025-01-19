import Collections.Test;
import generic.Customer;
import generic.Islem;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        /*  Islem<Integer> islem1= new Islem<>();
        islem1.toplama(8,4);

        Islem<Double> islem= new Islem<>();
        islem.toplama(3.4,22.6);

        Islem<Byte> b=new Islem<>();*/

//        Test test= new Test();
//
//        test.setler();
//
        int a=33;
        int b=0;
        Integer c= null;


        System.err.println("merhabalar java dersi ...");


        try {
            int d= s.nextInt();
            int sonuc = c/b;
            System.out.println(sonuc);
        }catch (NullPointerException xa){
            System.out.println("NULL POINTER HATASI");
        }catch (ArithmeticException e){
            System.out.println("Matematiksel bir hata");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("bilinmeyen hata");
        }






    }

}