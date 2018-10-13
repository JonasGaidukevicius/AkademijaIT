package lt.vtvpmc.ems.akademijait.spausdinimas;

public abstract class Figure {
    protected String figureName = "";
    protected double figureArea = 0;
    protected double measure = 0.05;

    //konstruktorius
    public Figure (String figureName, double figureArea){
        this.figureName = figureName;
        this.figureArea = figureArea;
    }

    public double figureTonerUsageCalculation(){
        return this.figureArea * measure;
    }

}
