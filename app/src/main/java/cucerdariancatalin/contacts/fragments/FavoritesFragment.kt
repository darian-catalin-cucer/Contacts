package cucerdariancatalin.contacts.fragments

import android.content.Context
import android.util.AttributeSet
import com.simplemobiletools.commons.helpers.TAB_FAVORITES
import cucerdariancatalin.contacts.activities.MainActivity
import cucerdariancatalin.contacts.activities.SimpleActivity
import cucerdariancatalin.contacts.dialogs.SelectContactsDialog
import cucerdariancatalin.contacts.helpers.ContactsHelper

class FavoritesFragment(context: Context, attributeSet: AttributeSet) : MyViewPagerFragment(context, attributeSet) {
    override fun fabClicked() {
        finishActMode()
        showAddFavoritesDialog()
    }

    override fun placeholderClicked() {
        showAddFavoritesDialog()
    }

    private fun showAddFavoritesDialog() {
        SelectContactsDialog(activity!!, allContacts, true, false) { addedContacts, removedContacts ->
            ContactsHelper(activity as SimpleActivity).apply {
                addFavorites(addedContacts)
                removeFavorites(removedContacts)
            }

            (activity as? MainActivity)?.refreshContacts(TAB_FAVORITES)
        }
    }
}
