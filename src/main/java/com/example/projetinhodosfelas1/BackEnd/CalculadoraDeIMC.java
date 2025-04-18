package com.example.projetinhodosfelas1.BackEnd;

public class CalculadoraDeIMC {
   // private boolean sexo;
    private float peso,altura;


    public CalculadoraDeIMC(){} //Precisa ter um construtor vazio para preencher o formulario

    public CalculadoraDeIMC(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        if (altura > 0) {
            double respImc = peso / (altura * altura);
            return respImc;
        } else {
            return 0; // Evita divisão por zero
        }
    }

    public String statusIMC(){
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc <= 24.9) return "Peso normal";
        else if (imc <= 29.9) return "Sobrepeso";
        else if (imc <= 34.9) return "Obesidade grau 1";
        else if (imc <= 39.9) return "Obesidade grau 2";
        else {return "Obesidade grau 3";
        }
    }

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}

    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}


}