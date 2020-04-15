package View;

import Model.Plante;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


import static javafx.scene.text.FontWeight.BOLD;

public class BoxPlante extends Pane {

    private int height = 200;
    private Plante plante;
    private HBox hboxContainer;
    private VBox vboxText;
    private Font police;

    public BoxPlante(Plante plante) {


        hboxContainer = new HBox();

/////////////////////////////////////////////////////////////////////////////////////
//..Image............................................................................
       /* ImageView imagePlante = new ImageView("Asset/ImagesPlantes/" + plante.getPhoto());
        imagePlante.setFitHeight(150);
        imagePlante.setPreserveRatio(true);
        imagePlante.setTranslateX(10);
        imagePlante.setTranslateY(22);
        imagePlante.setEffect(new DropShadow(20, Color.BLACK));
*/
        Rectangle rectangle = new Rectangle(0, 0, 280, 180);
        rectangle.setArcWidth(30.0);   // Corner radius
        rectangle.setArcHeight(30.0);

        ImagePattern pattern = new ImagePattern(
                new Image("Asset/ImagesPlantes/" + plante.getPhoto(), 280, 180, false, false) // Resizing
        );

        rectangle.setFill(pattern);
        rectangle.setEffect(new DropShadow(20, Color.LIGHTGREEN));

        rectangle.setHeight(150);
        rectangle.setWidth(150);

        rectangle.setTranslateX(0);
      rectangle.setTranslateY(25);

//..HboxTitre........................................................................
        HBox hboxTitre = new HBox();
        hboxTitre.setTranslateX(30);




        Label nomPlante = new Label("" + plante.getNom());


        nomPlante.setFont(Font.font("Amble CN", BOLD, 22));


        hboxTitre.getChildren().addAll(nomPlante);








//..VboxDescription...................................................................
        VBox vboxDescription = new VBox();
        vboxDescription.setTranslateX(30);
        vboxDescription.setTranslateY(15);

        Label titreDescription = new Label("Description :");
        titreDescription.setFont(Font.font("Amble CN", BOLD, 13));

        Label description = new Label("" + plante.getDescription());

        description.setMaxWidth(250);
        description.setTranslateY(10);
        description.setWrapText(true);

        vboxDescription.getChildren().addAll(titreDescription, description);


//..VboxTitre+Description..............................................................

        VBox vBoxTitreDescription = new VBox();
        vBoxTitreDescription.getChildren().addAll(hboxTitre, vboxDescription);

///////Final///////////////////////////////////////////////////////////////////////////


        hboxContainer.getChildren().addAll(rectangle, vBoxTitreDescription);
        hboxContainer.setPrefHeight(height);
        hboxContainer.setTranslateX(20);
        hboxContainer.setTranslateY(20);


    }

    public HBox getHboxContainer() {
        return hboxContainer;
    }
}
