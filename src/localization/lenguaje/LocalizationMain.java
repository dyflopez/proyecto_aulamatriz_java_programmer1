package localization.lenguaje;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationMain {
    public static void main(String[] args) {
            //uso del Locale
        Locale enLocale = new Locale("en","US");
        ResourceBundle enBundle = ResourceBundle.getBundle("Messages",enLocale);
        System.out.println("show message" + enBundle.getString("greeting"));

        System.out.println("***********************");
        Locale esLocale =  new Locale("es","Es");
        ResourceBundle esBundle = ResourceBundle.getBundle("Messages",esLocale);
        System.out.println("show message" + esBundle.getString("greeting"));

        System.out.println("***********************");
        Locale deLocale =  new Locale("de","LU");
        ResourceBundle deBundle = ResourceBundle.getBundle("Messages",deLocale);
        System.out.println("show message" + deBundle.getString("greeting"));

        //try with resources




    }
}
