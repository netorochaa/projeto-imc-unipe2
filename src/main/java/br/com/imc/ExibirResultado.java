package br.com.imc;

public class ExibirResultado
{
    public static void main( String[] args )
    {
		double peso = 60;
		double altura = 150;
		Imc imc = new Imc();
		double resultado = imc.calcularImc(peso, altura);
        System.out.println( resultado );
    }
}
