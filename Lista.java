package ListaEncadeada;

public interface Lista {
    
    public boolean vazia();

    public boolean cheia();

    public int tamanho();

    public int elemento(int pos);

    public int posicao(int dado);

    public boolean insere(int pos, int dado);

    public int remove(int pos);
}
