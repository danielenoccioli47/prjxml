package it.fi.meucci;
import java.io.File;

import java.sql.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
/**
 * Hello world!
 *
 */
public class Main1 
{
    public static void main( String[] args ) throws Exception
    {
        Alunno primoAlunno = new Alunno("Daniele", "Noccioli",new Date(2004,2,7));
        Alunno secondoAlunno = new Alunno("Lorenzo", "Barzanti", new Date(2004, 10,11));
        Alunno terzoAlunno = new Alunno("non", "loso", new Date(2009,7, 8));
        Alunno quartoAlunno = new Alunno("loso", "non", new Date(2017, 4, 6));
        Classe laMiaClasse = new Classe("5BIA");
        laMiaClasse.addAlunno(primoAlunno);
        laMiaClasse.addAlunno(secondoAlunno);
        laMiaClasse.addAlunno(terzoAlunno);
        laMiaClasse.addAlunno(quartoAlunno);

        //serializzazione su file della mia lista(laMiaClasse)
        XmlMapper xmlMapper = new XmlMapper();  
        xmlMapper.writeValue(new File("classe.xml"), laMiaClasse);
    }
}
