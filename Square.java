public interface Square{

   public static boolean isPerfect(int x) {
       return Math.sqrt(x)-Math.floor(Math.sqrt(x))==0;
   }

}

