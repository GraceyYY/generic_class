import java.util.Map;

public class Test {
    public static void main(String[] args) {
        MyMap<User> users = new MyMap<>();
        users.save("1102", new User("1102", "Jane", 37));
        users.save("3029", new User("3029", "Clare", 28));
        users.save("2711", new User("2711", "Simon", 19));
        users.save("6230", new User("6230", "Lily", 40));
        users.save("5092", new User("5092", "Tom", 22));

        System.out.println(users);
        System.out.println(users.sort());

        users.delete("5092");
        users.edit("1102", new User("1102", "Jessie", 29));
        System.out.println(users);

        System.out.println("the user of id-6230 is: " + users.getValueOf("6230"));
        System.out.println("size: " + users.size());
        System.out.println("isEmpty: " + users.isEmpty());

        System.out.println("Ids are: ");
        for (String id : users.showIds()) {
            System.out.println(id);
        }

        System.out.println("Users are: ");
        for (User user : users.showValues()) {
            System.out.println(user);
        }

        System.out.println("Pairs are: ");
        for (Map.Entry pair : users.showPairs()) {
            System.out.println(pair);
        }

    }
}
