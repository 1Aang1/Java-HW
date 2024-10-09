import java.util.Random;

public class InputDevice {
    public String getType() {
        return "random";
    }
    public Integer nextInt() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
