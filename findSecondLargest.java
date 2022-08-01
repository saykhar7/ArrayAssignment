

//Second Largest Number
public class findSecondLargest {

static    public int getSecondLargest(int ar[])//2,5,50,20,10,9
  {
      int temp=0;
      for(int i=0;i<ar.length;++i)
      {

          for(int j=i+1;j<ar.length;++j)
          {
              //sorting

              if(ar[i]>ar[j])//
              {
                  //swapping
                  temp=ar[i];
                  ar[i]=ar[j];
                  ar[j]=temp;

              }
          }
      }
      return ar[ar.length-2];
  }

  public static void main(String[] args) {
      // TODO Auto-generated method stub
int ar[]= {2,5,50,20,10,9};

System.out.println("Second Largest Number : ");
int secondLargest=getSecondLargest(ar);
System.out.println(secondLargest);
  }

}