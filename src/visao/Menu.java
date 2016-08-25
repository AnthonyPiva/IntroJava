/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.Scanner;

public class Menu {
    public static void ExibirMenu(){
        int op = 0;
        System.out.println(" ---- Menu ---- ");
        System.out.println("Selecionar opção");
        System.out.println("1) Cadastrar Equip");
        System.out.println("2) Listar");
        Scanner entrada = new Scanner(System.in);
        do{
            try{
                op = Integer.parseInt(entrada.nextLine());
                System.out.println("User typed "+op);
            }catch(Exception e){
                System.out.println("Error 404"+e.getMessage());
            }
        }while(op != 1 && op != 2);
        if(op==1){
            EquipVisao.exibirFormularioCadastrioEquipamento();
        }
    }
}
