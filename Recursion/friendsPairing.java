package Recursion;

public class friendsPairing {
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
    static int pairing(int friends){
        if (friends == 1 || friends == 2) {
            return friends;
        }
        return pairing(friends-1) + (friends-1)*pairing(friends-2);
    }
}
