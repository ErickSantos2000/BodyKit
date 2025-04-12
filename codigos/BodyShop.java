public class BodyShop {
    public void setTrocarCor(Carro carro, String novaCor){
        String corAnterior = carro.getCor();
        carro.setCor(novaCor);
        System.out.println("Cor trocada de " + corAnterior + " para " + novaCor);
    }

    int aerofolio = 0;
    int bodyKit = 0;
    int rodas = 0;
    int capo = 0;

    public int getVeloAerofolio(){
        return aerofolio;
    }
    public int getVeloBodyKit(){
        return bodyKit;
    }

    public int getVeloRodas(){
        return rodas;
    }

    public int getVelocapo(){
        return capo;
    }


        public void mostrarCarroceria(Carro carro) {
            System.out.println("----Carroceria----");
            System.out.println(carro.getAeroFolio());
            System.out.println(carro.getBodyKit());
            System.out.println(carro.getCapo());
            System.out.println(carro.getRodas());
            System.out.println();
        }

        public void instalarAerofolio(Carro carro, int aerofolio) {
        switch (aerofolio) {
            case 1:
                carro.setAerofolio("Aerofólio Fixo");
                this.aerofolio = 1;
                System.out.println("Aerofólio Fixo instalado!");
                break;

            case 2:
                carro.setAerofolio("Aerofólio Ativo");
                this.aerofolio = 2;
                System.out.println("Aerofólio Ativo instalado!");
                break;

            case 3:
                carro.setAerofolio("Aerofólio Regulável");
                this.aerofolio = 3;
                System.out.println("Aerofólio Regulável instalado!");
                break;

            default:
                System.out.println("Aerofólio não instalado.");
        }
    }
    public void instalarBodyKit(Carro carro,int bodyKit) {

        switch (bodyKit) {
            case 1:
                String um = "Bodykit Estético";
                carro.setBodyKit(um);
                this.bodyKit = 1;
                System.out.println("Bodykit Estético instalado!");
                break;
            case 2:
                String dois =  "Bodykit Aerodinâmico";
                carro.setBodyKit(dois);
                this.bodyKit = 2;
                System.out.println("Bodykit Aerodinâmico instalado!");
                break;
            case 3:
                String tres = "Widebody Kit";
                carro.setBodyKit(tres);
                this.bodyKit = 3;
                System.out.println("Widebody Kit instalado!");
                break;
            default:
                System.out.println("BodyKit não instalado.");
        }
    }

    public void instalarRodas(Carro carro, int rodas) {
        switch (rodas){
            case 1:
                carro.setRodas("Rodas de Liga Leve");
                this.rodas = 1;
                System.out.println("Rodas de Liga Leve instaladas!");
                break;

            case 2:
                carro.setRodas("Rodas Esportivas");
                this.rodas = 2;
                System.out.println("Rodas Esportivas instaladas!");
                break;

            case 3:
                carro.setCapo("Rodas Off-road");
                this.rodas = 3;
                System.out.println("Rodas Off-road instaladas!");
                break;

            default:
                System.out.println("Roda não instalada.");

        }
    }


    public void instalarCapo(Carro carro, int capo){
        switch (capo){
            case 1:
                carro.setRodas("Capô de Fibra de Carbono");
                this.capo = 1;
                System.out.println("Capô de Fibra de Carbono instalado!");
                break;

            case 2:
                carro.setCapo("Capô Transparente");
                this.capo = 2;
                System.out.println("Capô Transparente instalado!");
                break;

            case 3:
                carro.setCapo("Capô com Tomada de Ar");
                this.capo = 3;
                System.out.println("Capô com Tomada de Ar instalado!");
                break;

            default:
                System.out.println("Capo não instalado.");
        }
    }
}



