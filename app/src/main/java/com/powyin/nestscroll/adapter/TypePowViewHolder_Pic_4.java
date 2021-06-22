package com.powyin.nestscroll.adapter;

import android.app.Activity;
import android.view.ViewGroup;

import com.powyin.nestscroll.R;
import com.powyin.nestscroll.net.DataModel;
import com.powyin.scroll.adapter.AdapterDelegate;
import com.powyin.scroll.adapter.MultipleListAdapter;
import com.powyin.scroll.adapter.MultipleRecycleAdapter;
import com.powyin.scroll.adapter.PowViewHolder;

public class TypePowViewHolder_Pic_4 extends PowViewHolder<DataModel> {
    public TypePowViewHolder_Pic_4(Activity activity, ViewGroup viewGroup) {
        super(activity,viewGroup);
    }

    @Override
    protected int getItemViewRes() {
        return R.layout.view_holder_type_pic_4;
    }

    @Override
    protected boolean acceptData(DataModel data) {
        return data.type==3;
    }


    @Override
    public void loadData(AdapterDelegate<? super DataModel> multipleAdapter, DataModel data, int postion) {
        registerItemClick(R.id.content);
    }

    @Override
    protected boolean isEnableDragAndDrop() {
        return true;
    }

}
