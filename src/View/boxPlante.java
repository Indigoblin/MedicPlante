package View;

import Model.Plante;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


import static javafx.scene.text.FontWeight.BOLD;

public class boxPlante {

    private int height = 200;
    private Plante plante;
    private HBox hboxContainer;
    private VBox vboxText;
    private Font police;

    public boxPlante(Plante plante) {
        this.plante = plante;

        hboxContainer = new HBox();

//////////////////////////////////////////////////////////////////////////////////////////
//..Image.............................................................................
        ImageView imagePlante = new ImageView(/*plante.getPhotoPlante*/);
        imagePlante.setFitHeight(60);
        imagePlante.setPreserveRatio(true);

///////////HboxTitre........................................................................
        HBox hboxTitre = new HBox();

        Label titre = new Label("Nom :");
        titre.setFont(Font.font("Amble CN", BOLD, 30));

        Label nomPlante = new Label( /*plante.getNomPlante()*/ );

        hboxTitre.getChildren().addAll(titre, nomPlante);
///////////VboxDescription...................................................................
        VBox vboxDescription = new VBox();

        Label titreDescription= new Label("Description :");
        titreDescription.setFont(Font.font("Amble CN", BOLD, 30));

        Label description = new Label(/*plante.getDescriptionPlante*/);

        vboxDescription.getChildren().addAll(titreDescription, description);


//..VboxTitre+Description.................................................................

        VBox vBoxTitreDescription = new VBox();
        vBoxTitreDescription.getChildren().addAll(hboxTitre, vboxDescription);



///////Final//////////////////////////////////////////////////////////////////////////////////////


        hboxContainer.getChildren().addAll(imagePlante, vBoxTitreDescription);

    }

    public HBox getHboxContainer() {
        return hboxContainer;
    }
}
