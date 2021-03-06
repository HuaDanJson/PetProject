package cool.location.petproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cool.location.petproject.R;
import cool.location.petproject.base.BaseRVAdapter;
import cool.location.petproject.base.IViewHolder;
import cool.location.petproject.bean.VideoBean;

public class VideoAdapter extends BaseRVAdapter<VideoBean, VideoAdapter.VideoAdapterHolder> {

    @Override
    protected VideoAdapterHolder doCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new VideoAdapterHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_video_adapter, viewGroup, false));
    }

    @Override
    protected void bindItemData(VideoAdapterHolder viewHolder, VideoBean listener, int position) {
        viewHolder.bindView(listener, position);
    }

    public class VideoAdapterHolder extends RecyclerView.ViewHolder implements IViewHolder<VideoBean> {

        @BindView(R.id.tv_title_item_video)
        TextView mTitle;
        @BindView(R.id.tv_introduce_item_video)
        TextView mIntroduce;

        public VideoAdapterHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void bindView(VideoBean videoBean, int position) {
            mTitle.setText(videoBean.getTitle());
            mIntroduce.setText(videoBean.getIntroduce());
        }
    }
}

