package ClassesMetier;

public class Etudiant {
    
    private int numeroEtudiant;
    private String nomEtudiant;
    private int ageEtudiant;

    public Etudiant(int numeroEtudiant, String nomEtudiant, int ageEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.ageEtudiant = ageEtudiant;
    }
    
    
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public int getAgeEtudiant() {
        return ageEtudiant;
    }

    public void setAgeEtudiant(int ageEtudiant) {
        this.ageEtudiant = ageEtudiant;
    }
    
    
    
}
