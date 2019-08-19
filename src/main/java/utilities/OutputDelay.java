
package utilities;

public class OutputDelay {

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
}
