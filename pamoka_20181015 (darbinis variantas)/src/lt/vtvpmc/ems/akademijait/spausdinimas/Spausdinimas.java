package lt.vtvpmc.ems.akademijait.spausdinimas;

public class Spausdinimas {

    private Figure[] job = new Figure[10];
    private int count = 0;

    //figuros pridejimas i spausdinimo eile
    public void addFigure(Figure figure){
        job[count++] = figure;
    }

    //skaiciuoju bendra tonerio sunaodojima visu ivestu i spausdinimo eile figuru
    public double getUsedTonerAmount(){
        double usedToner = 0;
        for (int i = 0; i < count; i++){
            usedToner+= this.job[i].figureTonerUsageCalculation();
        }
        return usedToner;
    }


}
