
public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    private int velocidade;
    private String aeroFolio;
    private String bodyKit;
    private String rodas;
    private String capo;

    public Carro(String fabricante, String modelo, int ano, String cor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        velocidade = 0;
        this.aeroFolio = "Padrão de fabrica";
        this.bodyKit = "Padrão de fabrica";
        this.rodas = "Padrão de fabrica";
        this.capo = "Padrão de fabrica";
    }

    int tenta1 = 0;
    int tenta2 = 0;
    int tenta3 = 0;
    int tenta4 = 0;
    int aerodinamica = 0;
    int atual = 0;

    public int geVelocidade(){
        return velocidade;
    }

    public void acelerar(int valor){
        int vezes = 0;
        int inteira = tenta1 + tenta2 + tenta3 + tenta4;
        valor += inteira;
        while (vezes < valor){
            vezes++;
            velocidade += 10;

            System.out.println("Acelerando..." + velocidade + "Kmh");
        }
        aerodinamica = velocidade;
        inteira *= 10;
        atual = aerodinamica - inteira;

    }

    public void parar(){
        while (velocidade >= 0){
            System.out.println("Parando..." + velocidade + "Kmh");
            velocidade -= 10;
        }
        velocidade = 0;
        System.out.println("Carro parado.");
    }



    public void setTrocarCor(String novaCor){
        String corAnterior = cor;
        this.cor = novaCor;
        System.out.println("Trocando de " + corAnterior + " para " + cor);
    }

    public void exibir(){
        System.out.println("\nFabricante: " + fabricante + "\nModelo: "+ modelo + "\nAno de lançamento: "+ ano + "\nCor: " + cor + "\n");
    }

    public void setBodyShop(int aeroFolio, int bodyKit, int rodas, int capo) {
        switch (aeroFolio) {
            case 1:
                this.aeroFolio = "Aerofólio Fixo";
                tenta1 = 1;
                System.out.println("Aerofólio Fixo instalado!");
                break;
            case 2:
                this.aeroFolio = "Aerofólio Ativo";
                tenta1 = 2;
                System.out.println("Aerofólio Ativo instalado!");
                break;
            case 3:
                this.aeroFolio = "Aerofólio Regulável";
                tenta1 = 3;
                System.out.println("Aerofólio Regulável instalado!");
                break;
            default:
                System.out.println("Aerofólio não instalado.");
        }

        switch (bodyKit) {
            case 1:
                this.bodyKit = "Bodykit Estético";
                tenta2 = 1;
                System.out.println("Bodykit Estético instalado!");
                break;
            case 2:
                this.bodyKit = "Bodykit Aerodinâmico";
                tenta2 = 2;
                System.out.println("Bodykit Aerodinâmico instalado!");
                break;
            case 3:
                this.bodyKit = "Widebody Kit";
                tenta2 = 3;
                System.out.println("Widebody Kit instalado!");
                break;
            default:
                System.out.println("BodyKit não instalado.");
        }

        switch (rodas){
            case 1:
                this.rodas = "Rodas de Liga Leve";
                tenta3 = 1;
                System.out.println("Rodas de Liga Leve instaladas!");
                break;
            case 2:
                this.rodas = "Rodas Esportivas";
                tenta3 = 2;
                System.out.println("Rodas Esportivas instaladas!");
                break;
            case 3:
                this.rodas = "Rodas Off-road";
                tenta3 = 3;
                System.out.println("Rodas Off-road instaladas!");
                break;
            default:
                System.out.println("Roda não instalada.");

        }

        switch (capo){
            case 1:
                this.capo = "Capô de Fibra de Carbono";
                tenta4 = 1;
                System.out.println("Capô de Fibra de Carbono instalado!");
                break;
            case 2:
                this.capo = "Capô Transparente";
                tenta4 = 2;
                System.out.println("Capô Transparente instalado!");
                break;
            case 3:
                this.capo = "Capô com Tomada de Ar";
                tenta4 = 3;
                System.out.println("Capô com Tomada de Ar instalado!");
                break;
            default:
                System.out.println("Capo não instalado.");
        }

        System.out.println("\n----Carroceria----");
        System.out.println(this.bodyKit);
        System.out.println(this.aeroFolio);
        System.out.println(this.rodas);
        System.out.println(this.capo);
        System.out.println();
    }

    public void aero() {
        System.out.println();
        System.out.println("A aerodinâmica aumentou a velocidade de " + atual + "Kmh para " + aerodinamica + "Kmh");
        System.out.println();

    }

}
