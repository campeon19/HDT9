import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Controlador{

    BSTFactory factory = new BSTFactory();
    BSTBalance<String, String> arbol;
    
    ArrayList<String> oracion = new ArrayList<String>();

    public void escogerArbol(int opcion){
        
        arbol = factory.factory(opcion);

    }

    public void insetarPalabras(){

        try{
            File file = new File("Spanish.txt");

            if(!file.exists()) {
            file.createNewFile();
            }

		    FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            
            String linea = "";
			
			while((linea = breader.readLine()) != null) {

				String[] separar = linea.split(",");
                
                String uno = separar[0];
                String[] partes = uno.split(" ");
                String ingles = partes[0].replace(" ", "");
                String espanol = partes[1].replace(" ", "");
                arbol.put(ingles, espanol);
				
			}
			
			
			breader.close();
			reader.close();

        } catch (Exception e) {
			e.printStackTrace();
        }

    }

    public void obtenerOracion(){

        try{
            File file = new File("texto.txt");

            if(!file.exists()) {
            file.createNewFile();
            }

		    FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            
            String linea = "";
			
			while((linea = breader.readLine()) != null) {

				String[] separar = linea.split(" ");
                
                for(int i = 0; i< separar.length; i++){

                    String val = separar[i];
                    oracion.add(val);
                }
				
			}
			
			
			breader.close();
			reader.close();

        } catch (Exception e) {
			e.printStackTrace();
        }

    }

    public void traducirOracion(){

        for(int i = 0; i< oracion.size(); i++){

            String palabra = oracion.get(i).replace(" ", "").replace(",", "").replace(".", "");
            if(arbol.contains(palabra) == true){
                System.out.print(arbol.get(palabra) + " ");
            } else{
                System.out.print("*" + palabra + "");
            }
        }


    }

}