package controller.test;

import com.sun.javafx.scene.traversal.Direction;
import controller.IUserOrder;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ControllerTest extends Object {

    private boolean isGameOver  = false;
    private final IPlayerModel playerModel;
    private IViewSystem viewSystem;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(controller.Controller.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    public void orderPerform(final IUserOrderTest userOrderTest){
        if (userOrderTest != null){
            final IModelTest player = this.IModel.getIModelByPlayer(userOrderTest.getPlayer()); // ask Zack method's name IModel and player
            if (player != null){
                Direction direction;
                switch (userOrderTest.getOrder()){
                    case UP:
                        direction = Direction.UP;
                        break;
                    case RIGHT:
                        direction = Direction.RIGHT;
                        break;
                    case DOWN:
                        direction = Direction.DOWN;
                        break;
                    case LEFT:
                        direction = Direction.LEFT;
                        break;
                    case NOP:
                    default:
                        direction = this.IModel.getMobileByPlayer(userOrderTest.getPlayer()).getDirection; // ask Zack method's name
                        break;

                }
                player.setDirection(direction); // ask Zack method's name
            }
        }
    }

    public void play() {
        this.gameLoop();
        this.viewSystem.displayMessage("Game Over !");
        this.viewSystem.closeAll();
    }

    private void gameLoop(){ //todo: comparer avec insane vehicule
        while (!this.isGameOver){
            try {
                Thread.sleep(TIME_SLEEP);
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            final ArrayList<IMobile> initialMobiles = new ArrayList<~>();
            for (final IMobile mobile : this.player.getMobiles) {
                initialMobiles.add(mobile);
            }//IMobile ask Zack Mobile method
            this.playerModel.setMobilesHaveMoved();
        }
        public void setViewSystem(final IVewSystem viewSystem) {this.viewSystem = viewSystem;} //setview system here
    }





    @org.junit.Test
    public void control() {
    }

    @org.junit.Test
    public void orderPerform() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void control1() {
    }

    @Test
    public void orderPerform1() {
    }
}
