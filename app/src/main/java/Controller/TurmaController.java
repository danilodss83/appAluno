package Controller;

/**
 * Created by Danilo on 11/06/2016.
 */

import android.content.Context;
import android.database.sqlite.*;

import Data.DataBase;

public class TurmaController {

    private SQLiteDatabase db;
    private DataBase banco;

    public TurmaController(Context context){

        banco = new DataBase(context);

    }

/*
    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {banco.ID,banco.TITULO};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

}
*/



}
