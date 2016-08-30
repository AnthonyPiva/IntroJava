/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Armazenamento.MeioArmazenamento;
import controle.EquipControle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import modelo.Equip;


public class EquipVisao {
    
    public static void exibirFormularioCadastrioEquipamento(){
        Scanner entrada = new Scanner(System.in);
        String nome, patrimonio;
        float valor;
        Date dataAq, dataGarantia;
        System.out.println(" Tela de Equipamento ");
        System.out.println("Numero de Equipamentos: "+MeioArmazenamento.equipamentos.size());
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
        
        EquipControle.recebeFormularioCadastroEquipamento(nome, patrimonio, dataAq, dataGarantia, valor);
        Menu.ExibirMenu();
    }
    
    public static void ExibirListaEquipamentos(){
        System.out.println("Lista de Equipamentos");
        System.out.println("Nome \t Numero do Patrimonio \t Numero de Manutenções");
//        ArrayList<Equip> lista = EquipControle.ObterLista();
//        for(int i=0;i < lista.size(); i++){
//            System.out.println(lista.get(i).getNome()+"\t "+lista.get(i).getDataAq());
//        }
        for(Equip obj : EquipControle.ObterLista()){
            System.out.println(obj.getNome()+"\t "+obj.getDataAq()+"\t "+obj.getListaManutencoes().size());
        }
        System.out.println("O Que Deseja Fazer?");
        System.out.println("0) Voltar ao menu");
        System.out.println("Numero do patrimonio para cadastrar manutenção");
        Scanner entrada = new Scanner(System.in);
        String valorDigitado = entrada.nextLine();
        if(entrada.equals("0")){
            Menu.ExibirMenu();
        }else{
            Equip encontrado = EquipControle.ObterEquipPeloNPatrimonio(valorDigitado);
            if (encontrado == null){
                System.out.println("Erro: Equipamento Não Encontrado");
                Menu.ExibirMenu();
            }else{
                
            }
        }
    }
}
