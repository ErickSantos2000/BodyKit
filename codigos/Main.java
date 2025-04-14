public class Main {
    public static void main(String[] args) {

        // construtores
        Carro carro = new Carro("Nissan", "Skyline GTR R34", 2002, "Azul");
        BodyShop oficina = new BodyShop();
        ColorShop pintura = new ColorShop();

        // chamada dos metodos
        pintura.pintura(carro, "Vermelho");
        System.out.println();

        oficina.instalarBodyKit(carro, 1);
        oficina.instalarRodas(carro, 1);
        oficina.instalarCapo(carro, 1);
        oficina.instalarAerofolio(carro, 1);

        System.out.println();

        carro.ligarCarro();
        carro.desligarCarro();

        System.out.println();
        oficina.mostrarCarroceria(carro);
        System.out.println();
        carro.acelerar(2, oficina);
        System.out.println();
        carro.parar();
        System.out.println();
        carro.aero();
        System.out.println();
        carro.exibir();
        System.out.println();

        pintura.colocarNeon(carro, 2);
        pintura.colocarAdesivo(carro, 3);

    }
}