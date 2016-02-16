#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.kumuluz.ee.EeApplication;

/**
 * This class is a small helper class to start the application running in KumuluzEE
 */
public class ServerApplication {

    public static void main(String... args) {
        EeApplication.main(args);
    }

}
