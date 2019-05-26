package Game;

import Engine.GameObject;
import Engine.ImageXY;
import Engine.Renderer;

public class Cursor extends GameObject {
    @Override
    public void create() {
        image = new ImageXY[1][1];
        image[0][0] = new ImageXY("cursor.png",0,0);
    }

    @Override
    public void update(GameManager g) {
        image[0][0].x = g.gc.input.mouseX-image[0][0].w/2;
        image[0][0].y = g.gc.input.mouseY-image[0][0].h/2;
    }

    @Override
    public void renderer(Renderer renderer) {
        renderer.drawImage(image[0][0], image[0][0].x, image[0][0].y);
    }
}
