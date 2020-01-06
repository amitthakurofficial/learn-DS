public class array_check {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int a=0;
        int b=8;
        if(arr.length%2==0)
        {
            for (int i=0; i<arr.length/2; i++)
            {
                System.out.print(" "+arr[a]+" "+arr[b]);
                a++;
                b--;
            }
        }
        else
        {
            for (int i=0; i<arr.length/2; i++)
            {
                System.out.print(" "+arr[a]+" "+arr[b]);
                a++;
                b--;
            }
            System.out.println(" "+arr[arr.length/2]);
        }
        String str="abbbcccbcbbbaab";
        int count=0;
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            {

            }
            else {
                count++;
            }
            System.out.println(str.charAt(i));
        }

    }
}
