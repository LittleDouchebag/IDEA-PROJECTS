package Q504;

public class Base_7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num){
        boolean flag=true;
        if (num<0){
            num*=-1;
            flag=false;
        }
        String tempString="",outputString="";
        if (num==0)
            tempString="0";
        for (;num!=0;){
            tempString+=(char)('0'+(num%7));
            num/=7;
        }
        if (!flag)
            outputString+="-";
        for (int i=tempString.length()-1;i>=0;i--){
            outputString+=tempString.charAt(i);
        }
        return outputString;
    }
}
