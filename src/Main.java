
public class Main {
    public static void main(String[] args) {
       // Pessoa p = new Pessoa("Erick", 24);
       // p.falar();

        Carro c = new Carro("Nissan", "Skyline GTR R34", 2002, "Azul");
        c.exibir();
        c.setBodyShop(1, 2, 1, 3);

        c.acelerar(5);
        c.aero();
        c.parar();
        c.setTrocarCor("Branco");
        c.exibir();



    }
}