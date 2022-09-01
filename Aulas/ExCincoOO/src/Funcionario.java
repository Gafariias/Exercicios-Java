public class Funcionario {
    private int codigo;
    private char turno;
    private char categoria;

    public Funcionario() {
        this.codigo = (int)(Math.random() * 100);
    }

    //Setters e Getter
    //codigo
    public String getCodigo() {
        return "FN" + codigo;
    }

    //Turno
    public void setTurno(char turno) {
        this.turno = turno;
    }
    public char getTurno() {
        return turno;
    }

    //Categoria
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    public char getCategoria() {
        return categoria;
    }
}
