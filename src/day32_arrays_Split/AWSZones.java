package day32_arrays_Split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("----Starting deployment of etsy app to AWS zones----");
        String[] zonesToDeploy =zones.split(",");
        for(String eachZone:zonesToDeploy){
            System.out.println("\t\tDeploying "+ app+ " to "+eachZone+".....");
            System.out.println("\t\tDeployment completed for "+eachZone +".....\n");

        }
        System.out.println("\n\n\t\t-----All deployments complete------");
    }
}
