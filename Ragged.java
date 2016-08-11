import java.util.Arrays;
class Ragged
{
  public static void main(String args[])
  {
    int arr1[][]=new int[3][];
    arr1[0]=new int[4];
    arr1[1]=new int[3];
    arr1[2]=new int[5];
    arr1[0][0]=90;
    arr1[0][1]=100;
    arr1[0][2]=93;
    arr1[0][3]=80;
    arr1[1][0]=89;
    arr1[1][1]=67;
    arr1[1][2]=48;
    arr1[2][0]=96;
    arr1[2][1]=48;
    arr1[2][2]=90;
    arr1[2][3]=55;
    arr1[2][4]=70;
    
    
    System.out.println("row count="+arr1.length);
    for(int i=0;i<arr1.length;i++)
    {
        for(int j=0;j<arr1[i].length;i++)
        {
           System.out.println("\t"+arr1[i][j]);
           
          }
          

    }
    
    
  }
  
  
}
  
