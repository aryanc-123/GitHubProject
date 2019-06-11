public class Runner{

    public static void main(String[]args) {

        Quotient q=(float a,float b)->System.out.printf("%.3f",(a/b));

        q.quotient(2f, 3f);

        Square s=(int x)->Math.sqrt(x)-Math.floor(Math.sqrt(x))==0;

        System.out.println(s.isPerfect(6));
        System.out.println(s.isPerfect(4));


    }

}