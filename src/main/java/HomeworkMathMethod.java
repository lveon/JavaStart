
public class HomeworkMathMethod {
    public static void main(String[] args) {



        System.out.println(randomRangeNumber(-10,-5));
        System.out.println(randomRangeNumber(-10.00,-5.00));


    }
    public static double randomRangeNumber(double enterFrom, double enterTo) {
        enterTo=enterTo+1;
        return (Math.random() * (enterTo - enterFrom)) + enterFrom;
    }

    public static int randomRangeNumber(int enterFrom, int enterTo) {
        enterTo = enterTo +1 ;
        return  (int) (Math.random() * (enterTo - enterFrom )) + enterFrom;
    }
}

