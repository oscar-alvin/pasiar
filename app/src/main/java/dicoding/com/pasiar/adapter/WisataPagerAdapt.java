package dicoding.com.pasiar.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import dicoding.com.pasiar.R;

public class WisataPagerAdapt extends PagerAdapter {
    private Context context;
    private int[] itemWisata;

    public WisataPagerAdapt(Context context, int[] itemWisata){
        this.context = context;
        this.itemWisata = itemWisata;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.pager_item, null);
        ImageView itemWisata = view.findViewById(R.id.pager_itemImage);
        Glide.with(context).load(getImageAt(position)).into(itemWisata);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object == view;
    }
    private int getImageAt(int positition){
        switch (positition){
            case 0:
                return itemWisata[0];
            case 1:
                return itemWisata[1];
            case 2:
                return itemWisata[2];
                default:
                    return R.mipmap.ic_launcher;
        }
    }
}
