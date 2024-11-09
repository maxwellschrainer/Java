public class Personagem{
    private String nome;
    private String proficiencias;
    private String roupas;
}

public void girarPersonagem()
{
    System.out.println("O personagem está girando");
}

public String getNome()
{
 return nome;
}

public void setNome(String nome)
{
    this.nome = nome;
}

public String getProficiencias() {
    return proficiencias;
}

public void setProficiencias(String proficiencias) {
    this.proficiencias = proficiencias;
}

public String getRoupas() {
    return roupas;
}

public void setRoupas(String roupas) {
    this.roupas = roupas;
}