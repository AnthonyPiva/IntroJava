/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Armazenamento.MeioArmazenamento;
import java.util.ArrayList;
import java.util.Date;
import modelo.Equip;
import modelo.EquipDao;
import modelo.Manutencao;

public class EquipControle {
    
    public static void recebeFormularioCadastroEquipamento(String nome, String patrimonio, Date dataAq, Date dataGarantia, float Valor){
        Equip a = new Equip();
        a.setNome(nome);
        a.setPatrimonio(patrimonio);
        a.setDataAq(dataAq);
        a.setDataGarantia(dataGarantia);
        a.setValor(Valor);
        EquipDao.Salvar(a);
    }
    
    public static ArrayList<Equip> ObterLista(){
        return EquipDao.ObterLista();
    }
    
    public static Equip ObterEquipPeloNPatrimonio(String patrimonio){
        return EquipDao.ObteEquipPeloNPatrimonio(patrimonio);
    }
    
    public static void receberNovaManutencao(String patrimonio, String descricao, Date data, float valor){
        Equip encontrado = EquipDao.ObteEquipPeloNPatrimonio(patrimonio);
        Manutencao novaManu = new Manutencao();
        novaManu.setData(data);
        novaManu.setDescricao(descricao);
        novaManu.setValor(valor);
        encontrado.adicionaManutencao(novaManu);
    }  
}
