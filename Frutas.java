import java.io.Serializable;
 
public class Fruta implements Serializable{
    private String nome;
    private String cor;
 
    public Fruta(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }
 
    public String getCor() { return cor; }
    public String getNome() { return nome; }
    public void setCor(String cor) { this.cor = cor; }
    public void setNome(String nome) { this.nome = nome; }   
}