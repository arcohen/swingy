package view;

public class UserOutput {

    public UserOutput() {}

    public UserOutput(String content) {
        System.out.println(content);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    public void output(String content) {
        delay(50);
        System.out.println(content);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    public void outputSansNewLine(String content) {
        System.out.print(content);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    public void dots(int multiples) {
        output("");
        for (int i = 0; i < multiples; i++) {
            try        
            {
                Thread.sleep(500);
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
            outputSansNewLine(".");
        }
        output("\n");
    }

    public void delay(int milliSecs) {
        try        
        {
            Thread.sleep(milliSecs);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
    }
}
