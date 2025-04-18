package com.example.projetinhodosfelas1.BackEnd;

public class CalculadoraDeIMC {
   // private boolean sexo;
    private float peso,altura;
    //private int idade;


    public CalculadoraDeIMC(){} //Precisa ter um construtor vazio para preencher o formulario

    public CalculadoraDeIMC(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        if (altura > 0) {
            double respImc = peso / (altura * altura);
            return respImc;
        } else {
            return 0; // Evita divisão por zero
        }
    }

//    public boolean isSexo() {
//        return sexo;
//    }
//
//    public void setSexo(boolean sexo) {
//        this.sexo = sexo;
//    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

//    public int getIdade() {
//        return idade;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }
}
