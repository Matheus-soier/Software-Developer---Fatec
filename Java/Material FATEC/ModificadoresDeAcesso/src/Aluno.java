public class Aluno {
    private String nome;
    private int idade;

    //Método para acessar atributo privado
    //Atributos privados podem ser visualizados apenas pela própria classe
    //Usamos os métodos Get e Set por questões de segurança, para criar condições aos inputs das variáveis
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            this.idade = idade;
            System.out.println("Idade cadastrada!");
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public int getIdade() {
        return idade;
    }



}
