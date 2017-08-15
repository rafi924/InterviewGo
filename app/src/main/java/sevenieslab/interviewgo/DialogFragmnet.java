package sevenieslab.interviewgo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by hodan on 5/18/2017.
 */

public class DialogFragmnet extends DialogFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fragment, container);


        return view;
    }
    public static DialogFragmnet newInstance() {
        DialogFragmnet f = new DialogFragmnet();
        return f;
    }
      }

