package gr.vanderbox.roundedletterview_sampleapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import gr.vanderbox.roundedletterview_sampleapp.R;
import gr.vanderbox.roundedletterview_sampleapp.view.RoundedLetterView;


public class SampleAdapter extends BaseAdapter {

    private ArrayList<String> mEntries = new ArrayList<String>();
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public SampleAdapter(Context context, List<String> entries){
        this.mEntries = new ArrayList<String>(entries);
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return this.mEntries.size();
    }

    @Override
    public String getItem(int position) {
        return this.mEntries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder;

        if(convertView == null){
            mViewHolder = new ViewHolder();
            convertView = mLayoutInflater.inflate(R.layout.layout_list_view_item,parent,false);
            mViewHolder.mRoundedLetterView = (RoundedLetterView) convertView.findViewById(R.id.rlv_name_view);
            mViewHolder.mTextView = (TextView) convertView.findViewById(R.id.tv_name_holder);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        String item = getItem(position);

        if (item != null){
            mViewHolder.mTextView.setText(item);
            if(item.length() == 0){
                mViewHolder.mRoundedLetterView.setTitleText("A");
            }else{
                mViewHolder.mRoundedLetterView.setTitleText(item.substring(0,1).toUpperCase());
            }
            if(position%2 == 0){
                mViewHolder.mRoundedLetterView.setBackgroundColor(mContext.getResources().getColor(R.color.green));
            }else{
                mViewHolder.mRoundedLetterView.setBackgroundColor(mContext.getResources().getColor(R.color.red));
            }
        }

        return convertView;
    }

    private static class ViewHolder {
        private RoundedLetterView mRoundedLetterView;
        private TextView mTextView;
    }
}
