public class Pet {

    private String nomePet;
    private String TipoPet;
    private String sexoPet;
    private String enderecoEncontradoPet;
    private int idadePet;
    private String pesoPet;
    private String racaPet;

    public Pet(String nomePet, String tipoPet, String sexoPet, 
    String enderecoEncontradoPet, int idadePet,String pesoPet, String racaPet) {
        this.nomePet = nomePet;
        this.TipoPet = tipoPet;
        this.sexoPet = sexoPet;
        this.enderecoEncontradoPet = enderecoEncontradoPet;
        this.idadePet = idadePet;
        this.pesoPet = pesoPet;
        this.racaPet = racaPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getTipoPet() {
        return TipoPet;
    }

    public void setTipoPet(String tipoPet) {
        TipoPet = tipoPet;
    }

    public String getSexoPet() {
        return sexoPet;
    }

    public void setSexoPet(String sexoPet) {
        this.sexoPet = sexoPet;
    }

    public String getEnderecoEncontradoPet() {
        return enderecoEncontradoPet;
    }

    public void setEnderecoEncontradoPet(String enderecoEncontradoPet) {
        this.enderecoEncontradoPet = enderecoEncontradoPet;
    }

    public int getIdadePet() {
        return idadePet;
    }

    public void setIdadePet(int idadePet) {
        this.idadePet = idadePet;
    }

    public String getPesoPet() {
        return pesoPet;
    }

    public void setPesoPet(String pesoPet) {
        this.pesoPet = pesoPet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    @Override
    public String toString() {
        return "==== DADOS DO PET ====:\n" +
                "Nome: " + nomePet +"\n"+
                ", Tipo: " + TipoPet + "\n"+
                ", Sexo: " + sexoPet + "\n"+
                ", Endereço Encontrado: " + enderecoEncontradoPet + "\n" +
                ", Idade do Pet: " + idadePet + "\n"+
                ", Peso: " + pesoPet + "\n"+
                ", racaPet: " + racaPet + "\n" +
                "======================";
    }
    
}
