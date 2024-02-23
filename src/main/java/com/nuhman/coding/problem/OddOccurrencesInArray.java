package com.nuhman.coding.problem;

public class OddOccurrencesInArray {

    public static int findUnpairedOccurrence(int[] value){
        if(value.length==0){
            return 0;
        }

        int unpaired;
        unpaired = value[0];
        for(int i=1;i< value.length;i++){
            System.out.println("Value: "+unpaired+" ^ "+value[i]+" == ");
            unpaired = unpaired ^ value[i];
            System.out.println((unpaired));


/*            System.out.println(Integer.toBinaryString(unpaired));
            System.out.println(Integer.toBinaryString(value[i]));
            System.out.println("-------------");
            System.out.println(Integer.toBinaryString((unpaired ^ value[i])));*/


/*            System.out.println("V: "+Integer.toBinaryString(unpaired)+
                    " ^ "+Integer.toBinaryString(value[i])+" == "
                    +Integer.toBinaryString((unpaired ^ value[i])));*/
        }

        return unpaired;
    }

    public static void main(String[] args){
        System.out.println(findUnpairedOccurrence(new int[]{2,3,4,6,2,3,4}));
    }

}
