/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class EquipVisao {
    
    public static void exibirFormularioCadastrioEquipamento(){
        Scanner entrada = new Scanner(System.in);
        String nome, patrimonio;
        float valor;
        Date dataAq, dataGarantia;
        System.out.println(" Tela de Equipamento ");
        System.out.println("Informe o nome: ");
        nome = entrada.nextLine();     
        System.out.println("Informe o n do patrimonio: ");
        patrimonio = entrada.nextLine();
        System.out.println("Informe a data de aquisição: ");
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        do{
            try{
                dataAq = formatadorData.parse(entrada.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Erro na data");
            }
        }while(true);
        System.out.println("Informe a data do termino da garantia: ");
        do{
            try{
                dataGarantia = formatadorData.parse(entrada.nextLine());
                if(dataGarantia.after(dataAq)){
                    break;
                }
            }catch(Exception e){
                System.out.println("Erro na data");
            }
        }while(true);
        System.out.println("Informe o valor: ");
        do{
            try{
                valor = Float.parseFloat(entrada.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Valor Inválido!!Digite Novamente");
            }
        }while(true);
        
    }
}
