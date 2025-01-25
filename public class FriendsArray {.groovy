public class FriendsArray {
    public static void main(String[] args) {
        // Create an array with 10 friends' names
        String[] friends = {
            "Alice", "Bob", "Charlie", "Diana", "Eve", 
            "Frank", "Grace", "Hank", "Ivy", "Jack"
        };

        // Print all names using a loop
        System.out.println("List of friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }

        // Access a specific name
        System.out.println("\nFriend at index 3: " + friends[3]); // Diana

        // Get the total number of friends
        System.out.println("\nTotal friends: " + friends.length);
    }
}