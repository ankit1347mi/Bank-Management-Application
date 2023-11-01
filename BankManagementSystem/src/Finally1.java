 class Finally1 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("inner try");
            } finally {
                System.out.println(10 / 0);
            }
        } catch(ArithmeticException a) {
            System.out.println("outer catch");
        }
        finally{
            System.out.println("Outer finally");
        }
    }
}

class Finally2
{
    public static void main(String[] args) {

        try {
            try {
                System.out.println("inner try");
            }
            catch(NullPointerException n){
                System.out.println("npe");
            }
            finally {
                System.out.println("hii");
            }
        } catch(ArithmeticException a) {
            System.out.println("outer catch");
        }
        finally{
            System.out.println("Outer finally");
        }
    }
}


 class Finally3
 {
     public static void main(String[] args) {


             try {
                 m1();
             }
             catch(ArithmeticException a){
                 System.out.println("npe");
             }
             finally {
                 System.out.println("main() finally");
             }

     }

     public static void m1()
     {
         try{
             System.out.println("m1()try");
         }
         catch(ArithmeticException b){
             return;
            // System.out.println("catch m1()");
         }
         finally {
             System.out.println("m1 finally");
         }
     }
 }
 class Finally4 {
     public static void main(String[]args) {
         try {
             System.out.println("outer try");
             Thread.sleep(1000);
             System.out.println(10/0);
         } catch (InterruptedException b) {

              System.out.println("outer catch)");
         } finally {
             try{
                 System.out.println(10/0);
             }
             catch(ArithmeticException c){
                 System.out.println("inner finally catch");

             }
         }
     }
 }