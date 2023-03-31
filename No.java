package ListaEncadeada;

public class No {

    private int conteudo;
    private No proximo;

    public No(){
        this.proximo = null;
    }

    /*Recebe o conteudo relacionado ao No*/
    public int getConteudo(){
        return conteudo;
    }

    /*Confere o conteudo do No*/
    public void setConteudo(int conteudo){
        this.conteudo = conteudo;
    }

    /*Aponta para o próximo No*/
    public No getProximo(){
        return proximo;
    }

    /*Escolhe para quem o No vai apontar*/
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
}
