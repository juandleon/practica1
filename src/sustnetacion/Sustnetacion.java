/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustnetacion;
import java.util.Scanner;
import java.util.ArrayList;

public class Sustnetacion {

    
    public static void main(String[] args) {
        int opcion,gt=0,d=0,e=0,ganancia=0,f=0;
        String com,a,b,c,h,j=".";
        ArrayList<Producto> obje = new ArrayList<>();
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("Digite la opción deseada");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Realizar venta");
            System.out.println("6. Mostrar ganancias totales");
            System.out.println("7. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 7: System.out.println("usted esta saliendo");
                    break;
                case 1: Producto p1=new Producto();
                        p1.ingresar();
                        obje.add(p1);
                    break;
                case 2: System.out.println("Ingrese el nombre del producto");
                        com=lector.next();
                        for(int i=0;i<obje.size();i++){
                            if (com.equals(obje.get(i).getNombre())){
                                gt=i;
       
                            }
                        }
                        if(gt!=0){
                            a=obje.get(gt).getNombre();
                            b=obje.get(gt).getCantidad();
                            c=obje.get(gt).getPrecio();
                            System.out.println("el producto "+a+" tiene un precio de "
                                               +c+" y hay "+b+ " disponibles");
                            gt=0;
                        }else{
                            System.out.println("el producto no existe en el inventario");
                        }
                    
                    break;
                case 3: System.out.println("Ingrese el nombre del producto a borrar");
                        com=lector.next();
                        for(int i=0;i<obje.size();i++){
                            if (com.equals(obje.get(i).getNombre())){
                                gt=i;
       
                            }
                        }
                         if(gt!=0){
                            obje.get(gt).setNombre(j);
                            obje.get(gt).setCantidad(j);
                            obje.get(gt).setPrecio(j);
                            gt=0;
                        }else{
                            System.out.println("el producto no existe en el inventario");
                        }
                    break;
                case 4: System.out.println("nombre    precio   cantidad");
                        for(int i=0;i<obje.size();i++){
                            System.out.println(""+obje.get(i).getNombre()+"    "
                                               +obje.get(i).getPrecio()+"      "
                                               +obje.get(i).getCantidad());
                            
                        }
                    break;
                case 5: System.out.println("Ingrese el nombre del producto a vender");
                        com=lector.next();
                        for(int i=0;i<obje.size();i++){
                            if (com.equals(obje.get(i).getNombre())){
                                gt=i;
       
                            }
                        }
                        if(gt!=0){
                            a=obje.get(gt).getNombre();
                            b=obje.get(gt).getCantidad();
                            c=obje.get(gt).getPrecio();
                            System.out.println("el producto "+a+" tiene un precio de "
                                               +c+" y hay "+b+ "disponibles");
                            System.out.println("cuantos desea llevar?");
                            d=lector.nextInt();
                            e = Integer.parseInt(b);
                            f = Integer.parseInt(c);
                            if(d<=e){
                                e=e-d;
                                ganancia=ganancia+(f*d);
                            }else{
                                System.out.println("no se dispone de dicha cantidad");
                            }
                            h=Integer.toString(e);
                            obje.get(gt).setCantidad(h);
                            gt=0;
                        }else{
                            System.out.println("el producto no existe en el inventario");
                        }
                        
                    break;
                case 6: System.out.println("las ganancias totales son: "+ganancia);
                    break; 
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=7);
        
    }
    
}
