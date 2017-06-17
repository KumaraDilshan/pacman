
import java.text.*;
import java.util.*;
import java.util.logging.*;

final class players {

    static final long INTERVAL = 2000;
    final Random rand = new Random();

    public int[] p1 = {0, 0, 0};
    public int[] p2 = {0, 44, 0};
    public int[] p3 = {0, 0, 44};
    public int[] p4 = {0, 44, 44};

    @Override
    public String toString() {
        
        return (" \"PLAYERS\": [[\"P1\", " + p1[0] + ", " + p1[1] + ", " + p1[2] + "], [\"P2\", " + p2[0] + ", " + p2[1] + ", " + p2[2] + "], [\"P3\", " + p3[0] + ", " + p3[1] + ", " + p3[2] + "], [\"P4\", " + p4[0] + ", " + p4[1] + ", " + p4[2] + "]]}");
    }
    

    public void update(String arr, String key) {
        if (arr.equals("P1")) {
            //if(key.equals("37")){}
            switch (key) {
                case "37":
                    p1[1] -= 1;
                    if(p1[1]<0){p1[1]=44;}
                    break;
                case "38":
                    p1[2] -= 1;
                    if(p1[2]<0){p1[2]=44;}
                    break;
                case "39":
                    p1[1] += 1;
                    if(p1[1]>44){p1[1]=0;}
                    break;
                case "40":
                    p1[2] += 1;
                    if(p1[2]>44){p1[2]=0;}
                    break;
            }
        } else if (arr.equals("P2")) {
            switch (key) {
                case "37":
                    p2[1] -= 1;
                    if(p2[1]<0){p2[1]=44;}
                    break;
                case "38":
                    p2[2] -= 1;
                    if(p2[2]<0){p2[2]=44;}
                    break;
                case "39":
                    p2[1] += 1;
                    if(p2[1]>44){p2[1]=0;}
                    break;
                case "40":
                    p2[2] += 1;
                    if(p2[2]>44){p2[2]=0;}
                    break;
            }
        } else if (arr.equals("P3")) {
            switch (key) {
                case "37":
                    p3[1] -= 1;
                    if(p3[1]<0){p3[1]=44;}
                    break;
                case "38":
                    p3[2] -= 1;
                    if(p3[2]<0){p3[2]=44;}
                    break;
                case "39":
                    p3[1] += 1;
                    if(p3[1]>44){p3[1]=0;}
                    break;
                case "40":
                    p3[2] += 1;
                    if(p3[2]>44){p3[2]=0;}
                    break;
            }
        } else if (arr.equals("P4")) {
            switch (key) {
                case "37":
                    p4[1] -= 1;
                    if(p4[1]<0){p4[1]=44;}
                    break;
                case "38":
                    p4[2] -= 1;
                    if(p4[2]<0){p4[2]=44;}
                    break;
                case "39":
                    p4[1] += 1;
                    if(p4[1]>44){p4[1]=0;}
                    break;
                case "40":
                    p4[2] += 1;
                    if(p4[2]>44){p4[2]=0;}
                    break;
            }
        }
        Touch();
        updatemarks();
    }
    
    
    public void Touch(){
        if((p1[1]==p2[1])&&p1[2]==p2[2]){
            p1[0]-=1; p1[1]=0;p1[2]=0;
            p2[0]-=1; p2[1]=44;p2[2]=0;
        }else if((p1[1]==p3[1])&&(p1[2]==p3[2])){
            p1[0]-=1; p1[1]=0;p1[2]=0;
            p3[0]-=1; p3[1]=0;p3[2]=44;
        }else if((p1[1]==p4[1])&&(p1[2]==p4[2])){
            p1[0]-=1; p1[1]=0;p1[2]=0;
            p4[0]-=1; p4[1]=44;p4[2]=44;
        }else if((p2[1]==p3[1])&&(p2[2]==p3[2])){
            p2[0]-=1; p2[1]=44;p2[2]=0;
            p3[0]-=1; p3[1]=0;p3[2]=44;
        }else if((p2[1]==p4[1])&&(p2[2]==p4[2])){
            p2[0]-=1; p2[1]=44;p2[2]=0;
            p4[0]-=1; p4[1]=44;p4[2]=44;
        }else if((p3[1]==p4[1])&&(p3[2]==p4[2])){
            p3[0]-=1; p3[1]=0;p3[2]=44;
            p4[0]-=1; p4[1]=44;p4[2]=44;
        }
    }
    
    
   public void updatemarks(){
        int[] data;
        if(board.map.containsKey(p1[1]+","+p1[2])){
            data=board.map.get(p1[1]+","+p1[2]);
            p1[0]+=data[0];
            board.map.remove(p1[1]+","+p1[2]);
            board.remove_dots(data[1]);
            
        }else if(board.map.containsKey(p2[1]+","+p2[2])){
            data=board.map.get(p2[1]+","+p2[2]);
            p2[0]+=data[0];
            board.map.remove(p2[1]+","+p2[2]);
            board.remove_dots(data[1]);
            
        }else if(board.map.containsKey(p3[1]+","+p3[2])){
            data=board.map.get(p3[1]+","+p3[2]);
            p3[0]+=data[0];
            board.map.remove(p3[1]+","+p3[2]);
            board.remove_dots(data[1]);
            
        }else if(board.map.containsKey(p4[1]+","+p4[2])){
            data=board.map.get(p4[1]+","+p4[2]);
            p4[0]+=data[0];
            board.map.remove(p4[1]+","+p4[2]);
            board.remove_dots(data[1]);
        }else{
            data=new int[]{100,15};  
        }
    }
}
