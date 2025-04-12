public class Pessoa {
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //metodo
    public void falar(){
        System.out.println("Ola mundo! My name is "+ this.nome + " e tenho " + idade + " de idade. Obrigado por falar comigo!");
    }
}