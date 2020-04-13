package View;

import Controller.ControllerMenu;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import Sample.BDDManager;


public class ViewPrincipale {

    private final Rectangle2D primaryScreenBounds;
    private Menu model;
    private javafx.scene.control.Button btnPageAdmin;
    private javafx.scene.control.Button btnQuitter;
    private Group root;
    private ImageView imgBG;
    private ImageView Logo;
    private BDDManager bdd;
    private ImageView corps;
    private VBox boxLeft;
    private Button btnTete, btnTorse, btnVentre, btnMain, btnCoude, btnNuque, btnSex, btnPied, btnPeau;


    ViewPrincipale(Menu model, Group root) {

        this.root = root;
        this.model = model;
        primaryScreenBounds = Screen.getPrimary().getBounds();
        initBackground();
        initCorps();
        initBoxLeft();


        // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 85) / 100;
        double posY = (primaryScreenBounds.getHeight() * 80) / 100;

        btnPageAdmin = initButton(posX, posY, "Admin");
        btnQuitter = initButton(posX, posY + 70, "Quitter");

        setVueCompleteMenu();
    }


    public Button initButton(double posX, double posY, String textBtn) {

        Button b = new Button();// Création d'un bouton

        b.setText(textBtn);
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.getStyleClass().add("btnMenu");
        return b;
    }


    private void initBackground() {
        imgBG = new javafx.scene.image.ImageView("Asset/Images/background.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBG.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBG.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initLogo() {
        Logo = new javafx.scene.image.ImageView("Asset/Images/Logo_Medic.png");
        Logo.setY(100);
        Logo.setX(100);
    }

    private void initCorps() {
        corps = new ImageView("Asset/Images/corps.png");

        double posXBody = (primaryScreenBounds.getWidth() * 45) / 100;
        double posYBody = (primaryScreenBounds.getHeight() * 8) / 100;
        double heightBody = (primaryScreenBounds.getHeight() * 90) / 100;


        corps.setX(posXBody);
        corps.setY(posYBody);
        corps.setFitHeight(heightBody);
        corps.setPreserveRatio(true);


        btnTete = new Button();// Création d'un bouton

        double posX = (primaryScreenBounds.getWidth() * 54.4) / 100;
        double posY = (primaryScreenBounds.getHeight() * 15) / 100;
        double height = (primaryScreenBounds.getHeight() * 12) / 100;
        double width = height;


        btnTete.setLayoutX(posX);
        btnTete.setLayoutY(posY);
        btnTete.setPrefWidth(width);
        btnTete.setPrefHeight(height);
        btnTete.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnTete.getStyleClass().add("btnCorps");
        btnTete.setOpacity(0.5);

//.................................................................

        btnTorse = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 54.2) / 100;
        posY = (primaryScreenBounds.getHeight() * 26) / 100;
        height = (primaryScreenBounds.getHeight() * 13) / 100;
        width = height;


        btnTorse.setLayoutX(posX);
        btnTorse.setLayoutY(posY);
        btnTorse.setPrefWidth(width);
        btnTorse.setPrefHeight(height);
        btnTorse.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnTorse.getStyleClass().add("btnCorps");
        btnTorse.setOpacity(0.5);

        //.................................................................

        btnVentre = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 54.2) / 100;
        posY = (primaryScreenBounds.getHeight() * 36) / 100;
        height = (primaryScreenBounds.getHeight() * 13) / 100;
        width = height;


        btnVentre.setLayoutX(posX);
        btnVentre.setLayoutY(posY);
        btnVentre.setPrefWidth(width);
        btnVentre.setPrefHeight(height);
        btnVentre.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnVentre.getStyleClass().add("btnCorps");
        btnVentre.setOpacity(0.5);

        //.................................................................

