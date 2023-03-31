package ListaEncadeada;

public class LinkedList extends No implements Lista {
    
    private No cabeca;
    private int tamanho;

    public LinkedList(){
        this.cabeca = null;
        this.tamanho = 0;
    }

    /*Método que verifica se a lista está vazia e retorna true (caso esteja vazia) ou false (caso tenha algum elemento nela).*/
    @Override
    public boolean vazia() {
        if(this.tamanho == 0){
            return true;
        } else {
            return false;
        }
    
    }

    /*@Override                 Esse método não é necessário uma vez que listas encadeadas não tem tamanho máximo.
    public boolean cheia() {
        return false;

    }*/

    /*Método que retorna o tamanho da lista.*/
    @Override
    public int tamanho() {
        return this.tamanho;
    
    }

    /*Método que verifica se a posição selecionada é válida, se for, ele percorre a lista junto com um avariável auxiliar até encontrar 
    a posição inserida, então retorna o conteudo da variável auxiliar.*/
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

    /*Método que verifica se a posição selecionada é válida, se for, ele percorre a lista junto com um avariável auxiliar até encontrar 
    a posição inserida, então retorna a posição do dado passado.*/
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

    /*Método que verifica se a posição selecionada é válida, se for, ele percorre a lista junto com um avariável auxiliar até encontrar 
    a posição inserida, então modifica seu valor por outro valor escolhido.*/
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

    /*Método que chama outros métodos para inserir um valor na lista.*/
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

    /*Cria novoNo e faz ele receber um valor escolhido, então, faz novoNo apontar para quem a cabeça estava apontando, faz a 
    cabeça apontar para novoNo, desse modo, inserindo novoNo no inicio da lista e aumentando seu tamanho.*/
    private boolean insereInicioLista(int valor){
        No novoNo = new No();

        novoNo.setConteudo(valor);
        novoNo.setProximo(this.cabeca);
        this.cabeca = novoNo;
        this.tamanho++;
        return true;
    }

    /*Cria novoNo e faz ele receber um valor escolhido, cria um No auxiliar que recebe a cabeça, então, percorre a lista até achar a
    posição anterior a escolhida, assim, faz novoNo apontar para a posição escolhida e faz o No auxiliar apontar para novoNo, desse modo, 
    inserindo novoNo no meio da lista e aumentando seu tamanho.*/
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

    /*Cria novoNo e faz ele receber um valor escolhido, cria um No auxiliar que percorre a lista até achar a
    posição que aponta para null, então, faz o No auxiliar apontar para novoNo e faz novoNo apontar para null, desse modo, 
    inserindo novoNo no fim da lista e aumentando seu tamanho.*/
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

    /*Método que chama outros métodos para remover um valor da lista.*/
    @Override
    public int remove(int pos) {
        if(vazia()) return -1;

        if(pos == 1){
            return removeInicioLista();
        } else {
            return removeNaLista(pos);
        }
    }

    /*Cria o No p que recebe o valor do primeiro elemento da lista, então, faz a cabeça apontar para o segundo elemento da lista e passa 
     null para p, removendo ele da lista e retornando o valor do elemento da primeira posição*/
    private int removeInicioLista(){
        No p = this.cabeca;
        int dado = p.getConteudo();

        cabeca = p.getProximo();
        this.tamanho--;

        p = null;
        return dado;
    }

    /*Cria os Nos atual e antecessor que recebem null, então, faz a cabeça apontar para atual, percorre a lista
    sempre fazendo o No anterior apontar para o seu antecessor, quando acha o elemento selecionado faz a variável dado receber o seu valor
    e faz o No anterior apontar para o No depois do atual removendo ele da lista e retornando o valor do elemento removido*/
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


