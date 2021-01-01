package dev.tageda.example.testsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.show_text)
        textView.text = arguments?.getString(KEY_EXTRA_MESSAGE)
    }

    companion object {
        private const val KEY_EXTRA_MESSAGE = "extra_message"

        fun newInstance(message: String): SecondFragment {
            return SecondFragment().apply {
                arguments = bundleOf(KEY_EXTRA_MESSAGE to message)
            }
        }
    }
}