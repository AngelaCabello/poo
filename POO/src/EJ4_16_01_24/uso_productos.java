package EJ4_16_01_24;

public class uso_productos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			productos bebida=new productos();
			
			bebida.dime_nombre();
			bebida.establece_nombre();
			System.out.println("el producto es "+ bebida.dime_nombre());
			
			bebida.dime_precio();
			bebida.establece_precio();
			System.out.println(bebida.dime_precio());
			
			bebida.dime_stock();
			bebida.establece_stock();
			System.out.println(bebida.dime_stock());
	}

}
