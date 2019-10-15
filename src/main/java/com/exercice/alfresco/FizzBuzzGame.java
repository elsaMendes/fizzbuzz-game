package com.exercice.alfresco;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzGame {

    private Map<String, Integer> mapReport;

    public FizzBuzzGame() {
        mapReport = new HashMap<>();
        mapReport.put("alfresco", 0);
        mapReport.put("fizz", 0);
        mapReport.put("buzz", 0);
        mapReport.put("fizzbuzz", 0);
        mapReport.put("integer", 0);
    }

    public void start(int from, int to) {
        for (int i = from; i <= to; i++) {
            String result = print(i);

            if (mapReport.containsKey(result)) {
                mapReport.put(result, mapReport.get(result) + 1);
            } else {
                mapReport.put("integer", mapReport.get("integer") + 1);
            }

            System.out.print(result + " ");
        }
        System.out.println();
        printReport(mapReport);

    }

    private void printReport(Map<String, Integer> mapReport) {
        for (String key : mapReport.keySet()) {
            System.out.print(key + ": " + mapReport.get(key) + " ");
        }
    }

    public String print(int number) {
        if (String.valueOf(number).indexOf("3") != -1) {
            return "alfresco";
        } else if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0)
            return "buzz";

        return number + "";
    }

    public Map<String, Integer> getMapReport() {
        return mapReport;
    }
}
//1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz
