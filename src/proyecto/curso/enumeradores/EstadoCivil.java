package proyecto.curso.enumeradores;

public enum EstadoCivil {

    SOLTERO("SINGLE",1,true),
    UNION_LIBRE("COUPLE",2,true),
    DIVORCIADO("DIVORCED",3,true),
    VIUDO("WIDOWER",4,true);

    private final String estado;

    private final int code;

    private final boolean isActibe;

    EstadoCivil(String estado,int code,boolean isActibe) {
        this.estado = estado;
        this.code =code;
        this.isActibe= isActibe;
    }

    public String getEstado() {
        return estado;
    }

    public int getCode() {
        return code;
    }

    public boolean isActibe() {
        return isActibe;
    }
}
