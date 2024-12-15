import java.util.Stack;

public class sonrakiBuyukEleman {
	public static int[] sonrakiBuyukEleman(int[] dizi) {
		int[] sonuc = new int[dizi.length];
		Stack<Integer> yigit = new Stack<>();
		for(int  i = dizi.length-1; i>=0; i--) {
			if(!yigit.isEmpty()) {
				while(!yigit.isEmpty()&&yigit.peek()<=dizi[i]) {
					yigit.pop();
				}
			}
		if(yigit.isEmpty()) {
			sonuc[i]=-1;
		}
		else
			{
			sonuc[i]=yigit.peek();
			}}
	return sonuc;}
	public static void main(String[] args) {
		int[] sonuc = {4,7,3,4,8,1};
		System.out.println(sonrakiBuyukEleman(sonuc));
	}
}