        btnMain = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 46.8) / 100;
        posY = (primaryScreenBounds.getHeight() * 50) / 100;
        height = (primaryScreenBounds.getHeight() * 9) / 100;
        width = height;


        btnMain.setLayoutX(posX);
        btnMain.setLayoutY(posY);
        btnMain.setPrefWidth(width);
        btnMain.setPrefHeight(height);
        btnMain.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnMain.getStyleClass().add("btnCorps");
        btnMain.setOpacity(0.5);

        //.................................................................

        btnCoude = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 50) / 100;
        posY = (primaryScreenBounds.getHeight() * 38) / 100;
        height = (primaryScreenBounds.getHeight() * 7) / 100;
        width = height;


        btnCoude.setLayoutX(posX);
        btnCoude.setLayoutY(posY);
        btnCoude.setPrefWidth(width);
        btnCoude.setPrefHeight(height);
        btnCoude.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnCoude.getStyleClass().add("btnCorps");
        btnCoude.setOpacity(0.5);

        //.................................................................

        btnNuque = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 56.2) / 100;
        posY = (primaryScreenBounds.getHeight() * 24) / 100;
        height = (primaryScreenBounds.getHeight() * 6) / 100;
        width = height;


        btnNuque.setLayoutX(posX);
        btnNuque.setLayoutY(posY);
        btnNuque.setPrefWidth(width);
        btnNuque.setPrefHeight(height);
        btnNuque.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnNuque.getStyleClass().add("btnCorps");
        btnNuque.setOpacity(0.5);

        //.................................................................

        btnSex = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 55.2) / 100;
        posY = (primaryScreenBounds.getHeight() * 48) / 100;
        height = (primaryScreenBounds.getHeight() * 9) / 100;
        width = height;


        btnSex.setLayoutX(posX);
        btnSex.setLayoutY(posY);
        btnSex.setPrefWidth(width);
        btnSex.setPrefHeight(height);
        btnSex.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnSex.getStyleClass().add("btnCorps");
        btnSex.setOpacity(0.5);

        //.................................................................

        btnPied = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 52.7) / 100;
        posY = (primaryScreenBounds.getHeight() * 84) / 100;
        height = (primaryScreenBounds.getHeight() * 9) / 100;
        width = height;


        btnPied.setLayoutX(posX);
        btnPied.setLayoutY(posY);
        btnPied.setPrefWidth(width);
        btnPied.setPrefHeight(height);
        btnPied.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnPied.getStyleClass().add("btnCorps");
        btnPied.setOpacity(0.5);

        //.................................................................

        btnPeau = new Button();// Création d'un bouton

        posX = (primaryScreenBounds.getWidth() * 67.2) / 100;
        posY = (primaryScreenBounds.getHeight() * 16) / 100;
        height = (primaryScreenBounds.getHeight() * 13) / 100;
        width = height;


        btnPeau.setLayoutX(posX);
        btnPeau.setLayoutY(posY);
        btnPeau.setPrefWidth(width);
        btnPeau.setPrefHeight(height);
        btnPeau.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
        btnPeau.getStyleClass().add("btnCorps");
        btnPeau.setOpacity(0.5);

    }

    private void initBoxLeft() {
        boxLeft = new VBox();

        double posXBoxLeft = (primaryScreenBounds.getWidth() * 2.5) / 100;
        double posYBoxLeft = (primaryScreenBounds.getHeight() * 2.5) / 100;
        double heightBoxLeft = (primaryScreenBounds.getHeight() * 90) / 100;
        double widthBoxLeft = (primaryScreenBounds.getWidth() * 25) / 100;
        boxLeft.setPrefHeight(heightBoxLeft);
        boxLeft.setPrefWidth(widthBoxLeft);
        boxLeft.setLayoutX(posXBoxLeft);
        boxLeft.setLayoutY(posYBoxLeft);
        boxLeft.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(20), Insets.EMPTY)));

        initLogo();

        boxLeft.getChildren().add(Logo);
    }

    void setVueCompleteMenu() {
        root.getChildren().clear();
        root.getChildren().add(imgBG);
        root.getChildren().add(btnPageAdmin);
        root.getChildren().add(btnQuitter);
        root.getChildren().add(corps);
        root.getChildren().add(btnTete);
        root.getChildren().add(btnTorse);
        root.getChildren().add(btnVentre);
        root.getChildren().add(btnMain);
        root.getChildren().add(btnCoude);
        root.getChildren().add(btnNuque);
        root.getChildren().add(btnSex);
        root.getChildren().add(btnPied);
        root.getChildren().add(btnPeau);







        root.getChildren().add(boxLeft);
    }

    void setEvents(ControllerMenu mc) {
        btnPageAdmin.setOnMouseClicked(mc);
        btnQuitter.setOnMouseClicked(mc);
    }

    public Button getQuitter() {
        return btnQuitter;
    }

    public Button getPageAdmin() {
        return btnPageAdmin;
    }
}
