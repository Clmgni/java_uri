import java.util.Scanner;

public class Biblioteca {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro("Livro 1", "Autor 1", 2002, "Aventura", 1, 1);
        Livro livro2 = new Livro("Livro 2", "Autor 1", 2005, "Aventura", 1, 2);
        Livro livro3 = new Livro("Livro 3", "Autor 2", 2013, "Programacao", 1, 3);
        Livro livro4 = new Livro("Livro 4", "Autor 3", 2020, "Romance", 1, 4);
        Livro livro5 = new Livro("Livro 5", "Autor 2", 2002, "Programacao", 1, 5);

        int opcao = 0;
        do{

            System.out.println("1 -> Emprestar livro");
            System.out.println("2 -> Verificar disponibilidade");
            System.out.println("-------------");
            System.out.println("0 -> Sair");

            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("-----> Emprestar livro <-----");
                    System.out.println("-----> Digite o numero do livro <-----");
                    System.out.printf("1 -> %s, de %s\n", livro1.getTitulo(), livro1.getAutor());
                    System.out.printf("2 -> %s, de %s\n", livro2.getTitulo(), livro2.getAutor());
                    System.out.printf("3 -> %s, de %s\n", livro3.getTitulo(), livro3.getAutor());
                    System.out.printf("4 -> %s, de %s\n", livro4.getTitulo(), livro4.getAutor());
                    System.out.printf("5 -> %s, de %s\n", livro5.getTitulo(), livro5.getAutor());
                    System.out.printf("0 -> Voltar ao menu anterior\n");
                    opcao = scanner.nextInt();
                    switch(opcao){
                        case 1:
                            if(!livro1.isEmprestado()){
                                System.out.println("Tenha uma boa leitura!");
                                livro1.setEmprestado(true);
                                break;
                            }else{
                                System.out.println("Ops, esse livro não está disponivel");
                                break;
                            }
                        case 2:
                            if(!livro2.isEmprestado()){
                                System.out.println("Tenha uma boa leitura!");
                                livro2.setEmprestado(true);
                                break;
                            }else{
                                System.out.println("Ops, esse livro não está disponivel");
                                break;
                            }
                        case 3:
                            if(!livro3.isEmprestado()){
                                System.out.println("Tenha uma boa leitura!");
                                livro3.setEmprestado(true);
                                break;
                            }else{
                                System.out.println("Ops, esse livro não está disponivel");
                                break;
                            }
                        case 4:
                            if(!livro4.isEmprestado()){
                                System.out.println("Tenha uma boa leitura!");
                                livro4.setEmprestado(true);
                                break;
                            }else{
                                System.out.println("Ops, esse livro não está disponivel");
                                break;
                            }
                        case 5:
                            if(!livro5.isEmprestado()){
                                System.out.println("Tenha uma boa leitura!");
                                livro5.setEmprestado(true);
                                break;
                            }else{
                                System.out.println("Ops, esse livro não está disponivel");
                                break;
                            }
                        case 0:
                            break;
                    }
                case 2:
                    System.out.println("-----> Verificar Disponibilidade <-----");
                    System.out.println("-----> Digite o numero do livro <-----");
                    System.out.printf("1 -> %s, de %s\n", livro1.getTitulo(), livro1.getAutor());
                    System.out.printf("2 -> %s, de %s\n", livro2.getTitulo(), livro2.getAutor());
                    System.out.printf("3 -> %s, de %s\n", livro3.getTitulo(), livro3.getAutor());
                    System.out.printf("4 -> %s, de %s\n", livro4.getTitulo(), livro4.getAutor());
                    System.out.printf("5 -> %s, de %s\n", livro5.getTitulo(), livro5.getAutor());
                    System.out.printf("0 -> Voltar ao menu anterior\n");
                    opcao = scanner.nextInt();
                    switch(opcao){
                        case 1:
                            if(livro1.isEmprestado())
                                System.out.println("Livro indisponivel");
                            else
                                System.out.println("Livro disponivel");
                            break;
                        case 2:
                            if(livro2.isEmprestado())
                                System.out.println("Livro indisponivel");
                            else
                                System.out.println("Livro disponivel");
                            break;                            
                        case 3:
                            if(livro3.isEmprestado())
                                System.out.println("Livro indisponivel");
                            else
                                System.out.println("Livro disponivel");
                            break;
                        case 4:
                            if(livro4.isEmprestado())
                                System.out.println("Livro indisponivel");
                            else
                                System.out.println("Livro disponivel");
                            break;
                        case 5:
                            if(livro5.isEmprestado())
                                System.out.println("Livro indisponivel");
                            else
                                System.out.println("Livro disponivel");
                            break;
                        case 0:
                            break;
                        
                    }

            }
            
        }while(opcao != 0);
            
        
    }
}