package View;

import Controller.ControllerMenu;
import Model.Plante;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import Sample.BDDManager;
import javafx.util.Duration;

import java.util.ArrayList;


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
    private ComboBox<String> choiceBox;
    private Label labelChoice;
    private Button Valider;
    private ScrollPane scrollPane;
    private ArrayList<Plante> tableauPlante;
    private Label labelTitre;


    ViewPrincipale(Menu model, Group root) {

        this.root = root;
        this.model = model;
        primaryScreenBounds = Screen.getPrimary().getBounds();
        initTextTitre();
        initBackground();
        initCorps();
        initBoxLeft();
        tableauPlante = new ArrayList();


        // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 85) / 100;
        double posY = (primaryScreenBounds.getHeight() * 80) / 100;

        btnPageAdmin = initButton(posX, posY, "Admin");
        btnQuitter = initButton(posX, posY + 50, "Quitter");

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

        Logo.setTranslateX(20);
        Logo.setTranslateY(20);

        Logo.setFitHeight(80);
        Logo.setPreserveRatio(true);
        Logo.setOpacity(0.8);
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

        FadeTransition fadeIn = new FadeTransition();
        fadeIn.setDuration(Duration.millis(500));
        fadeIn.setFromValue(0);
        fadeIn.setToValue(0.2);
        fadeIn.setCycleCount(1);
        fadeIn.setAutoReverse(false);

        FadeTransition fadeOut = new FadeTransition();
        fadeOut.setDuration(Duration.millis(500));
        fadeOut.setFromValue(0.2);
        fadeOut.setToValue(0);
        fadeOut.setCycleCount(1);
        fadeOut.setAutoReverse(false);

        btnTete = new Button();// Création d'un bouton

        double posX = (primaryScreenBounds.getWidth() * 54.4) / 100;
        double posY = (primaryScreenBounds.getHeight() * 15) / 100;
        double height = (primaryScreenBounds.getHeight() * 12) / 100;
        double width = height;


        btnTete.setLayoutX(posX);
        btnTete.setLayoutY(posY);
        btnTete.setPrefWidth(width);
        btnTete.setPrefHeight(height);
        btnTete.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnTete.getStyleClass().add("btnCorps");
        btnTete.setOpacity(0);

        btnTete.setOnMouseEntered(e -> {
            fadeIn.setNode(btnTete);
            fadeIn.play();
        });

        btnTete.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnTete);
            fadeOut.play();
        });

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
        btnTorse.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnTorse.getStyleClass().add("btnCorps");
        btnTorse.setOpacity(0);

        btnTorse.setOnMouseEntered(e -> {
            fadeIn.setNode(btnTorse);
            fadeIn.play();
        });

        btnTorse.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnTorse);
            fadeOut.play();
        });

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
        btnVentre.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnVentre.getStyleClass().add("btnCorps");
        btnVentre.setOpacity(0);

        btnVentre.setOnMouseEntered(e -> {
            fadeIn.setNode(btnVentre);
            fadeIn.play();
        });

        btnVentre.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnVentre);
            fadeOut.play();
        });

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
        btnMain.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnMain.getStyleClass().add("btnCorps");
        btnMain.setOpacity(0);

        btnMain.setOnMouseEntered(e -> {
            fadeIn.setNode(btnMain);
            fadeIn.play();
        });

        btnMain.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnMain);
            fadeOut.play();
        });

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
        btnCoude.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnCoude.getStyleClass().add("btnCorps");
        btnCoude.setOpacity(0);

        btnCoude.setOnMouseEntered(e -> {
            fadeIn.setNode(btnCoude);
            fadeIn.play();
        });

        btnCoude.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnCoude);
            fadeOut.play();
        });

        //.................................................................

