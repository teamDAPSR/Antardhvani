package antardhvani.du.ac.in.Rules;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import antardhvani.du.ac.in.antardhvani.R;

/**
 * Created by rajanmaurya on 14/2/15.
 */
public class Rules_antardhvani extends Fragment {
    private TextView textView;

    public static Rules_antardhvani getInstance(int position) {
        Rules_antardhvani myFragment = new Rules_antardhvani();
        Bundle args = new Bundle();
        args.putInt("position", position);
        myFragment.setArguments(args);
        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.rules_antardhvani, container, false);


        return layout;

    }

}