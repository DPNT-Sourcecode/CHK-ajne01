package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        if(!skus.matches("[A-Z]+")){
            return -1;
        }

        String[] items = skus.split("");

        Map<String, Integer> itemsCount = new HashMap<>();

        for (String item : items) {
            if (itemsCount.containsKey(item)) {
                Integer value = itemsCount.get(item);
                itemsCount.replace(item, value + 1);
            } else {
                itemsCount.put(item, 1);
            }
        }

        Integer sum = 0;

        for(Map.Entry<String, Integer> entry : itemsCount.entrySet()){
            String key = entry.getKey();
            switch (key){
                case "A" -> {

                    int count = itemsCount.get(key);
                    if(count >= 3){
                        int quantPromo = (int) Math.floor((double) count / 3);
                        sum += quantPromo*130;
                        int rest = count - quantPromo*3;
                        sum += rest*50;
                    } else {
                        sum += 50*count;
                    }
                }
                case "B" -> {
                    int count = itemsCount.get(key);
                    if(count >= 2){
                        int quantPromo = (int) Math.floor((double) count / 2);
                        sum += quantPromo*45;
                        int rest = count - quantPromo*2;
                        sum += rest*30;
                    } else {
                        sum += 30*count;
                    }

                }
                case "C" -> sum += 20 * itemsCount.get(key);
                case "D" -> sum += 15 * itemsCount.get(key);

            }
        }



        return sum;

    }
}


