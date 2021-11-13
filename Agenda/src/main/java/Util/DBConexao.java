package Util;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class DBConexao { 

	private static ObjectContainer db;

	public static ObjectContainer GetConexao() {
			
		if(db == null)
		{
			db = Db4oEmbedded.openFile("C:\\temp\\Agenda.dat");
		}

		return db;
	}
		
	public static void Fechar()
	{
		db.close();
	}

}
//Onde é criado a coneção com o banco ele é meio sensivel é bom não mecher 
//A não esquesa de fechar obanco quando gravar algo para dar problema na pasta gerada por ele no C:\temp\Agenda.dat 
//casso der problema apague este aquivo neste local do seu computador C:\temp\Agenda.dat OK 
