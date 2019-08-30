package _13_String;

public class WhitherStringBuilder {
    public String implicit(String[] fields){
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            //等价于  result = result + xxx;
            result += fields[i];
        }
        return result;
    }

    public String explicit(String[] fields){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
        }
        return result.toString();
    }
}
