package com.wotin.practicemvvmpattern2

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.wotin.practicemvvmpattern2.room.Contact
import com.wotin.practicemvvmpattern2.room.ContactRepository

class ContactViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ContactRepository(application)
    private val contacts = repository.getAll()

    fun getAll(): LiveData<List<Contact>> = this.contacts

    fun insert(contact: Contact) { repository.insert(contact) }

    fun delete(contact: Contact){ repository.delete(contact) }
}