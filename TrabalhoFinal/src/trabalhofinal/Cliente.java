/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

public class Cliente {
    
    String nome;
    String sobrenome;
    String sexo;
    int telefone;
    String dataNascimento;
    String endereco;
    public Veiculo veiculo;
    public Assinatura assinatura;
    public Agendamento agendamento;

    
    public Cliente(){
        this.nome = "";
        this.sobrenome = "";
        this.sexo = "";
        this.telefone = 0;
        this.dataNascimento = "";
        this.endereco = "";
        this.veiculo = null;
        this.assinatura = null;
        this.agendamento = null;
    }
    
    public Cliente(String nome, String sobrenome, String sexo, int telefone, String dataNascimento, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.veiculo = null;
        this.assinatura = null;
        this.agendamento = null;
    }
    
    public String getNome(){
        return this.nome;
    }    
    public String getSobrenome(){
        return this.sobrenome;
    }    
    public String getSexo(){
        return this.sexo;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    public Assinatura getAssinatura(){
        return this.assinatura;
    }
    public Agendamento getAgendamento(){
        return this.agendamento;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    public void setAssinatura(Assinatura assinaPagamento){
        this.assinatura = assinaPagamento;
    }
    public void setAgendamento(Agendamento agendamento){
        this.agendamento = agendamento;
    }
    
    public String mostrarDados(){
        return ("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nVeiculo: " + veiculo.modelo + "\nPlano: " + assinatura.nome);
    }
    
    public String mostrarAgendamentos(){
        return ("Data: " + agendamento.data + "\nHorário: " + agendamento.horario);
    }
}
