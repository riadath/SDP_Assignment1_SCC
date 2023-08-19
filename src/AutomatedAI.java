public interface AutomatedAI {
    public String getRegion();
    public double getCost();
}

//implement for region : Asia, USA

class AsiaAutomatedAI implements AutomatedAI {
    public String getRegion() {
        return "Asia";
    }
    public double getCost() {
        return 1000;
    }
}
class USAAutomatedAI implements AutomatedAI {
    public String getRegion() {
        return "USA";
    }
    public double getCost() {
        return 2000;
    }
}
