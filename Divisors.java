public class Divisors {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        
        for (int i = 1; i <a ; i++) {
           if( a%i==0){
               System.out.println(i);
           }
        }
       if (a!=0&&a!=1){ 
       	System.out.println(a);
       }


    }}