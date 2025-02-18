public class Main3 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("null", new ContaBancaria("232","2","botaaai","next","714512","corrente"), "email",
        new Endereco("s","Breno", "Telefone"),"Breno","121231234");
        System.out.println(funcionario.toString());
    }
}
