public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String categoria;
    private int numeroEstante;
    private int numeroPrateleira;
    private boolean emprestado;
    
    public Livro(String titulo, String autor, int anoPublicacao, String categoria, int numeroEstante, int numeroPrateleira){
        this.titulo             = titulo;
        this.autor              = autor;
        this.anoPublicacao      = anoPublicacao;
        this.categoria          = categoria;
        this.numeroEstante      = numeroEstante;
        this.numeroPrateleira   = numeroPrateleira;
        this.emprestado         = false;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setNumeroEstante(int numeroEstante){
        this.numeroEstante = numeroEstante;
    }

    public int getNumeroEstante(){
        return numeroEstante;
    }

    public void setNumeroPrateleira(int numeroPrateleira){
        this.numeroPrateleira = numeroPrateleira;
    }

    public int setNumeroPrateleira(){
        return numeroPrateleira;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

    public boolean isEmprestado(){
        return this.emprestado;
    }
}