package lt.vtvpmc.ems.akademijait.spausdinimas;

public abstract class Figure {
    protected String figureName = "";
    protected double figureArea = 0;
    protected double measure = 0.05; //kolega sako, kad printerio sąnaudos nėra figūros savybė, todėl čia šio kintamojo aprašinėti nereikėtų

    //konstruktorius
    public Figure (String figureName, double figureArea){
        this.figureName = figureName;
        this.figureArea = figureArea;
    }

    public double figureTonerUsageCalculation(){
        return this.figureArea * measure;
    }


    public double newFigureTonerUsageCalculation( double tonerUsage){
        return this.figureArea * tonerUsage;
    }

}
