public class ColorShop {
    public void pintura(Carro carro, int novaCor) {
        switch (novaCor) {
            case 1:
                carro.setCor("Prata");
                System.out.println("Carro pintado de prata instalado!");
                break;

            case 2:
                carro.setCor("Vermelho");
                System.out.println("Carro pintado de vermelho instalado!");
                break;

            case 3:
                carro.setCor("Preto");
                System.out.println("Carro pintado de preto instalado!");
                break;

            default:
                System.out.println("Carro não pintado.");
        }
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
                carro.setNeon("Branco");
                System.out.println("Neon branco instalado!");
                break;

            default:
                System.out.println("Neon não instalado.");
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

    public void exbirVisual(Carro carro){
        System.out.println("Adesivo: " + carro.getAdesivo());
        System.out.println("Pintura: " + carro.getCor());
        System.out.println("Neon: " + carro.getNeon());
    }
}