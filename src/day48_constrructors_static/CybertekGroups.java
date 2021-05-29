package day48_constrructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        //dependency injection . group object creation depends on string name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 =new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stphen","Mariam","Nancy","Aghaby","Abygil", "Sabidan"));
        System.out.println("geoup2 member =" + group2.getMembers());
        //use if statment to check if Aghaby is in group2
        if(group2.getMembers().contains("Aghaby")){
            System.out.println("Aghaby is member of group2");
        }else{
            System.out.println("Aghaby is not in group2");
        }
       //remove some from group1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);

        }
    }

