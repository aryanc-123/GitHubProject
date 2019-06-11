public class SquareRunner {

    public static void main(String[]args) {
        Square s=(int x)->Math.sqrt(x)-Math.floor(Math.sqrt(x))==0;

        System.out.println(s.isPerfect(6));
        System.out.println(s.isPerfect(4));

    }

}