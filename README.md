# Abstração de um banco digital para aplicação de orientação a objetos.

De acordo com o o conhecimento adquirido, foram feitas as seguintes ponderações no projeto proposto:
A biblioteca lombok para ocultar getters e setters;
Na classe pai das contas foi adcionado o atributo "tipo" para tipo de conta. Cada objeto filho de conta tem no seu construtor a responsabilidade de definir o valor para 
tipo de conta;
Foi tirada da classe Conta a responsabilidade de imprimir o extrato. Foi passada a responsabilidade para a classe Banco que recebe uma lista de contas. Dessa forma tem-se 
o método imprimirExtrato que recebe como parâmetro um titular da conta. Nesse método foi feito um stream na lista de contas e aplicado um filtro para buscar as contas de 
acordo com o titular informado;
Foi criado o objeto ContaAplicacao que extend de Conta;
Na classe conta foi criado o método abastrato gerarRendimento e as contas Poupanca e ContaAplicacao fazem a implementação desse método com as respectivas taxas de remuneração 
saldo.


Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário: 
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência 
(entre contas da própria instituição).”

Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de 
entidades existentes no domínio em questão.

Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente 
dois aspectos de um sistema: a manutenção e a evolução.

Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de 
classe base. A classe que herda os membros da classe base é chamada de classe derivada.

Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma 
classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode 
mudar é a maneira como nos referimos a ele.
