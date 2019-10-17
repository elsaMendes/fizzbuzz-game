package com.exercice.alfresco;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FizzBuzzGame {

    private Map<String, Integer> mapReport;

    public FizzBuzzGame() {
        mapReport = new HashMap<>();
        resetMapReport();
    }


    public String execute(int from, int to) {
        String result = "";
        resetMapReport();
        for (int i = from; i <= to; i++) {
            String word = evaluateNumber(i);

            if (mapReport.containsKey(word)) {
                mapReport.put(word, mapReport.get(word) + 1);
            } else {
                mapReport.put("integer", mapReport.get("integer") + 1);
            }

            result += word + " ";
        }
        return result + "\n" + getReportFrequency(mapReport);
    }

    private void resetMapReport() {
        mapReport.put("alfresco", 0);
        mapReport.put("fizz", 0);
        mapReport.put("buzz", 0);
        mapReport.put("fizzbuzz", 0);
        mapReport.put("integer", 0);
    }

    private String getReportFrequency(Map<String, Integer> mapReport) {
        String report = "";
        for (String key : mapReport.keySet()) {
            report += key + ": " + mapReport.get(key) + " ";
        }

        return report;
    }

    public String evaluateNumber(int number) {
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
