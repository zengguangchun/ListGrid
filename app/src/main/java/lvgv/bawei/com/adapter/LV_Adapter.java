package lvgv.bawei.com.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import lvgv.bawei.com.listgrid.R;

/**
 * Created by asus on 2016/11/3.
 */
public class LV_Adapter extends BaseAdapter {
    private int[] images = {R.mipmap.gv1, R.mipmap.gv2, R.mipmap.gv3, R.mipmap.gv4, R.mipmap.gv5, R.mipmap.gv6, R.mipmap.gv7, R.mipmap.gv8, R.mipmap.gv9, R.mipmap.gv10, R.mipmap.gv11, R.mipmap.gv12, R.mipmap.gv13, R.mipmap.gv14};
    private String[] name = {"第四届对方的感受对方大范甘迪", "对方的感受范甘迪", "第四届对方的感范甘迪", "四届受对方大范甘迪", "第四届对方的感受对方大范甘迪", "第四届对方的感受范甘迪", "四对方的感受对方大范甘迪", "届对方的感受对方大范甘迪", "届对的感受对方大范甘迪", "第四届对方的感受对方大范甘迪", "第四届对方的感受对方大范甘迪", "第四届对方的感受对方大范甘迪", "第四届对方对方大范甘迪", "第感受对方大范甘迪"};
    private String[] tiem = {"2016-1-3", "2016-6-3", "2016-11-3", "2016-6-3", "2016-6-3", "2016-6-3", "作家协会", "2016-6-3", "2016-6-3", "2016-6-3", "作家协会", "美术协会", "作家协会", "美术协会"};
    private Context context;

    public LV_Adapter(Context context) {
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = View.inflate(context, R.layout.list_item, null);
        ImageView imageView = (ImageView) view1.findViewById(R.id.lv_image);
        TextView textView = (TextView) view1.findViewById(R.id.lv_tv1);
        TextView textView1 = (TextView) view1.findViewById(R.id.lv_tv2);
        imageView.setImageResource(images[i]);
        textView.setText(name[i]);
        textView1.setText(tiem[i]);
        return view1;
    }
}
