public enum enumwithprivateconstructor {
    January(15,16), February(28,0), March(), April(21,19), June, July;
    int workingDays;
    int holidays;
    private enumwithprivateconstructor(int workingDays , int holidays) {
        System.out.println("Argument");
        this.workingDays = workingDays;
        this.holidays= holidays;}
    private enumwithprivateconstructor() {
        System.out.println("No Argument");
    }
    public static void main(String args[]) {
    }
}



