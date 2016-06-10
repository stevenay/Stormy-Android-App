package passion.com.stormy2;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.err_title)
                .setMessage(R.string.err_message)
                .setPositiveButton(R.string.err_ok_button_text, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
