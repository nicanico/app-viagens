package br.senai.sp.jandira.activity_login.repository

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Email
import br.senai.sp.jandira.activity_login.dao.TripDb
import br.senai.sp.jandira.activity_login.model.User

class UserRepository(context: Context) {

    // banco
    private val db = TripDb.getDataBase(context)

    fun save(user: User): Long{
        return db.userDao().save(user)
    }

    fun findUserByEmail(email: String): User {
        return db.userDao().findUserByEmail(email)
    }

    fun authenticate(email: String, password: String): User{
        return db.userDao().authenticate(email, password)
}

}