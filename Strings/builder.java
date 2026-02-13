package Strings;

public class builder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        str.append("world");
        System.out.println(str);
        //setCharAt(idx, char) -> change the character at the given index
        str.setCharAt(0,'m');
        System.out.println(str);
        // append(string) -> add the string at the end of the string
        str.append(true);
        System.out.println(str);
        //insert(idx, ch) -> insert the character at the given index
        str.insert(2,'y');
        System.out.println(str);
        // deleteCharAt(idx) -> delete the character at the given index
        str.deleteCharAt(0);
        System.out.println(str);
        // reverse() -> reverse the string
        str.reverse();
        System.out.println(str);
        // delete(star. end) -> delete the string from start to end -1
        str.delete(2,5);
        System.out.println(str);
        //indexOf -> return the index of the first occurence of the given string
        System.out.println((str.indexOf(y)));
        //substring(start, end) -> return the substring from start to end - 1
        System.out.println(str.substring(2,8));
    }
}
