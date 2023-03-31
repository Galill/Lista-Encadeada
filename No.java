package ListaEncadeada;

public class No {

    private int conteudo;
    private No proximo;

    public No(){
        this.proximo = null;
    }

    public int getConteudo(){
        return conteudo;
    }

    public void setConteudo(int conteudo){
        this.conteudo = conteudo;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }
}
