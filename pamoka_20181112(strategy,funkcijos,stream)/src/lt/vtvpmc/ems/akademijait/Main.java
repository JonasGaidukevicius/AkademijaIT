package lt.vtvpmc.ems.akademijait;

import lt.vtvpmc.ems.akademijait.funcine_strategija.Behavior;
import lt.vtvpmc.ems.akademijait.funcine_strategija.Speaker;

import java.util.function.Function;

public class Main {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(speak("labas"));
        System.out.println(speak("sausainis"));
        System.out.println(speak("piratas"));

        System.out.println(speakWithBehavior(Main::behaveGood,"labas"));
        System.out.println(speakWithBehavior(Main::behaveGood,"sausainis"));
        System.out.println(speakWithBehavior(Main::behaveGood,"piratas"));


        System.out.println(speakWithBehavior(Main::behaveBad,"labas"));
        System.out.println(speakWithBehavior(Main::behaveBad,"sausainis"));
        System.out.println(speakWithBehavior(Main::behaveBad,"piratas"));

        //metodas speakWithBehavior turi parametra interfeiso Behavior tipo. Antras parametras yra tiesiog stringas.
        //Behavior tipo parametru paduodu metoda, kuris tenkina sąlygas, kad yra tik vienas metodas ir modifikuojama tik viena reikšmė
        //Šiuo atveju, aš panaudoju metodus behaveGood ir behaveBad, kurie net nera implementave interfeiso, bet ji tinka to
        //interfeiso realizavimui - tie metodai priima stringą ir grąžiną stringą ir nedaro modifikacijos kitų globalių laukų

        System.out.println("---Galima ir kitaip užrašyti kodą---");
        speakWithParrot(Main::behaveGood);
        speakWithParrot(Main::behaveBad);
        speakWithParrot((message) -> message);

        //metodo speakWithParrot parametras - Behavior interfeiso tipo. ten yra vienas metodas.
        //Tada per lambda israiska parasau to interfeiso realizacija - paduodamas vienas laukas, ir vienas grazinamas
        //Ir Java pati atsirenka koks lauko tipas - eina is eiles.

        System.out.println("--- Dar kita realizacija ---");
        simplySpeak(Main::behaveBad); //nelabai tinka, nes prarandame dali funkcionalumo
        simplySpeak((message) -> speakWithBehavior(Main::behaveGood, "labas")); //labai ilgas uzrasas
        simplySpeak(Main::speakGood);
        simplySpeak(Main::speakBad); //bet siuo atveju turiu susikurti papildomus metodus

        System.out.println("---- Realizacija per funkcijas ----");
        simplySpeakingJavaEdition(Main::speakGood);
        simplySpeakingJavaEdition(Main::speakBad);
    }

    ////////Dar viena realizacija

    /**
     *
     * @param f
     */
    public static void simplySpeakingJavaEdition(Function<String, String> f){

        /**
         *
         */
        System.out.println(f.apply("labas"));
        System.out.println(f.apply("sausainis"));
        System.out.println(f.apply("piratas"));
    }
    //////////////baigiasi realizacija


    /** Toks koemtaras patenka į JavaDoc sugeneruotą dokumentaciją.
     *
     * @param speaker
     */





    public static void simplySpeak(Speaker speaker){
        System.out.println(speaker.speak("labas"));
        System.out.println(speaker.speak("sausainis"));
        System.out.println(speaker.speak("piratas"));

    }

    public static String speakGood(String message){
        return speakWithBehavior(Main::behaveGood, message);
    }

    public static String speakBad(String message){
        return speakWithBehavior(Main::behaveBad, message);
    }

    public static void speakWithParrot(Behavior behavior){
        System.out.println(speakWithBehavior(behavior,"labas"));
    }


    public static String speak(String message){
        return "Poli " + message;
    }

    public static String behaveGood(String message){
        return message;
    }

    public static String behaveBad(String message){
        if(message.equals("sausainis")){
            return "noriu sausainio";
        } else {
            return "rūpus miltai, kur sausainis";
        }
    }


    public static String speakWithBehavior(Behavior behavior, String message){
        return "Poli sako " + behavior.answer(message);
    }



}
