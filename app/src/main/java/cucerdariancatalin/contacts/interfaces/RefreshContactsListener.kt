package cucerdariancatalin.contacts.interfaces

import cucerdariancatalin.contacts.models.Contact

interface RefreshContactsListener {
    fun refreshContacts(refreshTabsMask: Int)

    fun contactClicked(contact: Contact)
}
