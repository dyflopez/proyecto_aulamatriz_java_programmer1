package genericos;

public interface Contendor<T> {
    T obtener();
    void guarrdar(T objeto);
}
