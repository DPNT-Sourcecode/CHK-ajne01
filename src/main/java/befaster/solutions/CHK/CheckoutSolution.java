package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CheckoutSolution {

    Map<String, String> itemsPriceAndDiscounts = new HashMap<>(){{
        put("A", "50#3:130;5:200");
        put("B", "30#2:45");
        put("C", "20");
        put("D", "15");
        put("E", "40#2:1B");
        put("F", "10#2:1F");
        put("G", "20");
        put("H", "10#5:45;10:80");
        put("I", "35");
        put("J", "60");
        put("K", "80#2:150");
        put("L", "90");
        put("M", "15");
        put("N", "40#3:1M");
        put("O", "10");
        put("P", "50#5:200");
        put("Q", "30#3:80");
        put("R", "50#3:1Q");
        put("S", "30");
        put("T", "20");
        put("U", "40#3:1U");
        put("V", "50#2:90;3:130");
        put("W", "20");
        put("X", "90");
        put("Y", "10");
        put("Z", "50");
    }};

    public Integer sum = 0;

    public ConcurrentHashMap<String, Integer> countItem = new ConcurrentHashMap<>();
    public Integer checkout(String skus) {

        if(skus == null || skus.isEmpty() || skus.isBlank()){
            return 0;
        }

        if(!skus.matches("[A-Z]+")){
            return -1;
        }

        countItem.put("A", skus.length() - skus.replace("A", "").length());
        countItem.put("B", skus.length() - skus.replace("B", "").length());
        countItem.put("C", skus.length() - skus.replace("C", "").length());
        countItem.put("D", skus.length() - skus.replace("D", "").length());
        countItem.put("E", skus.length() - skus.replace("E", "").length());
        countItem.put("F", skus.length() - skus.replace("F", "").length());
        countItem.put("G", skus.length() - skus.replace("G", "").length());
        countItem.put("H", skus.length() - skus.replace("H", "").length());
        countItem.put("I", skus.length() - skus.replace("I", "").length());
        countItem.put("J", skus.length() - skus.replace("J", "").length());
        countItem.put("K", skus.length() - skus.replace("K", "").length());
        countItem.put("L", skus.length() - skus.replace("L", "").length());
        countItem.put("M", skus.length() - skus.replace("M", "").length());
        countItem.put("N", skus.length() - skus.replace("N", "").length());
        countItem.put("O", skus.length() - skus.replace("O", "").length());
        countItem.put("P", skus.length() - skus.replace("P", "").length());
        countItem.put("Q", skus.length() - skus.replace("Q", "").length());
        countItem.put("R", skus.length() - skus.replace("R", "").length());
        countItem.put("S", skus.length() - skus.replace("S", "").length());
        countItem.put("T", skus.length() - skus.replace("T", "").length());
        countItem.put("U", skus.length() - skus.replace("U", "").length());
        countItem.put("V", skus.length() - skus.replace("V", "").length());
        countItem.put("X", skus.length() - skus.replace("X", "").length());
        countItem.put("W", skus.length() - skus.replace("W", "").length());
        countItem.put("Y", skus.length() - skus.replace("Y", "").length());
        countItem.put("Z", skus.length() - skus.replace("Z", "").length());

        while(countItem.get("E") > 0){
            if(countItem.get("E") >= 2){
                Integer count = (int) Math.floor((double) countItem.get("E") / 2);
                sum += count*2*40;
                countItem.replace("B", countItem.get("B"), countItem.get("B") - count);
                countItem.replace("E", countItem.get("E"), countItem.get("E") - count*2);
            } else {
                sum += countItem.get("E")*40;
                countItem.replace("E", countItem.get("E"), 0);
            }
        }


        while (countItem.get("A") > 0) {
            if(countItem.get("A") >= 5){
                int quantPromo = (int) Math.floor((double) countItem.get("A") / 5);
                sum += quantPromo*200;
                countItem.replace("A", countItem.get("A"), countItem.get("A") - quantPromo*5);
            } else if(countItem.get("A") >= 3){
                int quantPromo = (int) Math.floor((double) countItem.get("A") / 3);
                sum += quantPromo*130;
                countItem.replace("A", countItem.get("A"), countItem.get("A") - quantPromo*3);
            } else {
                sum += 50 * countItem.get("A");
                countItem.replace("A", countItem.get("A"), 0);
            }
        }
        while(countItem.get("B")>0) {
            if (countItem.get("B") >= 2) {
                int quantPromo = (int) Math.floor((double) countItem.get("B") / 2);
                sum += quantPromo * 45;
                countItem.replace("B", countItem.get("B"), countItem.get("B") - countItem.get("B") - quantPromo * 2);
            } else {
                sum += 30 * countItem.get("B");
                countItem.replace("B", countItem.get("B"), 0);
            }
        }

        if(countItem.get("C") >0){
            sum += 20 * countItem.get("C");
        }

        if(countItem.get("D") > 0){
            sum += 15 * countItem.get("D");
        }

        while(countItem.get("F") >= 3){
            sum += 20;
            countItem.replace("F", countItem.get("F"), countItem.get("F") - 3);
        }

        if(countItem.get("F") > 0){
            sum += 10 * countItem.get("F");
            countItem.replace("F", countItem.get("F"), 0);
        }

        return sum;

    }
}




