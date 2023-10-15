package gui_cadastro;
public class Dependente {
    private String cod, nome;
    private Data dataNasc;
    private boolean pcd;

    public Dependente() {
    }

    public Dependente(String cod, String nome, Data dataNasc) {
        this.cod = cod;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public boolean isPcd(boolean checkPCD) {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }
    
} //Fim classe Dependente;
