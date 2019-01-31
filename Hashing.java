public class Hashing {

    public Hashing() {

    }

    // There is a problem, Lee Chin Tan, Chen Le Tian, Chan Tin Lee all have the
    // same hash.
    // TODO: it is a good practice to move the sum for every char or use powers.
    // NOTE: mid‐square method / digit extraxtion
    int simpleCharHashing(String s) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            char c = s.charAt(i);
            sum += c;
        }
        return sum % 256;
    }

}