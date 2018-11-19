package fr.utbm.lo54.projet.server.entity;

import java.util.List;
import java.util.Objects;

public class Utilisateur {

    private int id;
    private String nom;
    private String prenom;
    private String rue;
    private String cp;
    private String ville;
    private String telephone;
    private String email;
    private List<Integer> formations;

    public Utilisateur() {

    }

    public Utilisateur(int id, String nom, String prenom, String rue, String cp, String ville, String telephone, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getFormations() {
        return formations;
    }

    public void addFormation(int id) {
        formations.add(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utilisateur)) return false;
        Utilisateur that = (Utilisateur) o;
        return getId() == that.getId() &&
                Objects.equals(getNom(), that.getNom()) &&
                Objects.equals(getPrenom(), that.getPrenom()) &&
                Objects.equals(getRue(), that.getRue()) &&
                Objects.equals(getCp(), that.getCp()) &&
                Objects.equals(getVille(), that.getVille()) &&
                Objects.equals(getTelephone(), that.getTelephone()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getFormations(), that.getFormations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getPrenom(), getRue(), getCp(), getVille(), getTelephone(), getEmail(), getFormations());
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", rue='" + rue + '\'' +
                ", cp='" + cp + '\'' +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", formations=" + formations +
                '}';
    }
}