/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoreAndTimer;

/**
 *
 * @author mgonzaloluna
 */
public class Timer {
    private int [] relojContador;
    public Timer(int [] relojContador){
        this.relojContador = relojContador;
    }
    
    // ms = relojContador[2]
    // s  = relojContador[1]
    // m  = relojContador[0]
    private String ms,s,m;
    
    public String Contador(){
        if (relojContador[2] >= 60){
            relojContador[1]++;
            relojContador[2] = 0;
            if (relojContador[1] >= 60){
                relojContador[1] = 0;
                relojContador[0]++;
            }
        }
        relojContador[2]++;
        if (relojContador[2] < 10){
            ms = ("0"+relojContador[2]);
        }
        else {
            ms = (""+relojContador[2]);
        }
        if (relojContador[1] < 10){
            s = ("0"+relojContador[1]);
        }
        else {
            s = (""+relojContador[1]);
        }
        if (relojContador[0] < 10){
            m = ("0"+relojContador[0]);
        }
        else {
            m = (""+relojContador[0]);
        }
        return (m+":"+s+":"+ms);
    }   
    
}
