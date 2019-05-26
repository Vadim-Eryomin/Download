package Engine;
import Game.GameManager;
public abstract class GameObject {
    public ImageXY image[][];
    public boolean right = true;
    public boolean left = false;
    public boolean up = false;
    public boolean down = false;
    public int seconds = 0;
    public abstract void create();
    public abstract void update(GameManager g);
    public abstract void renderer(Renderer renderer);
}
