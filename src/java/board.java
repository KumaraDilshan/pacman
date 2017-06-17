
import java.text.*;
import java.util.*;
import java.util.logging.*;

final class board {

    static final long INTERVAL = 2000;
    final static Random rand = new Random();
    players player=new players();
    public static HashMap<String,int[]> map=new HashMap<>();
    
    
    public static int[] B1 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] G1 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] R1 = {rand.nextInt(44), rand.nextInt(44)};

    public static int[] B2 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] G2 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] R2 = {rand.nextInt(44), rand.nextInt(44)};

    public static int[] B3 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] G3 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] R3 = {rand.nextInt(44), rand.nextInt(44)};

    public static int[] B4 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] G4 = {rand.nextInt(44), rand.nextInt(44)};
    public static int[] R4 = {rand.nextInt(44), rand.nextInt(44)};
    

    @Override
    public String toString() {
        
        return ("{ \"DOTS\": [ [\"B\"," + B1[0] + "," + B1[1] + "], [\"G\", " + G1[0] + ", " + G1[1] + "], [\"R\", " + R1[0] + ", " + R1[1] + "], [\"B\", " + B2[0] + ", " + B2[1] + "], [\"G\", " + G2[0] + ", " + G2[1] + "], [\"R\", " + R2[0] + ", " + R2[1] + "],  [\"B\", " + B3[0] + ", " + B3[1] + "], [\"G\", " + G3[0] + ", " + G3[1] + "], [\"R\", " + R3[0] + ", " + R3[1] + "], [\"B\", " + B4[0] + ", " + B4[1] + "], [\"G\", " + G4[0] + ", " + G4[1] + "], [\"R\", " + R4[0] + ", " + R4[1] + "]  ]");
    }
    public void DotMap(){
        map.put(B1[0]+","+B1[1],new int[]{3,1});
        map.put(B2[0]+","+B2[1],new int[]{3,2});
        map.put(B3[0]+","+B3[1],new int[]{3,3});
        map.put(B4[0]+","+B4[1],new int[]{3,4});
        map.put(G1[0]+","+G1[1],new int[]{2,5});
        map.put(G2[0]+","+G2[1],new int[]{2,6});
        map.put(G3[0]+","+G3[1],new int[]{2,7});
        map.put(G4[0]+","+G4[1],new int[]{2,8});
        map.put(R1[0]+","+R1[1],new int[]{1,9});
        map.put(R2[0]+","+R2[1],new int[]{1,10});
        map.put(R3[0]+","+R3[1],new int[]{1,11});
        map.put(R4[0]+","+R4[1],new int[]{1,12});
        //Logger.getGlobal().log(Level.INFO, "update");
    }
    
    public void update(){       
        DotMap();
    }
      
    public static void remove_dots(int num){
        if (num==1)
            B1[0]=1000;
        if (num==2)
            B2[0]=1000;
        if (num==3)
            B3[0]=1000;
        if (num==4)
            B4[0]=1000;
        if (num==5)
            G1[0]=1000;
        if (num==6)
            G2[0]=1000;
        if (num==7)
            G3[0]=1000;
        if (num==8)
            G4[0]=1000;
        if (num==9)
            R1[0]=1000;
        if (num==10)
            R2[0]=1000;
        if (num==11)
            R3[0]=1000;
        if (num==12)
            R4[0]=1000;
        
    }
  }

