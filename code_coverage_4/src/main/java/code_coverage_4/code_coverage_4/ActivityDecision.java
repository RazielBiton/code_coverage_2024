package code_coverage_4.code_coverage_4;

public class ActivityDecision {
    public boolean Walking;
    public boolean Midnight;
    public boolean Running;
    public boolean Sunshine;
    public boolean Raining;

    public ActivityDecision() {
        this.Walking = false;
        this.Midnight = false;
        this.Running = false;
        this.Sunshine = false;
        this.Raining = false;
    }

    public String decideActivity(){
        if(Walking && Midnight){
            if(Raining){
                return "Take umbrella and searchlight";
            }
            else{
                return "Take searchlight";
            }
        }

        else if(Running && Sunshine){
            if(Raining){
                return "Take umbrella";
            }
        }
        return "Keep doing what you were doing";
        
    }
    
}