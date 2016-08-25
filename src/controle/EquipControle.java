/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Date;
import modelo.Equip;

public class EquipControle {
    
    public static void recebeFormularioCadastroEquipamento(String nome, String patrimonio, Date dataAq, Date dataGarantia, float Valor){
        Equip a = new Equip();
        a.setNome(nome);
        a.setPatrimonio(patrimonio);
        a.setDataAq(dataAq);
        a.setDataGarantia(dataGarantia);
        a.setValor(Valor);
        a.Salvar();
    }
    
}
