package one.digitalinovation.basecamp;

public class Main {

    public static void main(String[] args) {
	Calculadora calc = new Calculadora();
	MessageDia message = new MessageDia();
    Emprestimos emprestimos = new Emprestimos();

//    	calc.calcular();
//        message.obterMessagensDia(4);
//        message.obterMessagensDia(12);
//        message.obterMessagensDia(18);

        emprestimos.calcular(2000, 12);
        emprestimos.calcular(4000, 3);
        emprestimos.calcular(10000, 24);
    }
}
