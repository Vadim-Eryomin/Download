package Game;

import Engine.Animation;
import Engine.GameObject;
import Engine.ImageXY;
import Engine.Renderer;

import java.awt.event.KeyEvent;

public class Hero extends GameObject {
    Animation animation = new Animation();

    public void create() {
        image = new ImageXY[1][2];
        image[0][0] = new ImageXY("heroR1.png", 300, 5);
        image[0][1] = new ImageXY("heroR1.png", 5, 5);
    }

    public void update(GameManager g) {
        if (g.gc.input.isKey(KeyEvent.VK_W))
            for (ImageXY[] i : image)
                for (ImageXY im: i)
                    im.y--;
        if (g.gc.input.isKey(KeyEvent.VK_S))
            for (ImageXY[] i : image)
                for (ImageXY im: i)
                    im.y++;
        if (g.gc.input.isKey(KeyEvent.VK_A))
            for (ImageXY[] i : image)
                for (ImageXY im: i)
                    im.x--;
        if (g.gc.input.isKey(KeyEvent.VK_D))
            for (ImageXY[] i : image)
                for (ImageXY im: i)
                    im.x++;
    }

    public void renderer(Renderer renderer) {
        animation.renderer(renderer, seconds, image, right, left, up, down);
    }
}
