package top.stores.vigerlankaapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class ContactActivity : AppCompatActivity() {
    private lateinit var name : EditText
    private lateinit var email : EditText
    private  lateinit var phoneNumber : EditText
    private  lateinit var contactMethod : CheckBox
    private  lateinit var message : EditText
    private lateinit var spinner : Spinner



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        name = findViewById(R.id.tvt_contact_name)
        email = findViewById(R.id.tv_contact_email)
        phoneNumber = findViewById(R.id.et_contact_phone_no)
        contactMethod = findViewById(R.id.cb__contact_method)

        message = findViewById(R.id.tv_contact_message_act)
        spinner = findViewById<Spinner>(R.id.spinner_select)

        val contactReason = resources.getStringArray(R.array.contact_reason)

        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, contactReason)
            spinner.adapter = adapter


        val sendBtn = findViewById<Button>(R.id.btn_contact_send)
        sendBtn.setOnClickListener {
            sendEmail(setSpinner(), name.text.toString(),email.text.toString(), phoneNumber.text.toString(),
                 contactMethod.text.toString(), message.text.toString() )
        }
      }
    }


     private fun sendEmail(subject : String, name : String, email : String, phoneNo : String,
                           contactMethodEmaail : String, messageTv : String ) {
         val recipient = "vigorlankapvtltd@gmail.com"
         val recepients : Array<String> = recipient.split(",").toTypedArray()
//         val subject = setSpinner()
//         val name = name.text.toString()
//         val email = email.text.toString()
//         val phoneNo = phoneNumber.text.toString()
//         val contactMethodEmaail = contactMethodEmail.text.toString()
//         val contactMethdPhone = contactMethodPhone.text.toString()
//         val message = message.text.toString()
         val message =
             "$name\n$email \n $phoneNo\n$contactMethodEmaail \n$messageTv"

         val intent : Intent = Intent(Intent.ACTION_SEND)
         intent.putExtra(Intent.EXTRA_EMAIL, recepients)
         intent.putExtra(Intent.EXTRA_SUBJECT, subject)
//         intent.putExtra(Intent.EXTRA_TEXT, name)
//         intent.putExtra(Intent.EXTRA_TEXT, email)
//         intent.putExtra(Intent.EXTRA_TEXT, phoneNo)
//         intent.putExtra(Intent.EXTRA_TEXT, contactMethodEmaail)
//         intent.putExtra(Intent.EXTRA_TEXT, contactMethdPhone)
         intent.putExtra(Intent.EXTRA_TEXT, message)

         intent.setType("message/rfc822")
        // intent.setType("text/plain");

         //startActivity(Intent.createChooser(intent, "Choose the email client."))

         try {
             startActivity(Intent.createChooser(intent, "Choose the email client."))
             finish()
             Log.i("Email", "")
         } catch (ex: ActivityNotFoundException) {
             Toast.makeText(
                 this@ContactActivity,
                 "There is no email client installed.",
                 Toast.LENGTH_SHORT
             ).show()
         }


     }




//    private fun sendEmail() {
//        val recipient = "vigorlankapvtltd@gmail.com"
//        val recepients : Array<String> = recipient.split(",").toTypedArray()
//         val subject = setSpinner()
//         val name = name.text.toString()
//         val email = email.text.toString()
//         val phoneNo = phoneNumber.text.toString()
//         val contactMethodEmaail = contactMethodEmail.text.toString()
//         val contactMethdPhone = contactMethodPhone.text.toString()
//         val message =
//             "$name \n $email \n $phoneNo \n contact method $contactMethodEmaail$contactMethdPhone"
//           " \n " +  message.text.toString()
//
//        val intent : Intent = Intent(Intent.ACTION_SEND)
//        intent.putExtra(Intent.EXTRA_EMAIL, recepients)
//        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
//        intent.putExtra(Intent.EXTRA_TEXT, name)
//        intent.putExtra(Intent.EXTRA_TEXT, email)
//        intent.putExtra(Intent.EXTRA_TEXT, phoneNo)
//        intent.putExtra(Intent.EXTRA_TEXT, contactMethodEmaail)
//        intent.putExtra(Intent.EXTRA_TEXT, contactMethdPhone)
//        intent.putExtra(Intent.EXTRA_TEXT, message)
//
//        intent.setType("message/rfc822")
//        // intent.setType("text/plain");
//
//        //startActivity(Intent.createChooser(intent, "Choose the email client."))
//
//        try {
//            startActivity(Intent.createChooser(intent, "Choose the email client."))
//            finish()
//            Log.i("Email", "")
//        } catch (ex: ActivityNotFoundException) {
//            Toast.makeText(
//                this@ContactActivity,
//                "There is no email client installed.",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//
//
//    }

    private fun setSpinner(): String{


        var contactReason = ""
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
               contactReason = getString(contactReason[1].toInt())
            }

            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
              contactReason = getString(contactReason[position].toInt())
            }
        }
        return contactReason
    }

}