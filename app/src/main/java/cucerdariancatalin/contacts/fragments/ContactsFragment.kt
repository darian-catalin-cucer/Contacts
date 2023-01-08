package cucerdariancatalin.contacts.fragments

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import com.simplemobiletools.commons.extensions.hideKeyboard
import cucerdariancatalin.contacts.activities.EditContactActivity
import cucerdariancatalin.contacts.activities.InsertOrEditContactActivity
import cucerdariancatalin.contacts.activities.MainActivity

class ContactsFragment(context: Context, attributeSet: AttributeSet) : MyViewPagerFragment(context, attributeSet) {
    override fun fabClicked() {
        activity?.hideKeyboard()
        Intent(context, EditContactActivity::class.java).apply {
            context.startActivity(this)
        }
    }

    override fun placeholderClicked() {
        if (activity is MainActivity) {
            (activity as MainActivity).showFilterDialog()
        } else if (activity is InsertOrEditContactActivity) {
            (activity as InsertOrEditContactActivity).showFilterDialog()
        }
    }
}
