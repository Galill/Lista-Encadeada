package ListaEncadeada;
import java.util.Scanner;

public class MainLinkedList {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int dado, pos;
        char x = 0, y = 0, w = 0, z = 0;

        //Verifica se a lista criada é vazia
        System.out.println("Retorna TRUE caso a lista esteja vazia e FALSE caso tenha algum elemento nela: " + list.vazia());
        System.out.println(" ");

        //Pede ao usuário para inserir valores na lista 
        while(x != 'n'){        
            System.out.println("Digite a posição do valor a ser inserido: ");
                pos = sc.nextInt();     
            System.out.println("Digite o valor a ser inserido: ");
                dado = sc.nextInt();
                list.insere(pos, dado); 
            System.out.println("Deseja inserir um novo valor? s/n");
                x = sc.next().charAt(0);
        }
        
        System.out.println(" ");
        System.out.println("Lista gerada: ");
        for(int i = 1; i <= list.tamanho(); i++){
            System.out.println(list.elemento(i));
        }
  
        System.out.println(" ");
        System.out.println("Retorna TRUE caso a lista esteja vazia e FALSE caso tenha algum elemento nela: " + list.vazia());
        System.out.println(" ");
        System.out.println("Quantidade de elementos da sua lista: " + list.tamanho());
        System.out.println(" ");

        while(y != 'n'){    
            System.out.println("Digite a posição do valor a ser modificado: ");       
                pos = sc.nextInt();
            System.out.println("Digite o novo valor: ");
                dado = sc.nextInt();
                list.ModificaConteudo(pos, dado);
            System.out.println("Deseja modificar um novo valor? s/n");
                y = sc.next().charAt(0);
        }

        System.out.println(" ");
        System.out.println("Nova lista gerada: ");
        for(int i = 1; i <= list.tamanho(); i++){
            System.out.println(list.elemento(i));
            }

        while(w != 'n'){    
            System.out.println("Digite a posição do valor a ser verificado: ");       
                pos = sc.nextInt();
                list.elemento(pos);
            System.out.println(list.elemento(pos));
            System.out.println("Deseja verificar um novo valor? s/n");
                w = sc.next().charAt(0);
        }

        while(z != 'n'){    
            System.out.println("Digite a posição do valor a ser removido: ");       
                pos = sc.nextInt();
                list.remove(pos);
            System.out.println("Deseja remover um novo valor? s/n");
                z = sc.next().charAt(0);
        }

        System.out.println(" ");
        System.out.println("Nova lista gerada: ");
        for(int i = 1; i <= list.tamanho(); i++){
            System.out.println(list.elemento(i));
        }
        sc.close();
    }
}
