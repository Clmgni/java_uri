void emprestar(Livro){
    System.out.println("Empresta livro");
    Livro.emprestado = true;
    System.out.println("Livro emprestado");
}
void devolver(Livro){
    System.out.println("Devolve livro");
    Livro.emprestado = false;
    System.out.println("Livro devolvido");
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

public void getLivro(class Livro);{
    return(Livro.titulo);
}

public void getEmprestado(class Livro);{
    return(Livro.emprestado);
}


public boolean 

public int