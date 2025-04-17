package com.mycompany.ateliejunino.entidades;
import java.time.LocalDate;

public class Aluguel {
    private int id;
    private String observacao;
    private double valor;
    private double adiantamento;
    private double restante;
    private int numeroTraje;
    private LocalDate dataQuadrilha;
    private LocalDate dataReserva;
    private LocalDate dataDevolucao;
    private String acompanhamentos;
    private String escola;
    private String atendente;

    public Aluguel() {}

    public Aluguel(int id, String observacao, String acompanhamentos, String atendente, String escola,
                   LocalDate dataQuadrilha, LocalDate dataReserva, LocalDate dataDevolucao,
                   int numeroTraje, double valor, double adiantamento, double restante) {
        this.id = id;
        this.observacao = observacao;
        this.acompanhamentos = acompanhamentos;
        this.atendente = atendente;
        this.escola = escola;
        this.dataQuadrilha = dataQuadrilha;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
        this.numeroTraje = numeroTraje;
        this.valor = valor;
        this.adiantamento = adiantamento;
        this.restante = restante;
    }

    // Getters e Setters certinhos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public double getAdiantamento() { return adiantamento; }
    public void setAdiantamento(double adiantamento) { this.adiantamento = adiantamento; }

    public double getRestante() { return restante; }
    public void setRestante(double restante) { this.restante = restante; }

    public int getNumeroTraje() { return numeroTraje; }
    public void setNumeroTraje(int numeroTraje) { this.numeroTraje = numeroTraje; }

    public LocalDate getDataQuadrilha() { return dataQuadrilha; }
    public void setDataQuadrilha(LocalDate dataQuadrilha) { this.dataQuadrilha = dataQuadrilha; }

    public LocalDate getDataReserva() { return dataReserva; }
    public void setDataReserva(LocalDate dataReserva) { this.dataReserva = dataReserva; }

    public LocalDate getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(LocalDate dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    public String getAcompanhamentos() { return acompanhamentos; }
    public void setAcompanhamentos(String acompanhamentos) { this.acompanhamentos = acompanhamentos; }

    public String getEscola() { return escola; }
    public void setEscola(String escola) { this.escola = escola; }

    public String getAtendente() { return atendente; }
    public void setAtendente(String atendente) { this.atendente = atendente; }
}
