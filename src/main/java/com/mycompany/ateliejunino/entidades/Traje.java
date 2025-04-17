package com.mycompany.ateliejunino.entidades;

public class Traje {
    private int id;
    private String descricao;
    private double valor;
    private int numeroTraje;

    // Construtor padrão
    public Traje() {}

    // Construtor com parâmetros
    public Traje(int numeroTraje, double valor, String descricao) {
        this.numeroTraje = numeroTraje;
        this.valor = valor;
        this.descricao = descricao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumeroTraje() {
        return numeroTraje;
    }

    public void setNumeroTraje(int numeroTraje) {
        this.numeroTraje = numeroTraje;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
