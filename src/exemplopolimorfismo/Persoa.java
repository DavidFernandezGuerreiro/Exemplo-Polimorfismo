
package exemplopolimorfismo;

/**
 *
 * @author dfernandezguerreiro
 */
public class Persoa {
    String nome="Pepe";
    int edade=20;

    public Persoa() {
    }

    public Persoa(String nome, int edade) {
        this.nome=nome;
        this.edade=edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade=edade;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+", edade: "+edade;
    }
    
    
}
