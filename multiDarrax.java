public class multiDarrax {
    public static void main(String[] args) {
        int[][]flats=new int[2][3];
        flats[0][0]= 100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=103;
        System.out.println(flats.length);
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++)
                System.out.println(flats[i][j]);
        }

    }
    
}
