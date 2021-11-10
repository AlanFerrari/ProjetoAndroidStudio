package br.com.etecia.listaplanetaapp;

public class Planetas {
    private String nomePlanetas;
    private int imgPlanetas;

    public Planetas() {
    }

    public Planetas(String nomePlanetas, int imgPlanetas) {
        this.nomePlanetas = nomePlanetas;
        this.imgPlanetas = imgPlanetas;
    }

    public String getNomePlanetas() {
        return nomePlanetas;
    }

    public void setNomePlanetas(String nomePlanetas) {
        this.nomePlanetas = nomePlanetas;
    }

    public int getImgPlanetas() {
        return imgPlanetas;
    }

    public void setImgPlanetas(int imgPlanetas) {
        this.imgPlanetas = imgPlanetas;
    }
}
