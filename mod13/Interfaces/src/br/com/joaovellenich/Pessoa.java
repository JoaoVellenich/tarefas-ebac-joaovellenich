package br.com.joaovellenich;

public abstract class Pessoa {
    private String name;
    private String sobrenome;

    public abstract void showData();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
