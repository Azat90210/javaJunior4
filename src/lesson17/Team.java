package lesson17;

import lesson15.Otziv;

import java.util.ArrayList;

public abstract class Team {
    ArrayList<People> people = new ArrayList<>();
    String name;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<People> people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPeople(People p) {
        this.people.add(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (people != null ? !people.equals(team.people) : team.people != null) return false;
        return name != null ? name.equals(team.name) : team.name == null;
    }

    @Override
    public int hashCode() {
        int result = people != null ? people.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Команда {" +
                "название = " + name +
                ", состав = '" + people + '\'' +
                '}';
    }
}
