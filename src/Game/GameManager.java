package Game;

import Engine.*;

public class GameManager extends AbsractGame {
    GameContainer gc = new GameContainer(this);
    Cursor cursor = new Cursor();
    Hero hero = new Hero();
    ToolBar toolBar = new ToolBar();
    Camera camera = new Camera();
    public GameManager() {
        hero.create();
        cursor.create();
        camera.create();
        toolBar.create();
        gc.start();
    }

    @Override
    public void update(GameContainer gc, float dt) {
        camera.update(this);
        cursor.update(this);
        toolBar.update(this);
        hero.update(this);
    }

    @Override
    public void renderer(GameContainer gc, Renderer renderer) {
        camera.renderer(renderer);
        toolBar.renderer(renderer);
        hero.renderer(renderer);
        cursor.renderer(renderer);
    }

    public static void main(String[] args) {
        new GameManager();
    }

    Collision collision = new Collision();
    public boolean isCollision(GameObject A, GameObject B){return collision.isCollision(A,B);}
    public boolean isClick(GameObject A, GameManager g){return collision.isCollision(A,cursor) && g.gc.input.isButtonDown(1);}
}
