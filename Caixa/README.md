# 💵 Projeto: Caixa Eletrônico 

Nas primeiras aulas práticas de LPOO fomos desafiados a criar uma simulação de um caixa eletrônico, que possibilita o usuário criar uma conta no banco, depositar um valor inicial, sacar o dinheiro (com limite de saques) e checar extrato.

A classe **`Conta`** é responsável pela implementação das funcionalidades de uma conta bancária, tais como consultar extrato, sacar e depositar dinheiro. A classe possui um construtor que recebe os dados iniciais da conta (nome do cliente, número da conta e saldo inicial) e inicializa as variáveis correspondentes. Além disso, a classe possui métodos para exibir o extrato da conta, sacar dinheiro, depositar dinheiro e iniciar o menu de operações.

A seguir, temos uma breve descrição de cada método da classe:

- **`Conta(String nome, int conta, double saldo_inicial)`**: construtor da classe que recebe os dados iniciais da conta e inicializa as variáveis correspondentes.
- **`public void extrato(double valor)`**: exibe na tela o extrato da conta, mostrando o nome do cliente, número da conta, saldo atual e quantidade de saques realizados no dia.
- **`public void sacar(double valor)`**: permite sacar dinheiro da conta, desde que o saldo seja suficiente e a quantidade de saques diários ainda não tenha sido atingida. Se o saque for bem-sucedido, a quantidade de saques realizados no dia é incrementada.
- **`public void depositar(double valor)`**: permite depositar dinheiro na conta.
- **`public void iniciar()`**: inicia o menu de operações da conta.
- **`public void exibeMenu()`**: exibe na tela as opções do menu de operações da conta.
- **`public void escolheOpcao(int opcao)`**: recebe a opção escolhida pelo usuário no menu de operações e chama o método correspondente (exibir extrato, sacar dinheiro ou depositar dinheiro).

No geral, a classe **`Conta`** implementa as funcionalidades básicas de uma conta bancária, permitindo ao usuário realizar operações de consulta, saque e depósito de dinheiro. Claro, esta implementação é básica e há muitas outras funcionalidades que podem ser adicionadas a uma conta bancária, mas este código serve como um bom exemplo introdutório.

