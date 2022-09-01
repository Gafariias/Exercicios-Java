public class Departamento {
    
    private String Nome;
    private Professor[] professores; 

    public Departamento(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
    public Professor[] getProfessores() {
        return professores;
    }

    public void printProfessores() {
        
        for (int i = 0; i < professores.length; i++) {

            //Adiciona o nome de cada professor a lista
            System.out.println(professores[i].getNome());

        }
    }
}
