public class ch6{
    public static void main(String[] args) {
        int[][] aa={ {3,55,7,9,2,1} , {4,8,6,4,9,1},{14,48,6,34,91,1}};
  
        int i,j,max,min;
        int sum=0;
        max=min=aa[0][0];
        for(i=0;i<aa.length;i++)
        {
            
            for(j=0;j<aa[i].length;j++)
            {
                sum+=aa[i][j];
                if(aa[i][j]>max)
                    max=aa[i][j];
                if(aa[i][j]<min)
                    min=aa[i][j];
            }
            
        } 
            System.out.println("Min = "+min);
            System.out.println("Max = "+max);

            System.out.println("Average = "+(double)sum/aa.length);
    }
}

//二維振烈
//最大最小平均值