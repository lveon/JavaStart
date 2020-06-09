public class RegEx {
    public static void main(String[] args) {
//String enterValue = "U";
        returnBoolean("+380934418097");

  /*  String str1 = "Cat";
    String str2 = new String ("Cat");
    boolean compare = str1.equals(str2);
        System.out.println(compare);
        boolean compare1 = str1.equals("[a-zA-Z]{3}");
        System.out.println(compare1);
        boolean compare2 =  str1.matches("[a-zA-Z]{3}");
        System.out.println(compare2);*/

       /* String str3 = "SS";
        boolean compare = str3.matches("S?"); // *** (x == "S" | x== "A" |  == "Q" | == "W" |== "E" |)
        System.out.println(compare);*/


// "(\\+?)(\\d{2})?([0])(\\d{9})");
//"\\+?(\\d{2})?[0]\\d{9}");
//   "\\+?[3]?[8]?[0]\\d{9}");
    }



    public static void returnBoolean(String enterPhoneNumber){

        boolean compare = enterPhoneNumber.matches("\\+?(38)?[0]\\d{9}");
        System.out.println(compare);


    }
}