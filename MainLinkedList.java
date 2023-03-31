package ListaEncadeada;
import java.util.Scanner;

public class MainLinkedList {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int dado, pos;
        char x = 0, y = 0, w = 0, z = 0;

        //Verifica se a lista criada é vazia.
        System.out.println("Retorna TRUE caso a lista esteja vazia e FALSE caso tenha algum elemento nela: " + list.vazia());
        System.out.println(" ");

        //Pede ao usuário para inserir valores na lista. 
        while(x != 'n'){        
            System.out.println("Digite a posição do valor a ser inserido: ");
                pos = sc.nextInt();     
            System.out.println("Digite o valor a ser inserido: ");
                dado = sc.nextInt();
                list.insere(pos, dado); 
            System.out.println("Deseja inserir um novo valor? s/n");
                x = sc.next().charAt(0);
        }
        
        //Printa a lista com os valores dados pelo usuário.
        System.out.println(" ");
        System.out.println("Lista gerada: ");
        for(int i = 1; i <= list.tamanho(); i++){
            System.out.println(list.elemento(i));
        }
        
        System.out.println(" ");
        //Verifica se a lista continua vazia.
        System.out.println("Retorna TRUE caso a lista esteja vazia e FALSE caso tenha algum elemento nela: " + list.vazia());
        System.out.println(" ");
        //Verifica o tamanho da lista.
        System.out.println("Quantidade de elementos da sua lista: " + list.tamanho());
        System.out.println(" ");

        //Pede ao usuário para modificar um dos valores da lista.
        while(y != 'n'){    
            System.out.println("Digite a posição do valor a ser modificado: ");       
                pos = sc.nextInt();
            System.out.println("Digite o novo valor: ");
                dado = sc.nextInt();
                list.ModificaConteudo(pos, dado);
            System.out.println("Deseja modificar um novo valor? s/n");
                y = sc.next().charAt(0);
        }

        //Printa a lista com o valor modificado.
        System.out.println(" ");
        System.out.println("Nova lista gerada: ");
        for(int i = 1; i <= list.tamanho(); i++){
            System.out.println(list.elemento(i));
            }

        //Pede ao usuário para verificar um dos valores da lista e retorna o valor na posição pedida.
        while(w != 'n'){    
            System.out.println("Digite a posição do valor a ser verificado: ");       
                pos = sc.nextInt();
                list.elemento(pos);
            System.out.println(list.elemento(pos));
            System.out.println("Deseja verificar um novo valor? s/n");
                w = sc.next().charAt(0);
        }

        //Pede ao usuário para remover um dos valores da lista.
        while(z != 'n'){    
            System.out.println("Digite a posição do valor a ser removido: ");       
                pos = sc.nextInt();
                list.remove(pos);
            System.out.println("Deseja remover um novo valor? s/n");
                z = sc.next().charAt(0);
        }

        //printa a lista com o valor removido.
        System.out.println(" ");
        System.out.println("Nova lista gerada: ");
        for(int i = 1; i <= list.tamanho(); i++){
            System.out.println(list.elemento(i));
        }
        sc.close();
    }
}
