public class Morango extends BaseDecorator {
    private Tamanho tamanho;

    public Morango(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }

    @Override
    public double custo() {
        double custoMorango = 0;
        switch (tamanho) {
            case PEQUENO: custoMorango = 1.00; break;
            case MEDIO: custoMorango = 1.50; break;
            case GRANDE: custoMorango = 2.00; break;
        }
        return wrappee.custo() + custoMorango;
    }
}
