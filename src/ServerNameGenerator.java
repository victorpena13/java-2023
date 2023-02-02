
public class ServerNameGenerator {
    public static void serverName(String adjective, String noun) {
        System.out.println(adjective + " " + noun);
    }

    public static void main(String[] args) {
        String[] adjectives = {"Ashamed", "Adorable", "Attractive", "Beautiful", "Awful", "Aggressive", "Cruel", "Clever", "Tasty", "Jealous"};
        String[] nouns = {"teachenr", "john", "mary", "countryside", "america", "car", "banana", "money", "music", "love"};

        int min = 1;
        int max = 10;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        String adjective = adjectives[random_int];
        String noun = nouns[random_int];
        serverName(adjective, noun);
    }
}
