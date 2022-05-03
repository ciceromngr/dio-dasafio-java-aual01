package one.digitalinovation.basecamp;

class Emprestimos {

    public Double valor;
    public Integer parcelas;

    private static final Double VALOR_JUROS = 3.4;

    private Double calcularTaxaParcelas() {
        double result = this.valor + (this.parcelas * VALOR_JUROS);
        return result;
    }

    public void calcular(double valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;
        double result = calcularTaxaParcelas();
        System.out.println("O valor final do emprestimo com "+ parcelas +" parcleas R$: "+ result);
        System.out.printf("Valor dos juros: %.2f %n", (parcelas * VALOR_JUROS));
        System.out.printf("Valor das parcelas: %.2f %n", valorParcelasMes());
    }

    public double valorParcelasMes() {
        double result = (this.valor + (this.parcelas * VALOR_JUROS)) / this.parcelas;
        return result;
    }

}
