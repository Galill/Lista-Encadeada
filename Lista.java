package ListaEncadeada;

public interface Lista {
    
    /*Verifica se a lista está vazia.*/
    public boolean vazia();

    //public boolean cheia();  esse metodo não é necessário pois listas encadeadas não tem tamanho máximo.

    /*Retorna o tamanho da lista.*/ 
    public int tamanho();

    /*Retorna o elemento dada uma posição na lista.*/ 
    public int elemento(int pos);

    /*Retorna a posição de um dado inserido.*/
    public int posicao(int dado);

    /*Insere um dado na posição escolhida.*/
    public boolean insere(int pos, int dado);

    /*Remove um dado da posição escolhida.*/
    public int remove(int pos);
}
