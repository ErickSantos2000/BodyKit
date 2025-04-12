
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

    // cor set e get
    public String getCor(){
        return cor;
    }
    public void setCor(String color){
        cor = color;
    }

    public String getAeroFolio(){
        return aeroFolio;
    }
    public void setAerofolio(String aeroFolio){
        this.aeroFolio = aeroFolio;
    }

    // Getter e Setter para bodyKit
    public String getBodyKit() {
        return bodyKit;
    }

    public void setBodyKit(String bodyKit) {
        this.bodyKit = bodyKit;
    }

    // Getter e Setter para rodas
    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    // Getter e Setter para capo
    public String getCapo() {
        return capo;
    }

    public void setCapo(String capo) {
        this.capo = capo;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int novaVelocidade){
        velocidade = novaVelocidade;
    }

    public Carro(String fabricante, String modelo, int ano, String cor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        velocidade = 0;
        aeroFolio = "Padrão de fabrica";
        bodyKit = "Padrão de fabrica";
        rodas = "Padrão de fabrica";
        capo = "Padrão de fabrica";
    }

    int aerodinamica = 0;
    int VelocidadeAtual = 0;

    public int geVelocidade(){
        return velocidade;
    }

    public void acelerar(int valor, BodyShop oficina){
        int vezes = 0;
        int addVelocidade = oficina.getVeloAerofolio() + oficina.getVeloBodyKit() + oficina.getVeloRodas() + oficina.getVelocapo();

        valor += addVelocidade;
        while (vezes < valor){
            vezes++;
            velocidade += 10;
            System.out.println("Acelerando..." + velocidade + "Kmh");
        }
        aerodinamica = velocidade;
        addVelocidade *= 10;
        VelocidadeAtual = aerodinamica - addVelocidade;
    }

    public void parar(){
        while (velocidade >= 0){
            System.out.println("Parando..." + velocidade + "Kmh");
            velocidade -= 10;
        }
        velocidade = 0;
        System.out.println("Carro parado.");
    }

    public void exibir(){
        System.out.println("Fabricante: " + fabricante + "\nModelo: "+ modelo + "\nAno de lançamento: "+ ano + "\nCor: " + cor);
    }

    public void aero() {
        System.out.println("A aerodinâmica aumentou a velocidade de " + VelocidadeAtual + "Kmh para " + aerodinamica + "Kmh");
    }

}
