package day14_multi_branch_if_statments;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int seliction = 1;
        if(seliction ==1){
            System.out.println("Hello, thank you for your call");
        }else if(seliction == 2){
            System.out.println("hola, gracia para llamar");
        }else if(seliction ==3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else{
            System.out.println("lets talk java , and english , hello");
        }
    }
}
