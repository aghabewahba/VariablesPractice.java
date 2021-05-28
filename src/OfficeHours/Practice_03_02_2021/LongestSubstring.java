package OfficeHours.Practice_03_02_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        String longestSubstring = "";
        String temp ="";
        for(int i =0;i < str. length();i++){
            temp += str.charAt(i);
            if(str.charAt(i) !=str.charAt(i +1)){
                if(temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }

                temp = "";

            }
        }

        System.out.println("Longest substring: "+ longestSubstring);
            }

        }



