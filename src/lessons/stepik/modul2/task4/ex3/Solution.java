package lessons.stepik.modul2.task4.ex3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.printTextPerRole(actors(), test()));
        String[] roles = {"A", "AA"};
        String[] textLines = { "A:1A", "AA:2A"};
        System.out.println(solution.printTextPerRole(roles, textLines));

    }


    private String printTextPerRole(String[] roles, String[] textLines) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> tempList;
        int numberOfLines = 1;
        for(String s:textLines){
            for(String role: roles){
                if (s.startsWith(role + ":")){
                    String line = s.substring(role.length()+1).trim();
                    if (result.containsKey(role)) {
                        tempList = result.get(role);
                        line = numberOfLines + ") " + line;
                        tempList.add(line);
                        result.put(role, tempList);
                    } else {
                        tempList = new ArrayList<String>();
                        tempList.add(numberOfLines + ") " + line);
                        result.put(role, tempList);
                    }
                }

            }
            numberOfLines++;
        }
        StringBuilder tempString = new StringBuilder();
        for(String role:roles){
            if (result.containsKey(role)){
                tempString.append(role).append(":\n");
                for(String s:result.get(role)){
                    tempString.append(s).append("\n");
                }
            }
            tempString.append("\n");
        }


        

        return tempString.toString();
    }


    public static String[] actors() {

        return new String[]{"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
    }

    public static String[] test(){
        return new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",};
    }
}
