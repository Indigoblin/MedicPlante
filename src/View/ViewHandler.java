package View;

import Controller.ControllerMenu;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

public class ViewHandler extends Application {

    private Stage primaryStage;
    private ViewPrincipale vp;
    private ViewAdmin vpa;
    private Menu model;
    private ControllerMenu controllerMenu;
    private ViewAdmin controllePageAdmin;
    private Group root;

    /**
     * Permet le lancement de l'application : méthode obligatoire pour JavaFX
     *
     * @param primaryStage ()
     * @throws Exception ()
     */

    @Override
    public void start(Stage primaryStage)  {
        this.primaryStage = primaryStage;


        root = new Group();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("Asset/css/styleCss.css");

        model = new Menu();
        vpa = new ViewAdmin(model, root);
        vp = new ViewPrincipale(model, root);

        controllerMenu = new ControllerMenu(this, model);

        // Affichage du menu

        primaryStage.setTitle("Médic Plante");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(false);
        primaryStage.show();
    }

    public void setEventHandlerMenu(ControllerMenu cm) {
        vp.setEvents(cm);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ViewPrincipale getVp() {
        return vp;
    }

    public ViewAdmin getVpa(){
        return vpa;
    }

    public void setVueCompleteMenu() {
        vp.setVueCompleteMenu();
    }

    public void setVueCompletePageAdmin() {
        vpa.setVueCompletePageAdmin();
    }

}
