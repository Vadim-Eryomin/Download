package Engine;

public class Collision {
    public boolean isCollision(GameObject A, GameObject B){
            int objAMinX = A.image[0][0].x;
            int objAMaxX = A.image[0][0].x + A.image[0][0].w;
            int objAMinY = A.image[0][0].y;
            int objAMaxY = A.image[0][0].y + A.image[0][0].h;
            int objBMinX = B.image[0][0].x;
            int objBMaxX = B.image[0][0].x + B.image[0][0].w;
            int objBMinY = B.image[0][0].y;
            int objBMaxY = B.image[0][0].y + B.image[0][0].h;

            if (objAMaxX < objBMinX || objAMinX > objBMaxX) return false;
            if (objAMaxY < objBMinY || objAMinY > objBMaxY) return false;
            return true;
    }
}
