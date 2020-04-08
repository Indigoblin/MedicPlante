package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewAdmin {

    private Menu model;
    private ImageView imgBg;
    private Group root;
    private Button btnRetour;

    /**
     * Constructeur du menu principal
     *
     * @param model (Modèle correspondant au menu)
     * @param root  (Groupe principal de la vue)
     */

    ViewAdmin(Menu model, Group root) {
        this.root = root;
        this.model = model;
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 5) / 100; // Le resultat de rectangle 2d c'est qu'on aura toujour les elements placé au bon endroit
        double posY = (primaryScreenBounds.getHeight() * 20) / 100; // sur n'importe quel taille d'écran

        btnRetour = initButton(posX, posY + 350, "Retour");


        initBackground();
        setVueCompletePageAdmin();
    }

    /**
     * Mise en place de l'image de fond en fonction de la taille de l'écran de l'utilisateur
     */

    private void initBackground() {
        imgBg = new ImageView("Asset/Images/imgBg.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    public Button initButton(double posX, double posY, String textBtn) {

        Button b = new Button();// Création d'un bouton

        b.setText(textBtn);
        b.setLayoutX(posX);
        b.setLayoutY(posY);

        return b;
    }


    void setVueCompletePageAdmin() {
        root.getChildren().clear();
        root.getChildren().add(imgBg);

        root.getChildren().add(btnRetour);
    }

    public Button getPagePrincipale() {
        return btnRetour;
    }

    public Object getRetour() {
        return btnRetour; // Ca c'est pour le controler Menu pour changer de page
    }


}