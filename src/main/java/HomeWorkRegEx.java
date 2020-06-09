public class HomeWorkRegEx {
    public static void main(String[] args) {

        char char1 = 'a';
        char char2 = 'b';
        char char3 = 'C';
        char char4 = 'U';
        char char5 = 'O';

        System.out.println(findU(char1, char2,char3, char4, char5));
    }


    public static boolean findU(char... findChar) {
        boolean findWord = false;

        for (int i = 0; i < findChar.length; i++) {
            if (findChar[i] == 'U') {
                findWord = true;
                break;
            } else {
                findWord = false;
            }
        }
        return findWord;
    }

}