//        btnNuque = new Button();// Création d'un bouton
//
//        posX = (primaryScreenBounds.getWidth() * 56.2) / 100;
//        posY = (primaryScreenBounds.getHeight() * 24) / 100;
//        height = (primaryScreenBounds.getHeight() * 6) / 100;
//        width = height;
//
//
//        btnNuque.setLayoutX(posX);
//        btnNuque.setLayoutY(posY);
//        btnNuque.setPrefWidth(width);
//        btnNuque.setPrefHeight(height);
//        btnNuque.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(90), Insets.EMPTY)));
//        btnNuque.getStyleClass().add("btnCorps");
//        btnNuque.setOpacity(0);
//
//        btnNuque.setOnMouseEntered(e -> {
//            fadeIn.setNode(btnNuque);
//            fadeIn.play();
//        });
//
//        btnNuque.setOnMouseExited(e -> {
//            fadeIn.stop();
//            fadeOut.setNode(btnNuque);
//            fadeOut.play();
//        });

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
        btnSex.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnSex.getStyleClass().add("btnCorps");
        btnSex.setOpacity(0);

        btnSex.setOnMouseEntered(e -> {
            fadeIn.setNode(btnSex);
            fadeIn.play();
        });

        btnSex.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnSex);
            fadeOut.play();
        });

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
        btnPied.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnPied.getStyleClass().add("btnCorps");
        btnPied.setOpacity(0);

        btnPied.setOnMouseEntered(e -> {
            fadeIn.setNode(btnPied);
            fadeIn.play();
        });

        btnPied.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnPied);
            fadeOut.play();
        });

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
        btnPeau.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(90), Insets.EMPTY)));
        btnPeau.getStyleClass().add("btnCorps");
        btnPeau.setOpacity(0);

        btnPeau.setOnMouseEntered(e -> {
            fadeIn.setNode(btnPeau);
            fadeIn.play();
        });

        btnPeau.setOnMouseExited(e -> {
            fadeIn.stop();
            fadeOut.setNode(btnPeau);
            fadeOut.play();
        });

    }

    private void initTextTitre(){
        labelTitre = new Label("Veuillez selectionner une partie du corps :");
        labelTitre.setTranslateX(600);
        labelTitre.setTranslateY(60);
        labelTitre.setMinWidth(100);
        labelTitre.setMaxHeight(100);
        labelTitre.setTextFill(Color.WHITE);

        labelTitre.getStyleClass().add("txtTitre");



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
     /*   boxLeft.setBackground(new Background(new BackgroundImage(new Image("Asset/Images/Logo_Medic.png", 500, 500, true, true),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT)));
*/
        labelChoice = new Label("Veuillez selectionner une partie du corps :");
        labelChoice.setTranslateX(0);
        labelChoice.setTranslateY(0);
        labelChoice.setMinWidth(100);
        labelChoice.setMaxHeight(30);
        labelChoice.setTextFill(Color.WHITE);

        final double MAX_FONT_SIZE = 25; // define max font size you need
        labelChoice.setFont(new Font(MAX_FONT_SIZE));

        initLogo();

      //  initScrollPane();



        Valider = new Button();// Création d'un bouton

        Valider.setText("Valider");
        Valider.setTranslateX(260);
        Valider.setTranslateY(40);

        Valider.getStyleClass().add("btnMenu");


        boxLeft.getChildren().add(Logo);

        boxLeft.getChildren().add(labelChoice);

    }

    public void afficheSelect(ArrayList<ArrayList<String>> listSymptome){



        initChoiceBox(listSymptome);
        boxLeft.getChildren().remove(choiceBox);
        boxLeft.getChildren().remove(Valider);
        boxLeft.getChildren().remove(scrollPane);

        boxLeft.getChildren().add(choiceBox);
        boxLeft.getChildren().add(Valider);

        labelChoice.setText("Veuillez cocher vos symptômes :");
        labelChoice.setTranslateX(20);
        labelChoice.setTranslateY(40);
        labelChoice.setTextFill(Color.BLACK);



    }



    private void initChoiceBox(ArrayList<ArrayList<String>> listSymptome) {

        root.getChildren().remove(labelTitre);

        ArrayList<String> symptome = new ArrayList<>();

        for (int i = 0; i < listSymptome.size(); i++) {
        String symp = listSymptome.get(i).get(1);
        symptome.add(symp);
        }

        boxLeft.getChildren().remove(choiceBox);
        choiceBox = new ComboBox(FXCollections.observableArrayList(symptome));


        // Rectangle2D bounds = choiceBox.getBoundsInParent();

      /*  Bounds bounds = boxLeft.sceneToLocal(choiceBox.localToScene(choiceBox.getBoundsInLocal()));

        double posX = (bounds.getWidth() * 54.4) / 100;
        double posY = (bounds.getHeight() * 15) / 100;
        double height = (bounds.getHeight() * 12) / 100;
        double width = (bounds.getWidth() * 40) / 100;
*/

        choiceBox.setTranslateX(20);
        choiceBox.setTranslateY(70);
        choiceBox.setPrefWidth(200);

    }

    public void initScrollPane(){
        boxLeft.getChildren().remove(scrollPane);
        scrollPane = new ScrollPane();
        scrollPane.setPrefHeight(750);
        scrollPane.setPrefWidth(250);
        scrollPane.setTranslateY(75);
        scrollPane.setLayoutX(20);

        VBox vboxListe = new VBox();
        vboxListe.setSpacing(30);


        System.out.println(tableauPlante);
        for (int i = 0; i < tableauPlante.size() ; i++) {
            BoxPlante boxPlante = new BoxPlante(tableauPlante.get(i));

            HBox boxPlantee = boxPlante.getHboxContainer();

            vboxListe.getChildren().add(boxPlantee);
        }
        System.out.println(vboxListe.getChildren().size());

        scrollPane.setContent(vboxListe);
        boxLeft.getChildren().add(scrollPane);

//        tableauPlante.clear();


//        for (int i=0; i<tableauPlante.size(); i++){

/*
        tableauPlante


            initNomFilm(tabListFilm.get(i).get(1));
            initAnneeFilm(tabListFilm.get(i).get(2));
            initResumeFilm(tabListFilm.get(i).get(3));
            initNoteFilm(tabListFilm.get(i).get(4));

            initRealisateurFilm(tabListFilm.get(i).get(6));
            initNationalite(tabListFilm.get(i).get(7));

            HBox hbox = initBoxFilm(tabListFilm.get(i).get(5), tabgenreString);

            vboxListe.getChildren().add(hbox);
*/
     //   }

    /*    scrollPane.setContent(null);

        scrollPane.setContent(vboxListe);
*/

    }

    void setVueCompleteMenu() {
        root.getChildren().clear();

        root.getChildren().add(imgBG);
        root.getChildren().add(labelTitre);
        root.getChildren().add(btnPageAdmin);
        root.getChildren().add(btnQuitter);
        root.getChildren().add(corps);
        root.getChildren().add(btnTete);
        root.getChildren().add(btnTorse);
        root.getChildren().add(btnVentre);
        root.getChildren().add(btnMain);
        root.getChildren().add(btnCoude);
        //root.getChildren().add(btnNuque);
        root.getChildren().add(btnSex);
        root.getChildren().add(btnPied);
        root.getChildren().add(btnPeau);


        root.getChildren().add(boxLeft);
    }

    void setEvents(ControllerMenu mc) {
        btnPageAdmin.setOnMouseClicked(mc);
        btnQuitter.setOnMouseClicked(mc);
        btnTete.setOnMouseClicked(mc);
        //btnNuque.setOnMouseClicked(mc);
        btnTorse.setOnMouseClicked(mc);
        btnVentre.setOnMouseClicked(mc);
        btnSex.setOnMouseClicked(mc);
        btnCoude.setOnMouseClicked(mc);
        btnMain.setOnMouseClicked(mc);
        btnPeau.setOnMouseClicked(mc);
        btnPied.setOnMouseClicked(mc);
        Valider.setOnMouseClicked(mc);

    }

    public Button getQuitter() {
        return btnQuitter;
    }

    public Button getPageAdmin() {
        return btnPageAdmin;
    }

    public Button getBtnTete() {
        return btnTete;
    }

    public Button getBtnTorse() {
        return btnTorse;
    }

    public Button getBtnVentre() {
        return btnVentre;
    }

    public Button getBtnMain() {
        return btnMain;
    }

    public Button getBtnCoude() {
        return btnCoude;
    }

    public Button getBtnNuque() {
        return btnNuque;
    }

    public Button getBtnSex() {
        return btnSex;
    }

    public Button getBtnPied() {
        return btnPied;
    }

    public Button getBtnPeau() {
        return btnPeau;
    }

    public Button getValider() {
        return Valider;
    }

    public void setTableauPlante(ArrayList tableauPlanteCT) {
        tableauPlante = tableauPlanteCT;

    }

    public ComboBox<String> getCombobox() {
        return  choiceBox;
    }
}
