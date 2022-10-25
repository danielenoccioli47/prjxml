package it.fi.meucci;
import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
/**
 * Hello world!
 *
 */
public class Main2 
{
    public static void main( String[] args ) throws Exception
    {
    
    XmlMapper xmlMapper2 = new XmlMapper(); 
    Classe classeDeserializzata = xmlMapper2.readValue(new File("classe.xml"), Classe.class);
    //System.out.println(classeDeserializzata.getAula());
    
    for(int i = 0; i < classeDeserializzata.getAlunni().size(); i++){
        System.out.println(classeDeserializzata.getAlunni().get(i).getNome());
    }
    
    }
}
