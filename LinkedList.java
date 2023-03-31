package ListaEncadeada;

public class LinkedList extends No implements Lista {
    
    private No cabeca;
    private int tamanho;

    public LinkedList(){
        this.cabeca = null;
        this.tamanho = 0;
    }

    @Override
    public boolean vazia() {
        if(this.tamanho == 0){
            return true;
        } else {
            return false;
        }
    
    }

    @Override
    public boolean cheia() {
        return false;

    }

    @Override
    public int tamanho() {
        return this.tamanho;
    
    }

    @Override
    public int elemento(int pos) {
        No aux = this.cabeca;
        int count = 1;

        if(vazia()) return -1;

        if((pos < 1) || (pos > this.tamanho)) return -1;

        while(count < pos){
            aux = aux.getProximo();
            count++;
        }
        return aux.getConteudo();
    }

    @Override
    public int posicao(int dado) {
        int count = 1;
        No aux;

        if(vazia()) return 0;
        aux = cabeca;
        while(aux != null){
            if(aux.getConteudo() == dado){ 
                return count;
            }
            aux = aux.getProximo();
            count++;
        }
        return -1;
    }

    public boolean ModificaConteudo(int pos, int valor){
        int count = 1;
        No aux = this.cabeca;

        if(vazia()) return false;

        if((pos < 1) || (pos > this.tamanho)) return false;

        while(count < pos){
            aux = aux.getProximo();
            count++;
        }
        aux.setConteudo(valor);

        return true;
    }

    @Override
    public boolean insere(int pos, int dado) {
        if(vazia() && pos != 1) return false;

        if(pos == 1){   
            return insereInicioLista(dado);
        } else if(pos == tamanho){
            return insereFimLista(dado);
        } else {
            return insereMeioLista(pos, dado);
        }
    }  

    private boolean insereInicioLista(int valor){
        No novoNo = new No();

        novoNo.setConteudo(valor);
        novoNo.setProximo(this.cabeca);
        this.cabeca = novoNo;
        this.tamanho++;
        return true;
    }

    private boolean insereMeioLista(int pos, int dado){
        int count = 1;
        No novoNo = new No();
        novoNo.setConteudo(dado);

        No aux = this.cabeca;
        while((count < pos - 1) && (aux != null)){
            aux = aux.getProximo();
            count++;
        }
        if(aux == null) return false;

        novoNo.setProximo(aux.getProximo());
        aux.setProximo(novoNo);
        this.tamanho++;
        return true;
    }

    private boolean insereFimLista(int dado){
        No novoNo = new No();
        novoNo.setConteudo(dado);

        No aux = this.cabeca;
        while(aux.getProximo() != null){
            aux.getProximo();
        }

        novoNo.setProximo(null);
        aux.setProximo(novoNo);
        this.tamanho++;
        return true;
    }

    @Override
    public int remove(int pos) {
        if(vazia()) return -1;

        if(pos == 1){
            return removeInicioLista();
        } else {
            return removeNaLista(pos);
        }
    }

    private int removeInicioLista(){
        No p = this.cabeca;
        int dado = p.getConteudo();

        cabeca = p.getProximo();
        this.tamanho--;

        p = null;
        return dado;
    }

    private int removeNaLista(int pos){
        No atual = null, anterior = null;
        int dado = -1, count = 1;

        atual = this.cabeca;
        while((count < pos) && (atual != null)){
            anterior = atual;
            atual = atual.getProximo();
            count++;
        }

        if(atual == null) return -1;

        dado = atual.getConteudo();
        anterior.setProximo(atual.getProximo());
        this.tamanho--;

        atual = null;
        return dado;
    }
}


