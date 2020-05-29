void desligar(){
    System.out.println("Chamei funcao para desligar");
    Ligada = false;
    System.out.println("Agora a TV está desligada");
}
void aumentavolume(){
    System.out.println("Aumentar volume...");
    volume++;
    System.out.println("Volume aumentado");
}
void diminuivolume(){
    System.out.println("Diminuir volume...");
    if (volume>0){
        volume=volume-1;
        System.out.println("Volume no mute");
    }
    System.out.println("Volume diminuido");
}
void ajustavolume(int avolume){
    System.out.println("Aumentar volume...");
    volume=avolume;
    System.out.println("Volume ajustado");
}

public void setmarca(pmarca){
    if pmarca=="";{
        System.out.println("Marca nao pode ser vazio");
    }
    marca=pmarca;
}

public void getmarca();{
    return(marca);
}

public boolean 

public int