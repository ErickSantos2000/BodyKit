public class ColorShop {
    public void pintura(Carro carro, String novaCor) {
        String corAnterior = carro.getCor();
        carro.setCor(novaCor);
        System.out.println("Cor trocada de " + corAnterior + " para " + novaCor);
    }

    public void colocarNeon(Carro carro, int neon) {
        switch (neon) {
            case 1:
                carro.setNeon("Azul");
                System.out.println("Neon azul instalado!");
                break;

            case 2:
                carro.setNeon("Vermelho");
                System.out.println("Neon vermelho instalado!");
                break;

            case 3:
                carro.setNeon("Amarelo");
                System.out.println("Neon amarelo instalado!");
                break;

            default:
                System.out.println("Aerofólio não instalado.");
        }
    }

    public void colocarAdesivo(Carro carro, int tipo) {
        switch (tipo) {
            case 1:
                carro.setAdesivo("Faixa Esportiva");
                System.out.println("Adesivo 'Faixa Esportiva' aplicado!");
                break;
            case 2:
                carro.setAdesivo("Chamas");
                System.out.println("Adesivo 'Chamas' aplicado!");
                break;
            case 3:
                carro.setAdesivo("Logo Personalizado");
                System.out.println("Adesivo 'Logo Personalizado' aplicado!");
                break;
            default:
                System.out.println("Adesivo não aplicado.");
        }
    }
}