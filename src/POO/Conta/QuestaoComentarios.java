package POO.Conta;

public class QuestaoComentarios {
    
    /*
========================================
    PROJETO 01 - SISTEMA BANCÁRIO v1
========================================

DESCRIÇÃO DO PROBLEMA:

Desenvolva um sistema bancário simples utilizando Programação Orientada a Objetos.

O sistema deve permitir:

1) Cadastro de Cliente
   - Nome
   - CPF (11 dígitos)
   - Email (deve conter "@" e ".")
   - Senha (mínimo 8 caracteres)

2) Criação de Conta Corrente
   - Saldo inicial padrão: 1000
   - Conta pode ser especial
   - Limite padrão: 2000

3) Funcionalidades da Conta
   - Mostrar saldo
   - Depositar valor (maior que 0)
   - Sacar valor (respeitando saldo e limite)
   - Verificar se está usando cheque especial
   - Mostrar informações da conta

4) Menu interativo
   - Sistema deve rodar até o usuário escolher sair
   - Utilizar estrutura de repetição
   - Validar opções inválidas

----------------------------------------

REGRAS IMPORTANTES:

- Utilizar encapsulamento (atributos privados)
- Utilizar métodos para cada operação
- Separar classe ClienteConta e ContaCorrente
- Utilizar associação (ContaCorrente tem um ClienteConta)
- Utilizar validação com while
- Utilizar Scanner para interação

----------------------------------------

OBJETIVO DO PROJETO:

Treinar:
- POO
- Encapsulamento
- Associação entre classes
- Estruturas de repetição
- Validação de dados
- Organização de código
- Lógica de negócio bancária básica

----------------------------------------

DOCUMENTAÇÃO PESSOAL (PREENCHER APÓS CONCLUIR):

O que essa versão do sistema faz?
→

O que eu aprendi com esse projeto?
→

Quais dificuldades tive?
→

O que posso melhorar na próxima versão?
→

========================================
VERSÃO: 1.0
STATUS: CONCLUÍDO / EM ANDAMENTO
========================================
*/
    
    
/*
=============================
    DESAFIOS - SISTEMA BANCO
=============================

MISSÃO 1 - LOGIN COM TENTATIVAS

Objetivo:
- Antes de acessar o menu, exigir CPF e senha.
- Permitir no máximo 3 tentativas.
- Se errar 3 vezes, encerrar o sistema.

Regras:
- Comparar CPF digitado com o CPF do cliente.
- Comparar senha digitada com a senha cadastrada.
- Usar contador de tentativas.
- Se tentativas == 3 → bloquear acesso.


----------------------------------

MISSÃO 2 - BLOQUEIO DE CONTA

Objetivo:
- Criar atributo: boolean contaBloqueada.
- Se errar login 3 vezes, contaBloqueada = true.

Regras:
- Se contaBloqueada == true:
    - Não pode sacar.
    - Não pode depositar.
    - Não pode transferir.
- Mostrar mensagem: "Conta bloqueada."


----------------------------------

MISSÃO 3 - HISTÓRICO DE OPERAÇÕES

Objetivo:
- Criar atributo:
    private ArrayList<String> historico;

Regras:
- Toda vez que:
    - Depositar
    - Sacar
    - Transferir
  Adicionar descrição no histórico.

Criar método:
- mostrarHistorico()

----------------------------------

MISSÃO 4 - TRANSFERÊNCIA ENTRE CONTAS

Criar método:
- transferir(double valor, ContaCorrente destino)

Regras:
- Valor > 0
- Não pode ultrapassar limite
- Debita da conta atual
- Credita na conta destino
- Registrar no histórico

----------------------------------

MISSÃO 5 - CLIENTE COM MÚLTIPLAS CONTAS

Objetivo:
- Cliente pode ter mais de uma conta.
- Criar:
    private ArrayList<ContaCorrente> contas;

Regras:
- Permitir adicionar contas ao cliente.
- Permitir escolher qual conta usar no menu.

----------------------------------

MISSÃO 6 - MELHORAR ARQUITETURA

Objetivo:
- Remover Scanner das classes.
- Deixar Scanner apenas na Main.
- Classes devem conter apenas lógica.
- Main controla interação.

----------------------------------

MISSÃO 7 - GERAR NÚMERO DE CONTA AUTOMÁTICO

Objetivo:
- Criar atributo static contador.
- Cada nova conta recebe número automático.
- Ex:
    1001
    1002
    1003

----------------------------------

NÍVEL AVANÇADO:

- Criar conta Poupança.
- Criar herança: Conta → ContaCorrente e ContaPoupanca.
- Usar polimorfismo.
- Aplicar juros na poupança.
- Criar sistema de menu mais organizado.
- Implementar limite diário de saque.

=================================
OBJETIVO FINAL:
Criar um mini sistema bancário estruturado,
com login, histórico, múltiplas contas e herança.
=================================
*/    
    
 
}
