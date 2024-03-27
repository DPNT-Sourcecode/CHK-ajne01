package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        if(skus == null || skus.isEmpty() || skus.isBlank()){
            return 0;
        }

        if(!skus.matches("[A-Z]+")){
            return -1;
        }

        Integer countA = skus.length() - skus.replace("A", "").length();
        Integer countB = skus.length() - skus.replace("B", "").length();
        Integer countC = skus.length() - skus.replace("C", "").length();
        Integer countD = skus.length() - skus.replace("D", "").length();
        Integer countE = skus.length() - skus.replace("E", "").length();
        Integer countF = skus.length() - skus.replace("F", "").length();


        Integer sum = 0;

        while(countE > 0){
            if(countE >= 2){
                Integer count = (int) Math.floor((double) countE / 2);
                sum += count*2*40;
                countB -= count;
                countE -= count*2;
            } else {
                sum += countE*40;
                countE=0;
            }
        }


        while (countA > 0) {
            if(countA >= 5){
                int quantPromo = (int) Math.floor((double) countA / 5);
                sum += quantPromo*200;
                countA -= quantPromo*5;
            } else if(countA >= 3){
                int quantPromo = (int) Math.floor((double) countA / 3);
                sum += quantPromo*130;
                countA -= quantPromo*3;
            } else {
                sum += 50 * countA;
                countA = 0;
            }
        }
        while(countB>0) {
            if (countB >= 2) {
                int quantPromo = (int) Math.floor((double) countB / 2);
                sum += quantPromo * 45;
                countB = countB - quantPromo * 2;
            } else {
                sum += 30 * countB;
                countB = 0;
            }
        }

        if(countC >0){
            sum += 20 * countC;
        }

        if(countD >0){
            sum += 15 * countD;
        }

        while(countF >= 3){
            while(countB>0) {
                if (countB >= 2) {
                    int quantPromo = (int) Math.floor((double) countB / 2);
                    sum += quantPromo * 45;
                    countB = countB - quantPromo * 2;
                } else {
                    sum += 30 * countB;
                    countB = 0;
                }
            }
        }

        return sum;

    }
}


