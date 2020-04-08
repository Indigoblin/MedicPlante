package Controller;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;

public class ControllerMenu implements EventHandler<MouseEvent> {

    /**
     * Attributs du controleur du menu
     */

    private ViewHandler launcher;
    private Menu model;

    /**
     * Constructeur du controleur relatif au menu principal
     *
     * @param launcher (Gestionnaire de vue)
     * @param model    (Modèle correcpondant au menu principal)
     */

    public ControllerMenu(ViewHandler launcher, Menu model) {
        this.model = model;
        this.launcher = launcher;
        this.launcher.setEventHandlerMenu(this);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if (mouseEvent.getSource().equals(launcher.getVp().getPageAdmin())) {
            launcher.setVueCompletePageAdmin();

        } else if (mouseEvent.getSource().equals(launcher.getVpa().getRetour())) {
            launcher.setVueCompleteMenu();

        } else if (mouseEvent.getSource().equals(launcher.getVp().getQuitter())) {
            launcher.getPrimaryStage().close();
        }
    }
}