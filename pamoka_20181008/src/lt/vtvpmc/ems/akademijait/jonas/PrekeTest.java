package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//2018.10.09 perdarinejau si koda

class PrekeTest {

    @Test
    public void prekeTuripaskaiciuotiKaina(){
        Preke preke = new Preke();
        preke.setKainaSuPVM(10.0);
        assertEquals(12.1, preke.getKainaKainaSuPVM(), 0.01);
    }

    @Test
    public void vaistaiTuriSkaiciuotiKainaSu5ProcentuPVM(){
        Vaistai vaistas = new Vaistai();
        vaistas.setKainaSuPVM(10.0);
        assertEquals(10.5, vaistas.getKainaKainaSuPVM());
    }

    @Test
    public void spaudaTuriSkaiciuotiKainaSu9ProcentuPVM(){
        Spauda spauda = new Spauda();
        spauda.setKainaSuPVM(10.0);
        assertEquals(10.9, spauda.getKainaKainaSuPVM());
    }


}