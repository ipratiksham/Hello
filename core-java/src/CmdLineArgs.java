
public class CmdLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i = 0; i< args.length; i++) {
			System.out.println(args[i]);
			
		}
		*/
		
		int total = 0;
		for(String s : args) {
			total += Integer.parseInt(s);
		}
		System.out.println("Total: "+ total);
		
		int x =10; //primitive variable
		Integer obj = x; //boxing = taking primitive value into object
		int z = obj; //unboxing = taking primitive value out of object
		
		System.out.println(x + obj * z);
	}

}
