public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private Integer ano;

    public Livro() {

    }

    public Livro(String autor, String titulo, Integer ano) {
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "---- Livro ----" + "\n" + "Titulo: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n" + "Ano: " + getAno() + "\n" + "---------------";
    }

    private String gerarChave(){
        String chave = (this.getAutor()+this.getTitulo()+this.getAno()).toLowerCase();
        return chave;
    }

    @Override
    public int compareTo(Livro obj) {
        Livro outraChave = (Livro) obj;
        String chave = this.gerarChave();
        String outraChaveInterna = outraChave.gerarChave();
        return chave.compareTo(outraChaveInterna);
    }

    // compareTo tem que funcionar 
        
}
