package br.senai.sp.jandira.activity_login.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.activity_login.model.User

@Database(entities = [User::class], version = 1)

abstract class TripDb: RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object{

        private lateinit var instaceDb: TripDb

        fun getDataBase(context: Context): TripDb{

            // !true = false
            // !false = true
            if(!::instaceDb.isInitialized){
                instaceDb = Room
                    .databaseBuilder(
                        context,
                        TripDb::class.java,
                        "db_trip"
                    ).allowMainThreadQueries().build()

            }
                return instaceDb
        }
    }

}