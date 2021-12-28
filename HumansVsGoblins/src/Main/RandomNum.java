
public class RandomNum {
    public static int generator(int min, int max) {
        try {
            int range = max - min + 1;
            return (int) (Math.random() * range) + min;
        } catch (Exception e) {
            System.out.println("Failed to generate random number.");
        }
        return -1;
    }
}