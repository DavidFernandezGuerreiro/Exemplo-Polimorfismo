
package exemplopolimorfismo;

/**
 *
 * @author dfernandezguerreiro
 */
public class Alumno extends Persoa{
    int nota=9;

    public Alumno() {
    }

    public Alumno(int nota) {
        this.nota=nota;
    }

    public Alumno(int nota, String nome, int edade) {
        super(nome, edade);
        this.nota=nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota=nota;
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
        return "Nome: "+super.nome+", edade: "+super.edade+", nota: "+nota;
    }
    
    
}
