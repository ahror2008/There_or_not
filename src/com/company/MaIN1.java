package com.company;

public class MaIN1 {
    public static void main(String[] args) {
        int[] num = {-1, 2, 3, 4, 5};
        boolean found=false;
        int count=0;
        for (int i1 = 0; i1 < num.length; i1++) {
            if (num[i1] < 0) {
                count++;
            }
        }
        for (int n:num) {
            if (n<0){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("Manfiy  son bor : "+count+" ta");

        }else {
            System.out.println("Manfiy son yo'q ");
        }

    
}
}
