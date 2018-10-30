package kata04;

import java.util.Objects;

public class WeatherData {
    private int day;
    private int minTemp;
    private int maxTemp;

    public WeatherData(int day,int minTemp,int maxTemp){
        this.day=day;
        this.minTemp=minTemp;
        this.maxTemp=maxTemp;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeatherData that = (WeatherData) o;
        return day == that.day &&
            minTemp == that.minTemp &&
            maxTemp == that.maxTemp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, minTemp, maxTemp);
    }

    @Override
    public String toString() {
        return "WeatherData{" +
            "day=" + day +
            ", minTemp=" + minTemp +
            ", maxTemp=" + maxTemp +
            '}';
    }
}
