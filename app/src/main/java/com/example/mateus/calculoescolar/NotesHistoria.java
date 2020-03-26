package com.example.mateus.calculoescolar;

public class NotesHistoria {

    public float media = 5;
    public float b1, b2, b3, b4 = 0;
    public int totalBimestre = 4;
    public double falta3;
    public float f1,f2,f3,f4 = 0;


    public float addResultFinal(){
        return ( b1 + b2 + b3 + b4) / totalBimestre;
    }

    public double addFalta3() {

        return falta3 = (media * totalBimestre) - (b1 + b2 + b3) ;
    }

    public float addFalta(){
        return  f1 + f2 + f3 + f4;

    }
}
