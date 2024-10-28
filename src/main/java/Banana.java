public class Banana extends BaseDecorator {
    private Tamanho tamanho;

    public Banana(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        double custoBanana = 0;
        switch (tamanho) {
            case PEQUENO: custoBanana = 0.80; break;
            case MEDIO: custoBanana = 1.20; break;
            case GRANDE: custoBanana = 1.70; break;
        }
        return wrappee.custo() + custoBanana;
    }
}