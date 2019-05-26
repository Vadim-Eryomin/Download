package Game;

import Engine.Animation;
import Engine.GameObject;
import Engine.ImageXY;
import Engine.Renderer;

public class ToolBar extends GameObject {
    Animation animation = new Animation();
    @Override
    public void create() {
        image = new ImageXY[1][1];
        image[0][0] = new ImageXY("toolBar.png",1,1);
    }

    @Override
    public void update(GameManager g) {

    }

    @Override
    public void renderer(Renderer renderer) {
        animation.renderer(renderer, seconds, image, right, left, up, down);
    }
}
