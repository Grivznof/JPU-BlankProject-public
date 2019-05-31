/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import controller.Controller;
import controller.test.ControllerTest;
import model.Model;
import view.View;

import java.io.IOException;
import java.sql.SQLException;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) throws SQLException, IOException {
        final Model model = new Model();
        final View view = new View(model);
        final ControllerTest controller = new ControllerTest(model, view);
        view.setController((IController) controller);


        final ControllerTest Controller = new ControllerTest(playerModel);
        //final IViewSystem View = new View(Controller, playerModel, playerModel);//
        ControllerTest.setViewSystem(View);
        ControllerTest.play();
    }
}
