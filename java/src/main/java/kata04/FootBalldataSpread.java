package kata04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FootBalldataSpread {

    public static List<FootBallData> readFile(String filepath) {
        int numlines = 0;
        List<FootBallData> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                numlines++;
                line = br.readLine();
                if(line.equals("") || line.contains("--")) {
                    System.out.println(line);
                   continue;
                }
                lines.add(parseString(line));
            }
        } catch (Exception e) {
        }
        return lines;
    }

    public static FootBallData parseString(String s) {
        String[] split = s.trim().split("\\s+");
        System.out.println(Arrays.toString(split));
        return new FootBallData(split[1], Integer.parseInt(split[6]), Integer.parseInt(split[8]));
    }

    public static String getMinSpread(String filepath) {
        List<FootBallData> footBallDataList = readFile(filepath);
        Integer minSpread=null;
        String team="";
        for (FootBallData footBallData:footBallDataList){
            int spread = Math.abs(footBallData.getGoalFor() - footBallData.getGoalsAgainst());

            if (minSpread == null || minSpread > spread){
                System.out.println("minSpread > "+spread+", day >> "+footBallData.getTeamName());
                minSpread= spread;
                team=footBallData.getTeamName();
            }
        }
        return team;
    }


}
