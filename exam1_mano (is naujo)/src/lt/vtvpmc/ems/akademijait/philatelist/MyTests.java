package lt.vtvpmc.ems.akademijait.philatelist;

import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class MyTests extends PhilatelistBaseTest {
    @Override
    protected Philatelist getPhilatelist() {
        return new PhilatelistImpl();
    }
}
