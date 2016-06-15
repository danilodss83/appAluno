package Repository;

/**
 * Created by Danilo on 10/06/2016.
 */

import android.content.ContentValues;
import android.database.sqlite.*;

import Data.DataBase;
import Model.Disciplina;
import android.content.Context;

public class DisciplinaRepository {

    private SQLiteDatabase db;

    public DisciplinaRepository (Context context){

        this.db = new DataBase(context).getWritableDatabase();

    }



    public void insertDisciplinaRepository (Disciplina disciplina){

        ContentValues valores = new ContentValues();

        valores.put("nome", disciplina.getNome());


        this.db.insert("disciplina",null,valores);
    }


}
