public class ReverseString {
    public static void main(String[] args) {
        String str= "Lorem at the output should be me";

        StringBuffer sbr= new StringBuffer(str);
        sbr.reverse();

        System.out.println(sbr);
    }
}
class Main {
    static int getMissingNo(int a[],int n)
    {
        int i,total;
        total = (n+1)*(n+2)/2;
        for ( i = 0; i < n; i++)
            total -=a[i];
        return total;
    }

    public class ArrayInteger {
        public void main(String[] args) {
            int a[]  = {1, 2, 3, 5,6};
            int miss = getMissingNo(a,5);
            System.out.println(miss);
        }
    }
}