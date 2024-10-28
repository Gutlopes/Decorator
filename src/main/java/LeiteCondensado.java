public class LeiteCondensado extends BaseDecorator {
    private Tamanho tamanho;

    public LeiteCondensado(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        double custoLeiteCondensado = 0;
        switch (tamanho) {
            case PEQUENO: custoLeiteCondensado = 1.50; break;
            case MEDIO: custoLeiteCondensado = 2.00; break;
            case GRANDE: custoLeiteCondensado = 2.50; break;
        }
        return wrappee.custo() + custoLeiteCondensado;
    }
}
