package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;


class ViewFrame extends JFrame implements KeyListener {

    // The model. //
	private IModel model;

    // The controller. //
	private IController controller;

    // The Constant serialVersionUID. //
	private static final long    serialVersionUID    = -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model) throws HeadlessException, IOException {
		this.buildViewFrame(model);
	}
/* Instantiates a new view frame.
			*
			* @param model
     *          the model
     * @param gc
     *          the gc
     */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) throws IOException {
		super(gc);
		this.buildViewFrame(model);
	}

    /* Instantiates a new view frame.
			*
			* @param model
     *          the model
     * @param title
     *          the title
     * @throws HeadlessException
     *           the headless exception
     */
	public ViewFrame(final IModel model, final String title) throws HeadlessException, IOException {
		super(title);
		this.buildViewFrame(model);
	}

    /* Instantiates a new view frame.
			*
			* @param model
     *          the model
     * @param title
     *          the title
     * @param gc
     *          the gc
     */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) throws IOException {
		super(title, gc);
		this.buildViewFrame(model);
	}

    /* Gets the controller.
     *
			 * @return the controller
     */
	private IController getController() {
		return this.controller;
	}

    /* Sets the controller.
     *
			 * @param controller
     *          the new controller
     */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

    /* Gets the model.
     *
			 * @return the model
     */
	protected IModel getModel() {
		return this.model;
	}
/* Sets the model.
     *
			 * @param model
     *          the new model
     */
	private void setModel(final IModel model) {
		this.model = model;
	}

    /* Builds the view frame.
			*
			* @param model
     *          the model
     */
	private void buildViewFrame(final IModel model) throws IOException{
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(1408 + this.getInsets().left + this.getInsets().right,  704+ this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(final KeyEvent e) {

	}

	public void printMessage(String message) {
	}
}