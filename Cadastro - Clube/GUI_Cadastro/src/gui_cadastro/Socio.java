package gui_cadastro;

import java.util.ArrayList;

public class Socio {
    private int codigo, nroDependentes, nroDependentesCadastrados;
    private String nome, cpf, rg, atividades, email;
    private String genero;
    private boolean socioProprietario, pcd;
    private Data dataNasc;
    private Endereco endereco;
    private ArrayList<Dependente> dependentes; 

    public Socio() {
        dataNasc = new Data();
        endereco = new Endereco();
        dependentes = new ArrayList<Dependente>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNroDependentes() {
        return nroDependentes;
    }

    public void setNroDependentes(int nroDependentes) {
        this.nroDependentes = nroDependentes;
    }

    public int getNroDependentesCadastrados() {
        return nroDependentesCadastrados;
    }

    public void setNroDependentesCadastrados(int nroDependentesCadastrados) {
        this.nroDependentesCadastrados = nroDependentesCadastrados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isSocioProprietario() {
        return socioProprietario;
    }

    public void setSocioProprietario(boolean socioProprietario) {
        this.socioProprietario = socioProprietario;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }
    
} //Fim classe Socio;
