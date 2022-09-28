package homework;

import java.util.Arrays;

public class Page {
    private String name;
    private String surname;
    private int age;
    private String city;
    private WallEntry[] wallEnties = new WallEntry[100];
    private Comments[] comments = new Comments[100];


    public Page() {
    }

    public Page(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public WallEntry[] getWallEnties() {
        return wallEnties;
    }


    public void setWallEnties(WallEntry wallEnties) {
        int count = 0;
        for (int i = 0; i < this.wallEnties.length; i++) {
            if (this.wallEnties[i] == null) {
                this.wallEnties[i] = wallEnties;
                count = i;
                break;
            }
            if (count == this.wallEnties.length - 1) {
                System.out.println("Места для записи на стене нет");
            }
        }
    }

    public Comments[] getComments() {
        return comments;
    }

    public void setComments(Comments comments) {

        for (int i = 0; i < this.comments.length; i++) {
            int count = 0;
            if (this.comments[i] == null) {
                this.comments[i] = comments;
                count = i;
                break;
            }
            if (count == this.comments.length - 1) {
                System.out.println("Места для комментариев нет");
            }
        }
    }

    public int maxLike() {
        int max = 0;

        for (int i = 0; i <= this.comments.length - 1; i++) {
            if (this.comments[i] != null) {
                if (max < this.comments[i].getLike()) {
                    max = this.comments[i].getLike();
                }
            }
        }
        if (max == 0) {
            return 0;
        } else return max;
    }



    public int sumLike() {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < this.comments.length; i++) {
            if (this.comments[i] != null) {
                count++;
                sum = count;
            }
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Page{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", wallEnties=" + Arrays.toString(wallEnties) +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }
}
