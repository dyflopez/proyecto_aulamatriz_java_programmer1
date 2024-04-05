package clases.anidadas;

public class ClasesLocales {

    /**
     *
     *  Local Classes  : son clases definidas dentro de un metodo
     *  Teiene acceso a los miembros de la clase contenedora y
     *  a las variables locales del metodo
     */

    private int outerFiled =80;
    public void display(){
        class LocalClassDisplay{

            String name="Daniel";
            public void displayOuterFiled(){
                System.out.println("el valor de outerFiled es " + outerFiled);
                System.out.println("el valor de name  es " + name);
            }
        }
    }

    public void displayMain(){
        String lastname="Daniel";
        class LocalClassDisplayMain{
            public void displayOuterFiled(){
                System.out.println("el valor de outerFiled es " + outerFiled);
                System.out.println("el valor de name  es " + lastname);
            }
        }
        LocalClassDisplayMain clasesLocales = new LocalClassDisplayMain();
        clasesLocales.displayOuterFiled();

    }

    public static void main(String[] args) {
        ClasesLocales clasesLocales = new ClasesLocales();
        clasesLocales.display();

    }
}
