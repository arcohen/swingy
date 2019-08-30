package view;

public class UserOutput {

    public UserOutput() {}

    public UserOutput(String content) {
        System.out.println(content);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    public void output(String content) {
        System.out.println(content);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    public void outputSansNewLine(String content) {
        System.out.print(content);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

    public void dots() {
        for (int i = 0; i < 5; i++) {
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
    }
}
