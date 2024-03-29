package com.example.databindingtutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.databindingtutorial.databinding.DialogQuantityBinding;

public class ChooseQuantityDialog extends DialogFragment {
    
    private static final String TAG = "ChooseQuantityDialog";
    
    DialogQuantityBinding mBinding;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DialogQuantityBinding.inflate(inflater);
        mBinding.listView.setOnItemClickListener(mOnItemClickListener);
        mBinding.closeDialog.setOnClickListener(mCloseDialogListener);
        
        return mBinding.getRoot();
    }
    
    public AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i));
            IMainActivity iMainActivity = (IMainActivity)getActivity();
            iMainActivity.setQuantity(Integer.parseInt((String) adapterView.getItemAtPosition(i)));
            getDialog().dismiss();
        }
    };
    
    public View.OnClickListener mCloseDialogListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getDialog().dismiss();
        }
    };
}
