public class toggleStrings{
    public static void main(String[] args){
        String str = "PhySIcs";
        System.out.println(str);
        for(int i=0; i<str.length(); i++){
            // P->p
            // check -> alphabet - small, capital
            boolean flag = true;// true-> capital
            char ch = str.charAt(i); //A
            if(ch == ' ') continue;
            int asci = (int)ch; //65
            if(asci>=97) flag = false;// small
            if(flag == true){// capital
                asci += 32;
                char dh = (char)asci; //a
                str = str.substring(0,i) + dh +str.substring(i+1); 
            }
            else{  //small
                asci -= 32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh +str.substring(i+1); 
            }
        }
        System.out.println(str);
    }
}