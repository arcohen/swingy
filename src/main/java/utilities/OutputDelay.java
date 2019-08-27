
package utilities;

import view.UserOutput;

public class OutputDelay {
    UserOutput o;

    public OutputDelay() {
        this.o = new UserOutput();
    }

    public void delayOutput(int milliseconds) {
        try        
        {
            Thread.sleep(milliseconds);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
    }

    public void dots() {
        for (int i = 0; i < 5; i++) {
            try        
            {
                Thread.sleep(800);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
            o.output(".");
        }
    }
}
