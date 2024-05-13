classDiagram
    class Workshop {
        Tema: "Pilha/Fila"
    }
    class TeoriaDados {
        Conteudo: "Introdução aos Dados\nTipos de Dados\nEstruturas de Dados\nOrganização dos Dados"
    }
    class Pilha {
        Funcionamento: "Último a entrar, primeiro a sair (LIFO)"
        Aplicacao: "Exemplo: Digitação de caracteres"
    }
    class Fila {
        Funcionamento: "Primeiro a entrar, primeiro a sair (FIFO)"
        Aplicacao: "Exemplo: Reserva de passagens de avião"
    }

    Workshop --> TeoriaDados
    Workshop --> Pilha
    Workshop --> Fila
