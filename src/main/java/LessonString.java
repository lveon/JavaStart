import javax.print.DocFlavor;

public class LessonString {
    public static void main(String[] args) {
        String example = "";
        String example1 = new String();

        String s1 = "Test ";
        String s2 = "1";
        String sum = s1 + s2;
        System.out.println(sum);

        int sInt = 12;
        String st = "My age is ";
        System.out.println(st + sInt);

        sum = st + sInt;
        System.out.println(sum);

        s1 = s1.concat(s2);
        System.out.println(s1);

        //example1 = null;
        System.out.println(s1 + example1);


      example1 = example1.concat(s1);

        String string1 = "Upitec";
        System.out.println(string1);

        int i = string1.length();
        System.out.println(i);

        System.out.println(string1.isEmpty());
        System.out.println(string1.toLowerCase());

        System.out.println(string1.toUpperCase());

        String s3= string1.replace("i","c");
        System.out.println(string1.replace("i", "c"));
        System.out.println(s2.charAt(4));


        System.out.println(s2.indexOf("c"));
        System.out.println(s2.lastIndexOf('c'));

        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2,4));


        string1 = "    " + string1;
        System.out.println(string1);
        System.out.println(string1.trim());

        System.out.println(string1.endsWith("tec"));
        String st0 =new String("Cat");
        String st2 = "Cat";
        String st1 = "cat";

        boolean bool = st0==st1;
        System.out.println(bool);
        System.out.println(st0.equals(st1));
        bool = st1 == st2;
        System.out.println(bool);
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st2));



        char [] string1Array = string1.toCharArray();
        System.out.println("Char array:" + string1Array);
        System.out.println("Char array:");
        for (int index = 0; index < string1Array.length; index++)
            System.out.println("Element [" + index + "]: " + string1Array[index]);














    }
}