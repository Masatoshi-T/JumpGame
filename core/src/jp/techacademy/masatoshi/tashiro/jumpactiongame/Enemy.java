package jp.techacademy.masatoshi.tashiro.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject {
    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;

    // 状態
    public static final int ENEMY_DOWN = 0;
    public static final int ENEMY_UP = 1;

    public static final float ENEMY_VELOCITY = -3.0f;

    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        mState = ENEMY_DOWN;
        velocity.y = ENEMY_VELOCITY;
    }

    public void update(float deltaTime){
        setY(getY() + velocity.y * deltaTime);
    }

    public void down() {
        velocity.y = ENEMY_VELOCITY;
    }
}