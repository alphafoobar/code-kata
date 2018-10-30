package kata04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherdataSpread {

    public static List<WeatherData> readFile(String filepath) {
        int numlines = 0;
        List<WeatherData> lines = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                numlines++;
                line = br.readLine();
                if(line.equals("") || line.contains("mo")) {
                    System.out.println(line);
                   continue;
                }
                lines.add(parseString(line));
            }
        } catch (Exception e) {
        }
        return lines;
    }

    public static WeatherData parseString(String s) {

        Pattern p = Pattern.compile("\\A +(\\d+) +(\\d+)\\*? +(\\d+)");
        Matcher m = p.matcher(s);
        if (m.find()) {
            return new WeatherData(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(3)), Integer.parseInt(m.group(2)));
        }

        return null;
    }

    public static int getMinSpreadDay(String filepath) {
        List<WeatherData> weatherDataList = readFile(filepath);
        Integer minSpread=null;
        int day=0;
        for (WeatherData weatherData:weatherDataList){
            int spread1 = weatherData.getMaxTemp() - weatherData.getMinTemp();

            if (minSpread == null || minSpread > spread1){
                System.out.println("minSpread > "+spread1+", day >> "+weatherData.getDay());
                minSpread= spread1;
                day=weatherData.getDay();
            }
        }
        return day;
    }


}
