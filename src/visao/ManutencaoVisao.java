/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.EquipControle;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author 5725089
 */
public class ManutencaoVisao {
    
    public static void exibirFormularioCadastroManutencao(String patrimonio){
        Scanner entrada = new Scanner( System.in );
        System.out.println("==== TELA DE CADASTRO DE MANUTENÇÃO DO EQUIPAMENTO "+patrimonio+" ====");
        String descricao;
        Date data;
        float valor;
                
        System.out.println("Informe a descrição: ");
        descricao = entrada.nextLine();
        System.out.println("Informe a data: ");
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        do{
            try{
                data = formatadorData.parse(entrada.nextLine());
                break;
            }catch(Exception  e){
                System.out.println("Data inválida!!! Digite novamente!");
            }
        }while(true);
        System.out.println("Informe o valor: ");
        do{
            try{
                valor = Float.parseFloat(entrada.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Valor inválido!!! Digite novamente!");
            }
            
        }while(true);
        
        
        
        EquipControle.receberNovaManutencao(patrimonio, descricao, data, valor);
        }
    
}
