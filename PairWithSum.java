public class PairWithSum {
    public void PairWithSum()
    {
        int sum=0;
        int []arr = new int[10];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 10 Array elements:");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array elements are =[");
        for(int i:arr)
            System.out.print(i+" ");
            System.out.println("]");
        System.out.println("Enter the sum value:");
        sum=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("Pair with given sum "+sum+" is: ("+arr[i]+","+arr[j]+")");
                }

           
            }







            
        }
        sc.close();
    }



    public static void main(String[] args) {
        PairWithSum pws = new PairWithSum();
        pws.PairWithSum();
    }
}
