public class Televisao {
    private String marca;
    private int tamanho;
    private int voltagem;
    private boolean ligada;
    private int volume;
    private int canal;
    private String resolucao;

    public Televisao(String marca, int tamanho, int voltagem, String resolucao){
        this.marca = marca;
        this.tamanho = tamanho;
        this.voltagem = voltagem;
        this.resolucao = resolucao;
        this.ligada = false;
        this.volume = 0;
        this.canal = 1;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }

    public int getVoltagem(){
        return this.voltagem;
    }

    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }

    public String getResolucao(){
        return this.getResolucao();
    }

    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

    public boolean getLigada(){
        return this.ligada;
    }
   

    void ligar(){
        ligada = true;
        System.out.println("Agora a TV está ligada");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV está desligada");
    }

    void avancarCanal(){
        if(ligada == true){
            canal++;
            System.out.println("Agora a TV está no canal "+canal);
        }else{
            System.out.println("Ligue a TV antes!");
        }
    }

    void voltarCanal(){
        if(ligada == true){
            canal--;
            System.out.println("Agora a TV está no canal "+canal);
        }else{
            System.out.println("Ligue a TV antes!");
        }
    }

    void escolherCanal(int canalescolhido){        
        if(ligada == true){
            canal = canalescolhido;
            System.out.println("Agora a TV está no canal "+canal);
        }else{
            System.out.println("Ligue a TV antes!");
        }
    }

    void aumentarVolume(){
        if(ligada == true){
            if(volume < 100){
                volume++;
                System.out.println("Agora a TV está no volume "+volume);
            }else{                
                System.out.println("A TV já está no volume maximo");
            }
        }else{
            System.out.println("Ligue a TV antes!");
        }
    }

    void diminuirVolume(){
        if(ligada == true){
            if(volume > 0){
                volume--;
                System.out.println("Agora a TV está no volume "+volume);
            }else{                
                System.out.println("A TV já está no volume minimo");
            }
        }else{
            System.out.println("Ligue a TV antes!");
        }
    }

}