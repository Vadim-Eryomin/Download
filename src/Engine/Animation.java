package Engine;

public class Animation {
    public void renderer(Renderer renderer, int seconds, ImageXY[][] images, boolean right, boolean left, boolean up, boolean down){
        if (right){
            if (seconds <= 60){
                renderer.drawImage(images[0][0], images[0][0].x, images[0][0].y);
            }
            else {
                renderer.drawImage(images[0][1], images[0][1].x, images[0][1].y);
            }
        }

    }
}
