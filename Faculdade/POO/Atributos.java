class Personagem
{
    private String nome;
    private int idade;
    private String sexo;

    public void mudarNome(String novoNome)
    {
    this.nome = novoNome;
    }

    public void definirIdade(int novaIdade)
    {
    this.idade = novaIdade;
    }

    public void definirSexo(String novoSexo)
    {
    this.sexo = novoSexo;
    }

    public String getNome()
    {
    return nome;
    }

    public int getIdade()
    {
    return idade;
    }

    public String getSexo()
    {
    return sexo;
    }
}
// Criando a classe aparência.
class Aparencia extends Personagem
{
    private String roupa;
    private String corDoCabelo;
    private String corDaPele;

    public void trocarRoupa(String novaRoupa)
    {
        this.roupa = novaRoupa;
    }

    public void mudarCorDoCabelo(String novaCorDoCabelo)
    {
        this.corDoCabelo = novaCorDoCabelo;
    }

    public void mudarCorDaPele(String novaCorDaPele)
    {
        this.corDaPele = novaCorDaPele;
    }

    public String getRoupa()
    {
        return roupa;
    }

    public String getCorDoCabelo()
    {
        return corDoCabelo;
    }

    public String getCorDaPele()
    {
        return corDaPele;
    }
}

// Criando a classe atributos
public class Atributos
{
    private String traçosDePersonalidade;
    private String habilidades;
    private String proficiencias;

    public void adicionarTraco(String definirTracos)
    {
        this.traçosDePersonalidade = definirTracos;
    }

    public void adicionarHabilidades(String novasHabilidades)
    {
        this.habilidades = novasHabilidades;
    }

    public void adicionarProficiencias(String novasProficiencias)
    {
        this.proficiencias = novasProficiencias;
    }

    public String getTraçosDePersonalidade()
    {
        return traçosDePersonalidade;
    }

    public String getHabilidades()
    {
        return habilidades;
    }

    public String getProficiencia()
    {
        return proficiencias;
    }
}

// Criando a classe MenuDeOpcoes
class MenuDeOpcoes{
    public void continuar(){
        System.out.println("Jogo Continuado");
    }

    public void retroceder(){
        System.out.println("Jogo Retrocedido");
    }
}

// Criando a classe main
class Main{
    public static void main(String[] args){
        // Criando e testando a classe Personagem
        Personagem personagem = new Personagem();
        personagem.mudarNome("José");
        personagem.definirIdade(25);
        personagem.definirSexo("Masculino");

        System.out.println("Personagem:");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Idade: " + personagem.getIdade());
        System.out.println("Sexo: " + personagem.getSexo());

        // Criando e testando a classe Aparencia
        Aparencia aparencia = new Aparencia();
        aparencia.trocarRoupa("Casual");
        aparencia.mudarCorDoCabelo("Loiro");
        aparencia.mudarCorDaPele("Clara");

        // Criando e testando a classe MenuDeOpcoes
        MenuDeOpcoes menu = new MenuDeOpcoes();
        menu.continuar();
        menu.retroceder();
    }
}