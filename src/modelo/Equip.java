/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import Armazenamento.MeioArmazenamento;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 5725089
 */
public class Equip {
    private String nome, patrimonio;
    private Date dataAq, dataGarantia;
    private float Valor;
    private ArrayList<Manutencao> listaManutencao;
    
    public Equip(){
        this.listaManutencao = new ArrayList<>();
    }
    

    
    public float getTotalGastoManutencoes(){
        float total = 0;
        for(Manutencao atual : this.listaManutencao){
            total += atual.getValor();
        }
        return total;
    }
    public void adicionaManutencao(Manutencao manutencao){
        this.listaManutencao.add(manutencao);
    }
    public ArrayList<Manutencao> getListaManutencoes(){
        return listaManutencao;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome O nome para atribuir ao equipamento
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the patrimonio
     */
    public String getPatrimonio() {
        return patrimonio;
    }

    /**
     * @param patrimonio the patrimonio to set
     */
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    /**
     * @return the dataAq
     */
    public Date getDataAq() {
        return dataAq;
    }

    /**
     * @param dataAq the dataAq to set
     */
    public void setDataAq(Date dataAq) {
        this.dataAq = dataAq;
    }

    /**
     * @return the dataGarantia
     */
    public Date getDataGarantia() {
        return dataGarantia;
    }

    /**
     * @param dataGarantia the dataGarantia to set
     */
    public void setDataGarantia(Date dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    /**
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
}
