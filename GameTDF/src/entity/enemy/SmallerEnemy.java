package entity.enemy;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SmallerEnemy extends AbstractEnemy{
    public SmallerEnemy(int health, int speed, int armor, int reward, int x, int y) {
        super(health, speed, armor, reward, x, y);
    }

    @Override
    public BufferedImage getTexture() {
        return null;
    }
}
