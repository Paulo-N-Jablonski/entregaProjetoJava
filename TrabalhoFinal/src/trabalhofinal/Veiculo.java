/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

public class Veiculo {
    
    String marca;
    String modelo;
    short ano;
    String cor;
    String placa;
    Agendamento agendamento;
    
    public Veiculo(String marca, String modelo, short ano, String cor, String placa, Agendamento  agendamento){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.agendamento = agendamento;
    }
}
