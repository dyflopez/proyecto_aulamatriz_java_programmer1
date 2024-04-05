package clases.anidadas;
//inner classes
public class ProductosDTO {
    /**
     * Clase que esta declarada dentro de otra clase
     *
     * La clase principal tiene acceso a los la clase contenedora,
     * clase puede tener accecibilidad(oublic , private, protegido , defaul
     */
    private int datoExterno;

    public class createDTO{
        private  String name;
        private  String stock;
        private  String price;
    }

    public class updateDTO extends  createDTO{
        private  String status;
    }
}
