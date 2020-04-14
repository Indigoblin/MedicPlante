package Controller;

import Sample.BDDManager;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class ControllerMenu implements EventHandler<MouseEvent> {

    private final BDDManager bdd;
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
        bdd = new BDDManager();

        bdd.start();
    }

    @Override
    public void handle(MouseEvent mouseEvent) {


        Button btnCoude = launcher.getVp().getBtnCoude();
      //  Button btnNuque = launcher.getVp().getBtnNuque();
        Button btnTete = launcher.getVp().getBtnTete();
        Button btnTorse= launcher.getVp().getBtnTorse();
        Button btnVentre = launcher.getVp().getBtnVentre();
        Button btnSex = launcher.getVp().getBtnSex();
        Button btnMain = launcher.getVp().getBtnMain();
        Button btnPeau = launcher.getVp().getBtnPeau();
        Button btnPied = launcher.getVp().getBtnPied();




        if (mouseEvent.getSource().equals(launcher.getVp().getPageAdmin())) {
            launcher.setVueCompletePageAdmin();

        } else if (mouseEvent.getSource().equals(launcher.getVpa().getRetour())) {
            launcher.setVueCompleteMenu();

        } else if (mouseEvent.getSource().equals(launcher.getVp().getQuitter())) {
            launcher.getPrimaryStage().close();
        } else if (mouseEvent.getSource().equals(btnCoude) || mouseEvent.getSource().equals(btnTete) || mouseEvent.getSource().equals(btnTorse)
                || mouseEvent.getSource().equals(btnVentre) || mouseEvent.getSource().equals(btnSex) || mouseEvent.getSource().equals(btnMain)
                || mouseEvent.getSource().equals(btnPeau) || mouseEvent.getSource().equals(btnPied)) {


String partie = null;
            if (mouseEvent.getSource().equals(btnCoude)){
                partie="Articulation";

            }else if(mouseEvent.getSource().equals(btnTete)){
               partie = "Tete";

            }else if(mouseEvent.getSource().equals(btnTorse)){
                partie = "Torax";

            }else if(mouseEvent.getSource().equals(btnVentre)){
                partie = "Ventre";

            }else if(mouseEvent.getSource().equals(btnSex)){
                partie = "Sexe";

            }else if(mouseEvent.getSource().equals(btnMain)){
                 partie = "Mains";

            }else if(mouseEvent.getSource().equals(btnPeau)){
                 partie = "Peau";
            }

            ArrayList<ArrayList<String>>ListSymptome= bdd.ask("SELECT idSymptome, nomSymptome FROM bdd_medicplant.symptome WHERE id_Corps = (SELECT idCorps FROM Corps WHERE NomPartie ='"+ partie +"');");

            launcher.getVp().afficheSelect(ListSymptome);
        }

   /*     btnTete.setOnMouseClicked(mc);
        //btnNuque.setOnMouseClicked(mc);
        btnTorse.setOnMouseClicked(mc);
        btnVentre.setOnMouseClicked(mc);
        btnSex.setOnMouseClicked(mc);
        btnCoude.setOnMouseClicked(mc);
        btnMain.setOnMouseClicked(mc);
        btnPeau.setOnMouseClicked(mc);
        btnPied.setOnMouseClicked(mc);*/


    }
}