#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.canoo.dolphin.client.ClientContext;
import com.canoo.dolphin.client.javafx.DolphinPlatformApplication;
import ${package}.view.MyView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class for the JavaFX client
 * In this clas sthe global Dolphin Platform {@link ClientContext} is created. This context defines the central communication
 * between client and server. It's configured by using http://localhost:8080/dolphin as the server endpoint that is the
 * default Dolphin Platform endpoint.
 * In the start method a new view is created. Here the UI of the view is defined in a FXML file (view.fxml) and the
 * MyViewBinder class is used as client side controller for the view. Internally this class don't contain any controller
 * logic and only binds the given UI to Dolphin Platform and the controller instance on the server.
 */
public class ClientApplication extends DolphinPlatformApplication {

    @Override
    protected String getServerEndpoint() {
        return "http://localhost:8080/dolphin";
    }


    @Override
    protected void start(Stage primaryStage, ClientContext clientContext) throws Exception {

        //Create the view that is bound to a Dolphin Platform controller on the server
        MyView view = new MyView(clientContext);

        //Shows the JavaFX client on the screen
        Scene scene = new Scene((Parent) view.getRootNode());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}
