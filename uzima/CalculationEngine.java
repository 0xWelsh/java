public class CalculationEngine {
    // helper method to get survey authority fees
    public double[] getSurveyAuthorityFees(String clientCategory) {
        switch (clientCategory.toLowerCase()) {
            case "industrial":
                return new double[]{20000, 50000};
            case "commercial":
                return new double[]{15000, 30000};
            case "domestic":
                return new double[]{7000, 10000};
            default:
                return new double[]{0, 0};
        }
    }

    // method to calculate cost based on depth
    public double calculateDepthCost(int depthInMeters) {
        if (depthInMeters >= 1 && depthInMeters <= 100) return depthInMeters * 1000;
        if (depthInMeters >= 101 && depthInMeters <= 200) return depthInMeters * 1500;
        if (depthInMeters >= 201 && depthInMeters <= 300) return depthInMeters * 2000;
        if (depthInMeters > 300) return depthInMeters * 2500;
        return 0;

    }

    // method to calculate total plumbing cost
    public double calculatePlumbingCost(String pipeType, double diameter, double length, int numOutlets) {
        
        double baseRate = 100.0; // this is a placeholder rate
        return (baseRate * length * diamter) + (numOutlets * 500);
    }

    // method to calculate the total amount to be paid by each client
    public double calculateTotalBill(double servicesCost, double plumbingCost, string clientCategory) {
        double[] fees = getSurveyAndAuthorityFees(clientCategory);
        double totalBeforeTax = serviceCost + plumbingCost + fees[0] + fees[1];
        double taxAmount = totalBeforeTax * 0.16; 
        return totalBeforeTax + taxAmount;
    }
    
}
