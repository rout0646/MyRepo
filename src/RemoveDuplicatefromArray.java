
public class RemoveDuplicatefromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array= {1,2,3,1,4,5,2,7};
		for (int i=0 ;i<array.length -1 ; i++)
		{
			for (int j=i+1; j<array.length-1 ;j++ )
			{
				if (array[i]== array[j])
				{
					array[j]= (Integer) null;
					
				}
			}
		}
		array[array.length -1 ]=null;
	}
	sysout

}
