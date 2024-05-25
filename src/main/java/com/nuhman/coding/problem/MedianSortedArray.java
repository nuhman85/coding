package com.nuhman.coding.problem;

//completed youtube video
public class MedianSortedArray {

    public static double findMedianOfTwoArrays(int[] a, int[] b){

        int n1 = a.length, n2=b.length;

        if (n1>n2) return findMedianOfTwoArrays(b, a);


        int n = n1 + n2;
        int left = (n1 +n2 +1)/2; // 4, 5 = 5 ;

        int low = 0, high = n1; //4

        while(low<=high){
            int mid1 = (low + high)/2; //2 //3
            int mid2 = left- mid1; //3 //0

            //a1, a2,      ||  a3, a4    //mid1 = 2
            //b1, b2,   ||  b3,b4, b5   //mid2 =3
            //l1  a2   //r1 a3
            //l2  b3   //r2  b4

            int l1 = (mid1>0) ? a[mid1-1] : Integer.MIN_VALUE;
            int l2 = (mid2>0) ? b[mid2-1] : Integer.MIN_VALUE;
            int r1 = (mid1<n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2<n2) ? b[mid2] : Integer.MAX_VALUE;

            System.out.println("l1: "+l1 + "l2: "+l2+"r1: "+r1+"r2: "+r2);

            if(l1<=r2 && l2<=r1){
                if(n%2 == 1) return Math.max(l1, l2);
                else return (Math.max(l1, l2) +Math.min(r1, r2))/2;
            } else if (l1>r2) high  = mid1-1;
            else low = mid1 +1;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] a = {1,4,7,    10,12}; //l2
        int[] b = {2,3,   6,15}; //l1
        System.out.println(findMedianOfTwoArrays(a, b));

        a = new int[]{1,3};
         b = new int[]{2};
        System.out.println(findMedianOfTwoArrays(a, b));
    }


}
