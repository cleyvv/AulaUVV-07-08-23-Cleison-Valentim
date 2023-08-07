/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacionamentocarro;

/**
 *
 * @author alunodev08
 */
public class Carro {
     private int ano;
    private String marca;
    private Modelo modelo; // Referência para a classe Modelo
    private String cor;
    private String placa;

    // Construtor da classe Carro
    public Carro(int ano, String marca, Modelo modelo, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo; // Atribuição do modelo recebido como parâmetro
        this.cor = cor;
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
