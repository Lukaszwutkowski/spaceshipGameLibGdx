import com.badlogic.gdx.Input;

public class LevelScreen extends BaseScreen{

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.X){
            spaceship.warp();
        }
        return false;
    }

    private Spaceship spaceship;

    @Override
    public void initialize() {

        BaseActor space = new BaseActor(0,0, mainStage);
        space.loadTexture("assets/space.png");
        space.setSize(800, 600);
        BaseActor.setWorldBounds(space);

        spaceship = new Spaceship(400,300, mainStage);

    }

    @Override
    public void update(float dt) {

    }
}
