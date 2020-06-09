package test;

import homeWork.*;


public class Start {
    public static void main (String[] args){
    /*    int b = 5 + 6;
        int [] array = {1};*/


double itemPrice=  Utils.priceWithoutVat(500);
        System.out.println(itemPrice);



        System.out.println(Utils.priceWithoutVat(100));


/*Utils item;
        item = new Utils();
       item.priceWithoutVat(100);
        System.out.println(item);*/

      /*  int id = apple.getId();
        apple.setId(5);*/

     /*   System.out.println(test(b));
        System.out.println(b);
    test1(array);
        System.out.println(array[0]);
*/






      /*  String boots1Name = boots1.getMetricValue();
        int boots1Code = boots1.getMetricCode();
          boots1.setMetricCode(-5);
          boots1.setMetricValue("dfgdfgdfgsdf");
        boolean boots1Fashion = boots1.isFashion();
*/
/*
        System.out.println(boots1Fashion);
        System.out.println(boots1Name);
        System.out.println(boots1.getMetricCode());*/



    }

    public  static  int  test(int x){
       x= x+2;
        return x;

    }

    public static void test1 (int[]array){
        array[0] =5;
    }
}