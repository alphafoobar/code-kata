package kata04;

import java.util.Objects;

public class FootBallData {
    private String teamName;
    private int goalFor;
    private int goalsAgainst;

    public FootBallData(String teamName,int goalFor,int goalsAgainst){
        this.teamName = teamName;
        this.goalFor = goalFor;
        this.goalsAgainst = goalsAgainst;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGoalFor() {
        return goalFor;
    }

    public void setGoalFor(int goalFor) {
        this.goalFor = goalFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FootBallData that = (FootBallData) o;
        return teamName .equals(that.teamName )&&
            goalFor == that.goalFor &&
            goalsAgainst == that.goalsAgainst;
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName, goalFor, goalsAgainst);
    }

    @Override
    public String toString() {
        return "WeatherData{" +
            "teamName=" + teamName +
            ", goalFor=" + goalFor +
            ", goalsAgainst=" + goalsAgainst +
            '}';
    }
}
