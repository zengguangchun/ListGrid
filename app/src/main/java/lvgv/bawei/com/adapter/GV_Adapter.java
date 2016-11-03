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
public class GV_Adapter extends BaseAdapter {
    private int[] images = {R.mipmap.gv1, R.mipmap.gv2, R.mipmap.gv3, R.mipmap.gv4, R.mipmap.gv5, R.mipmap.gv6, R.mipmap.gv7, R.mipmap.gv8, R.mipmap.gv9, R.mipmap.gv10, R.mipmap.gv11, R.mipmap.gv12, R.mipmap.gv13, R.mipmap.gv14};
    private String[] name = {"作家协会", "美术协会", "作家协会", "美术协会", "作家协会", "美术协会", "作家协会", "美术协会", "作家协会", "美术协会", "作家协会", "美术协会", "作家协会", "美术协会"};
    private Context context;

    public GV_Adapter(Context context) {
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
        View view1 = View.inflate(context, R.layout.grid_item, null);
        ImageView imageView = (ImageView) view1.findViewById(R.id.gv_image);
        TextView textView = (TextView) view1.findViewById(R.id.gr_tv);
        imageView.setImageResource(images[i]);
        textView.setText(name[i]);
        return view1;
    }
}
