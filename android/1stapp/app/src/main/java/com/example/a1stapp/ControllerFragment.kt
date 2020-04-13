package com.example.a1stapp

import android.content.ClipData
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.a1stapp.dummy.MyData
import kotlinx.android.synthetic.main.fragment_controller.*
import kotlinx.android.synthetic.main.fragment_controller.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ControllerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ControllerFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var display: TextView;
    lateinit var btnl: Button;
    lateinit var btnr: Button;
    lateinit var btn3: Button;
    lateinit var xwitch: Switch;
    lateinit var prog: ProgressBar;
    lateinit var edit: EditText;
    lateinit var radiog: RadioGroup;
    lateinit var imagev: ImageView;
    lateinit var seekb: SeekBar;
    lateinit var chkchinese: CheckBox;
    lateinit var chkmath: CheckBox;
    lateinit var chkenglish: CheckBox;
    lateinit var rateb: RatingBar;
    var yuwen:String=""
    var shuxue:String=""
    var yingyu:String=""
    private var root: View? = null   // create a global variable which will hold your layout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_controller, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


       // root = inflater.inflate(R.layout.fragment_controller, container, false)  // initialize it here

        //*==store data way
        //var shp=getPreferences(Context.MODE_PRIVATE)
        var s= MyData(context)
        s.number=5003;
        s.save()
        s.load();
        var k=s.number;
        Log.d("~~~~~~test~~~~~~~", "value:$k")

        //* stest
        var sfd=3;
        display=textView2
        btnl= button3
        btnr= button4
        btn3= button5
        xwitch= switch1
        prog= progressBar6
        edit= editText
        radiog= radioGroup
        imagev= imageView
        seekb= seekBar
        chkchinese= checkBox4
        chkmath= checkBox5
        chkenglish= checkBox6
        rateb= ratingBar
        btnl.setOnClickListener{
            display.text =getString(R.string.button1)
        }
        Log.d("=====================test===============",(display.id).toString())
        btnr.setOnClickListener{
            Log.d("=========button","click")
            display.text=getString(R.string.button2)

        }
        xwitch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ display.text="开"}else{display.text="关"}
        }
        btn3.setOnClickListener {
            var text=edit.text?.toString()
            if(text.isNullOrEmpty()){
                text="0";
            }
            prog.setProgress(text.toInt(),true)
            display.text=text
        }
        radiog.setOnCheckedChangeListener { _, checkedId ->
            if(checkedId==R.id.radioButton9)
                imagev.setImageResource(R.drawable.android)
            else
                imagev.setImageResource(R.drawable.apple)
        }
        seekb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                display.text=progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

                Toast.makeText(context,"start tracking",Toast.LENGTH_LONG)

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

                Toast.makeText(context,"stop tracking",Toast.LENGTH_LONG)
            }

        })

        chkchinese.setOnCheckedChangeListener { _, isChecked -> if(isChecked) yuwen="语文" else yuwen=""
            display.text=yuwen+shuxue+yingyu
        }
        chkmath.setOnCheckedChangeListener { _, isChecked -> if(isChecked) shuxue="数学" else shuxue=""
            display.text=yuwen+shuxue+yingyu}
        chkenglish.setOnCheckedChangeListener { _, isChecked -> if(isChecked) yingyu="英语" else shuxue=""
            display.text=yuwen+shuxue+yingyu }
        rateb.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(context,rating.toString()+"星评价!",Toast.LENGTH_LONG).show()
        }


    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ControllerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ControllerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
