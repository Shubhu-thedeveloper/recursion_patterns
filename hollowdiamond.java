public class hollowdiamond {


    static void print(int m,int n,int i){
        if(m<0){
            return;
        }
        r_print(n);
        space(i);
        l_print(n);
        System.out.println();
        print(m-1, n-1,i+2);
    }
}
