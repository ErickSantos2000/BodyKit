
public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private boolean ligado;
    private int ano;
    private int velocidade;
    private String aeroFolio;
    private String bodyKit;
    private String rodas;
    private String capo;
    private String neon;
    private String corRodas;
    private String adesivo;

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

    //
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int novaVelocidade){
        velocidade = novaVelocidade;
    }

    //
    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean onOff){
        ligado = onOff;
    }

    //
    public String getNeon(){
        return neon;
    }
    public void setNeon(String neon){
        this.neon = neon;
    }

    //
    public String getAdesivo(){
        return adesivo;
    }
    public void setAdesivo(String adesivo){
        this.adesivo = adesivo;
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
        ligado = false;
    }

    int aerodinamica = 0;
    int VelocidadeAtual = 0;

    public void ligarCarro(){
        if(!ligado){
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Carro já esta ligado!");
        }
    }

    public void desligarCarro(){
        if(ligado){
            ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("Carro já esta desligado!");
        }
    }

    public void acelerar(int valor, BodyShop oficina){
        int vezes = 0;
        int addVelocidade = oficina.getVeloAerofolio() + oficina.getVeloBodyKit() + oficina.getVeloRodas() + oficina.getVelocapo();

        if(getLigado() == true){
            valor += addVelocidade;
            while (vezes < valor){
                vezes++;
                velocidade += 10;
                System.out.println("Acelerando..." + velocidade + "Kmh");
            }
            aerodinamica = velocidade;
            addVelocidade *= 10;
            VelocidadeAtual = aerodinamica - addVelocidade;
        } else {
            System.out.println("Não é possivel acelerar, carro está desligado!");
        }

    }

    public void parar(){
        if(velocidade > 0){
            while (velocidade >= 0) {
                System.out.println("Parando..." + velocidade + "Kmh");
                velocidade -= 10;
            }
            velocidade = 0;
            System.out.println("Carro parado.");
        } else {
            System.out.println("Carro desligado, não é possivel frear!");
        }

    }

    public void exibir(){
        System.out.println("Fabricante: " + fabricante + "\nModelo: "+ modelo + "\nAno de lançamento: "+ ano + "\nCor: " + cor);
    }

    public void aero() {
        System.out.println("A aerodinâmica aumentou a velocidade de " + VelocidadeAtual + "Kmh para " + aerodinamica + "Kmh");
    }

}
