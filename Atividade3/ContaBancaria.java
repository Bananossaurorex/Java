public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private String SaldoAtual;
    private String LimiteDisponivel;

    public ContaBancaria(String LimiteDisponivel, String SaldoAtual, String agencia, String banco, String numeroConta, String tipoConta) {
        this.LimiteDisponivel = LimiteDisponivel;
        this.SaldoAtual = SaldoAtual;
        this.agencia = agencia;
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(String SaldoAtual) {
        this.SaldoAtual = SaldoAtual;
    }

    public String getLimiteDisponivel() {
        return LimiteDisponivel;
    }

    public void setLimiteDisponivel(String LimiteDisponivel) {
        this.LimiteDisponivel = LimiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", numeroConta=" + numeroConta
                + ", tipoConta=" + tipoConta + ", SaldoAtual=" + SaldoAtual + ", LimiteDisponivel=" + LimiteDisponivel
                + "]";
    }
    

}
