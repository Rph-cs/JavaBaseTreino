package POO.Conta;

import java.util.Scanner;

public class ClienteConta {
    
    Scanner scanner = new Scanner(System.in);
    
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    
    protected ClienteConta() {
        cadastrarNome();
        cadastrarCpf();
        cadastrarEmail();
        cadastrarSenha();
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    protected void cadastrarNome() {
        boolean nomeValido = false;
        
        while (!nomeValido) {
            System.out.println("Informe o seu nome para o cadastro: ");
            nome = scanner.nextLine();
            
            if(nome != null && !nome.isEmpty()) {
                System.out.println("Nome cadastrado com sucesso.");
                nomeValido = true;
            } else {
                System.out.println("Nome informado é inválido.");
            }
        }
    }
    
    protected void cadastrarCpf() {
        boolean cpfValido = false;
        
        while (!cpfValido) {
            System.out.println("Informe o seu CPF para o cadastro: ");
            cpf = scanner.nextLine();
            
            if(cpf != null && cpf.length() == 11) {
                System.out.println("CPF cadastrado com sucesso.");
                cpfValido = true;
            } else {
                System.out.println("CPF informado é inválido.");
            }
        }
    }
    
    protected void cadastrarEmail() {
        boolean emailvalido = false;
        
        while (!emailvalido) {
            System.out.println("Informe um email para ser cadastrado: ");
            email = scanner.nextLine();
            
            if(email != null && email.contains("@") && email.contains(".")) {
                System.out.println("Email cadastrado com sucesso.");
                emailvalido = true;
            } else {
                System.out.println("Email informado é inválido.");
            }
        }
    }
    
    protected void cadastrarSenha() {
        boolean senhaValida = false;
        
        while (!senhaValida) {
            System.out.println("Informe uma senha para o cadastro(deve conter no mínimo 8 caracteres): ");
            senha = scanner.nextLine();
            
            if(senha != null && !senha.isEmpty() && senha.length() >= 8) {
                System.out.println("Senha cadastrada com sucesso.");
                senhaValida = true;
            } else {
                System.out.println("Senha informada é inválida.");
            }
        }
    }

    protected void mostrarInformacoes() {
        System.out.println("Informe sua senha para visualizar as informações da conta: ");
        String tentativaDeSenha = scanner.nextLine();
        
        if(tentativaDeSenha.equals(senha)) {
            System.out.println("Senha válida, acesso liberado: ");
            
            System.out.println("Suas informações: ");
            System.out.println("Nome: "+ nome);
            System.out.println("CPF: "+ cpf);
            System.out.println("Email: "+ email);
        } else {
            System.out.println("Senha inválida.");
        }

    }
    
    
}
