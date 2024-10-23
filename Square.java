public class Square {
    static void row(int n){
        if(n<=0){
            return;
        }
        System.out.print("* ");
        row(n-1);
       }
    static void print(int n,int m){
        if(m<=0){
            return;
        }
        row(n);
       System.out.println();
       print(n, m-1);
    }
}
