package com.hackathon.decor.dialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.hackathon.decor.db.Tools;
import com.hackathon.decor.view.ItemTools;

public class ItemToolsDialog extends BottomSheetDialogFragment implements ItemTools {

    private long id = 0;

    public ItemToolsDialog(long id) {
        this.id = id;
    }

    public static ItemToolsDialog newInstance(long id) {
        ItemToolsDialog fragment = new ItemToolsDialog( id);
        return fragment;
    }

    @Override
    public void onResume() {
        super.onResume();
        if(id != 0){

        }
    }

    @Override
    public void getItemTools(Tools tools) {

    }
}
