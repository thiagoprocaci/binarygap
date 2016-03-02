package com.tbp;


public class Solution {

    public int solution(int N) {
        String s = Integer.toBinaryString(N);
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == '1') {
                if(count != 0) {
                    if(count > maxCount) {
                        maxCount = count;
                    }
                    count = 0;
                }
                continue;
            }
            count++;
        }
        return maxCount;
    }

    public int solution2(int N) {
            boolean startCount = false;
            int remainder = -1;
            int quotient = -1;
            int count = 0;
            int maxCount = 0;
            int aux = N;
            while(quotient != 0) {
                remainder = aux % 2;
                quotient = aux/2;
                aux = quotient;
                if(remainder == 1) {
                    startCount = true;
                    if(count != 0) {
                        if (count > maxCount) {
                            maxCount = count;
                        }
                        count = 0;
                    }
                    continue;
                }
                if(startCount) {
                    count++;
                }
            }
            return maxCount;

    }

}
