public class TestaDecorator {
    public static void main(String[] args) {
        // Açaí simples, tamanho médio
        Adicional acaiSimples = new Acai(Tamanho.MEDIO);
        System.out.println(acaiSimples.getDescricao() + " custa R$ " + acaiSimples.custo());

        // Açaí com Morango, tamanho médio
        Adicional acaiComMorango = new Morango(acaiSimples, Tamanho.MEDIO);
        System.out.println(acaiComMorango.getDescricao() + " custa R$ " + acaiComMorango.custo());

        // Açaí com Morango, Leite Condensado e Banana, tamanho grande
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE);
        System.out.println(acaiCompleto.getDescricao() + " custa R$ " + acaiCompleto.custo());
    }
}