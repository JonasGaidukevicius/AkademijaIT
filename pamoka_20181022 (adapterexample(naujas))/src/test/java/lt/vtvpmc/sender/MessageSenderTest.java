package lt.vtvpmc.sender;

import lt.vtvpmc.fancy.NewProvider;
import lt.vtvpmc.old.OldSmsProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    
    @Test
    public void canSendMessages() {
        MessageSender sender = new MessageSender();
        NewProvider newSmsProvider = new NewProvider();
        boolean result = sender.sendMessages(new NewToOldAdapter(newSmsProvider));

        //arba galiu nekurti objekto su nuoroda
        //boolean result = sender.sendMessages(new NewToOldAdapter(new NewProvider()));
        
        assertTrue(result);
        
    }

    //Cia as prirasiau prie mokytojo kodo
    @Test
    public void canSendMessagesInOldWay(){
        MessageSender sender1 = new MessageSender();
        boolean result1 = sender1.sendMessages(new OldSmsProvider());
        assertTrue(result1);
    }

}