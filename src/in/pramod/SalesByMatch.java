package in.pramod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Result {
	
    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
//    	for(Integer i:ar) {
//    		if(i==i+1) {
//    			
//    			
//    		}
//    	}
//    	return 0;
        Map<Integer, Integer> colorCount = new HashMap<>();

        for (int i : ar) {
            colorCount.put(i, colorCount.getOrDefault(i, 0) + 1);
        }

        int pairCount = 0;
        for (int count : colorCount.values()) {
            pairCount += count / 2;
        }

        return pairCount;
    }


    }



public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


