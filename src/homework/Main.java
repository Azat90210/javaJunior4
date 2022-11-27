package homework;

public class Main {
    public static void main(String[] args) {

        Page user1 = new Page("Иван", "Иванов", 18, "Москва");
        Page user2 = new Page("Мария", "Петрова", 21, "Саратов");
        Page user3 = new Page("Сергей", "Сидоров", 45, "Чебоксары");


        WallEntry wallEntry1 = new WallEntry("С днем рождения");
        WallEntry wallEntry2 = new WallEntry("C 8 марта");

        Comments comments0 = new Comments("Первый комментарий", 1);
        Comments comments1 = new Comments("Отличное фото", 5);
        Comments comments2 = new Comments(":-(", 2);
        Comments comments3 = new Comments("Not bad", 4);
        Comments comments4 = new Comments("Приезжайте еще в гости", 4);

        user1.setWallEnties(wallEntry1);
        user2.setWallEnties(wallEntry2);

        user2.setComments(comments0);
        user2.setComments(comments1);
        user2.setComments(comments2);
        user3.setComments(comments3);
        user1.setComments(comments4);
        user1.setComments(comments1);



        System.out.println(user1);
        System.out.println("_________________");
        System.out.println("Самый высокий лайк у " + user1 + " это " + user1.maxLike());
        System.out.println("_________________");

        if(user1.sumLike()> user2.sumLike() && user1.sumLike() > user3.sumLike()){
            System.out.println("Самое большое количество лайков у " + user1 + " в количестве " + user1.sumLike());
        } else if (user2.sumLike()> user1.sumLike() && user2.sumLike() > user3.sumLike()) {
            System.out.println("Самое большое количество лайков у " + user2 + " в количестве " + user2.sumLike());
        } else if (user3.sumLike()> user1.sumLike() && user3.sumLike() > user1.sumLike()) {
            System.out.println("Самое большое количество лайков у " + user3 + " в количестве " + user3.sumLike());
        }
    }
}
