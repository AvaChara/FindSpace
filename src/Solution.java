import java.util.Scanner;

/*
* 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
* 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
public class Solution {
    public static void main(String args[]){
        while (true) {
            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();
            StringBuffer buf = new StringBuffer(string);
            Solution solution = new Solution();
            System.out.println(solution.replaceSpace(buf));
        }
    }

    public String replaceSpace(StringBuffer str) {
        String result=str.toString();
        String ss = new String();
        ss=result.replace(" ","%20");
        return ss;
    }
}
