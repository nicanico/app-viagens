package br.senai.sp.jandira.activity_login.dao

import androidx.room.*
import br.senai.sp.jandira.activity_login.model.User

@Dao
interface UserDao {

    @Insert
    // funcao que recebe usuario e retorna um long
    fun save(user: User): Long

    @Update
    // sempre devemos esperar 1 nesse caso
    fun update(user: User): Int

    @Delete
    fun delete(user: User): Int

    @Query("SELECT * FROM tbl_user WHERE email = :email")
    fun findUserByEmail(email: String): User

    @Query("SELECT * FROM tbl_user WHERE email = :email AND password = :password")
    fun authenticate(email: String, password: String): User
    // autenticador de 18 anos


}