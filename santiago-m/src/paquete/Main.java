package paquete;

import paquete.Producto;
import paquete.Frutas;
import paquete.Gaseosas;
import paquete.ProductoLimpieza;

class Main {

	public static void main(String[] args) {
		
		/*carga de datos*/
		
		Gaseosas g = new Gaseosas();
		g.nombre=("Coca-Cola Zero");
		g.precio =20;
		g.litro ="1.5";
		
		Gaseosas g1= new Gaseosas();
		g1.nombre =("Coca-Cola");
		g1.precio =18;
		g1.litro ="1.5";
		
		ProductoLimpieza p= new ProductoLimpieza();
		p.nombre =("Shampoo Sedal");
		p.contenido=500;
		p.precio=19;
		
		Frutas f= new Frutas();
		f.nombre=("Frutillas");
		f.precio=64;
		f.unidadDeVenta="kilo";

		/*mayor y menor*/

		int ax=0;
		int ax1=0;
		
		String may="";
		String men="";
		String matrisP[][] = new String [4][2];
		
		matrisP[0][0]="Coca-Cola Zero";
		matrisP[0][1]="20";
		matrisP[1][0]="Coca-Cola";
		matrisP[1][1]="18";
		matrisP[2][0]="Shampoo Sedal";
		matrisP[2][1]="19";
		matrisP[3][0]="Frutillas";
		matrisP[3][1]="64";
		
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
			
				if(matrisP[i][j]==matrisP[0][1])
				{
					ax1=Integer.parseInt(matrisP[0][1]);
					may=matrisP[i][0];
				}
				else if(j==1){
					ax=Integer.parseInt(matrisP[i][j]);
					if(ax1<ax)
					{
						ax1=Integer.parseInt(matrisP[i][1]);
						may=matrisP[i][0];
					}
				}
			}
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
			
				if(matrisP[i][j]==matrisP[0][1])
				{
					ax1=Integer.parseInt(matrisP[0][1]);
					men=matrisP[i][0];
				}
				else if(j==1){
					ax=Integer.parseInt(matrisP[i][j]);
					if(ax1>ax)
					{
						ax1=Integer.parseInt(matrisP[i][j]);
						men=matrisP[i][0];
					}
				}
			}
		}
		/*salida por pantalla*/

		
		System.out.println("Nombre: "+g.nombre+" /// Litros: "+g.litro+" /// Precio: $"+g.precio);
		System.out.println("Nombre: "+g1.nombre+" /// Litros: "+g1.litro+" /// Precio: $"+g1.precio);
		System.out.println("Nombre: "+p.nombre+" /// Contenido: "+p.contenido+"ml"+" /// Precio: $"+p.precio);
		System.out.println("Nombre: "+f.nombre+" /// Precio: $"+f.precio+" /// Unidad de Venta: "+f.unidadDeVenta);

		System.out.println("=============================");

		System.out.println("Producto màs caro: "+may);
		System.out.println("Producto màs barato: "+men);
		}	
	}

