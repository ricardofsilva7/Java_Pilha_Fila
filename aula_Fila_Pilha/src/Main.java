public class Main {
    public static void main(String[] args) {
        fila fila = new fila(5);

        //TESTANDO A FILA

        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia ? " + fila.estaVazia());

        System.out.println("Pirmeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamanho());

        while (!fila.estaVazia()){
            System.out.println("Removendo da fila: " + fila.remover());
        }
        System.out.println("A fila está vazia ? " + fila.estaVazia());

        //TESTANDO A PILHA

        Pilha pilha = new Pilha(5);
        System.out.println(" ");

        System.out.println("Adicionando: " + pilha.empilhar("Fabio"));
        System.out.println("Adicionando: " + pilha.empilhar("Geraldo"));
        System.out.println("Adicionando: " + pilha.empilhar("Helicoptero"));
        System.out.println("Adicionando: " + pilha.empilhar("I-Paje"));


        System.out.println("A pilha está vazia ? " + pilha.estaVazia());

        System.out.println("Pirmeiro elemento da pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha " + fila.tamanho());

        while (!fila.estaVazia()){
            System.out.println("Removendo da pilha: " + pilha.desempilhar());
        }
        System.out.println("A pilha está vazia ? " + pilha.estaVazia());
    }

}