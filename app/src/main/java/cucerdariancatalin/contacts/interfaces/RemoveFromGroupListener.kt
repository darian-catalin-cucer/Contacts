package cucerdariancatalin.contacts.interfaces

import cucerdariancatalin.contacts.models.Contact

interface RemoveFromGroupListener {
    fun removeFromGroup(contacts: ArrayList<Contact>)
}
