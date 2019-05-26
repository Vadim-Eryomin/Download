package Game;

import Engine.*;

public class Camera extends GameObject {
    Animation animation = new Animation();
    public void create() {
        image = new ImageXY[1][1];
        image[0][0] = new ImageXY("fon.png",0,0);
    }
    public void update(GameManager g){
        if (g.hero.image[0][0].x >= 1300){
            image[0][0].x--;
            for (ImageXY[] i : g.hero.image)
                for (ImageXY im: i)
                    im.x--;
        }
        if (g.hero.image[0][0].x <= 200){
            image[0][0].x++;
            for (ImageXY[] i : g.hero.image)
                for (ImageXY im: i)
                    im.x++;
        }
        if (g.hero.image[0][0].y <= 50){
            image[0][0].y++;
            for (ImageXY[] i : g.hero.image)
                for (ImageXY im: i)
                    im.y++;
        }
        if (g.hero.image[0][0].y >= 810){
            image[0][0].y--;
            for (ImageXY[] i : g.hero.image)
                for (ImageXY im: i)
                    im.y--;
        }
        image[0][0].x = Max.range(image[0][0].x, -3600, 0);
        image[0][0].y = Max.range(image[0][0].y, -4100, 0);

    }
    public void renderer(Renderer renderer){
        animation.renderer(renderer, seconds, image, right, left, up, down);
    }
}
