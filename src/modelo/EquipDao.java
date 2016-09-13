/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author 5725089
 */
public class EquipDao {
    
    public static ArrayList<Equip> ObterLista(){
        ArrayList<Equip> retorno = new ArrayList<>();
        try{
            Path leotxt = Paths.get("Equipamentos.txt");
            for(String linha : Files.readAllLines(leotxt)){
                String[] dados = linha.split(";");
                Equip obj = new Equip();
                //Date agora = new Date();
                SimpleDateFormat formatadorData = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
                //System.out.println(formatadorData.format(agora));
                obj.setNome(dados[0]);
                obj.setPatrimonio(dados[1]);
                obj.setDataAq(formatadorData.parse(dados[2]));
                obj.setDataGarantia(formatadorData.parse(dados[3]));
                obj.setValor(Float.parseFloat(dados[4]));
                retorno.add(obj);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return retorno;
    }
    public static void Salvar(Equip Savethis){
        try{
            Path caminho = Paths.get("Equipamentos.txt");
            String equipamento = Savethis.getNome()+";"+Savethis.getPatrimonio()+";"+Savethis.getDataAq().toString()+";"+Savethis.getDataGarantia().toString()+";"+Savethis.getValor()+"\r\n";
            Files.write(caminho, equipamento.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Equip ObteEquipPeloNPatrimonio(String patrimonio){
        for(Equip obj : ObterLista()){
            if(obj.getPatrimonio().equals(patrimonio)){
                return obj;
            }
        }return null;
    }
    
}
