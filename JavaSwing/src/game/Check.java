package game;

public class Check {

    private Bird bird = new Bird();

    public boolean lose() {
        if (bird.getY() + 40 >= 500) return true;
        return false;
    }
}
